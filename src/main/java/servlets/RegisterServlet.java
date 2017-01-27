package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterServlet extends ForwardServlet
{
	private static final long serialVersionUID = -3267914113129509611L;
	
	private String name;
	private String surname;
	private String email;
	private String login;
	private String password;
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException
	{
		req.setCharacterEncoding("UTF-8");
		resp.setCharacterEncoding("UTF-8");
		
		name = req.getParameter("name");
		surname = req.getParameter("surname");
		email = req.getParameter("email");
		login = req.getParameter("loginReg");
		password = req.getParameter("passwordReg");
		
		if (req.getParameter("finishReg") != null)
		{
			super.forward("/index.jsp", req, resp);
		}
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException
	{
		super.doPost(req, resp);
	}

	
	// Геттеры и Сеттеры
	
	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getSurname()
	{
		return surname;
	}

	public void setSurname(String surname)
	{
		this.surname = surname;
	}

	public String getEmail()
	{
		return email;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}

	public String getLogin()
	{
		return login;
	}

	public void setLogin(String login)
	{
		this.login = login;
	}

	public String getPassword()
	{
		return password;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}
	
/*
	public boolean isNoNews()
	{
		return noNews;
	}

	public void setNoNews(boolean noNews)
	{
		this.noNews = noNews;
	}

	public boolean isLicenseDenied()
	{
		return licenseDenied;
	}

	public void setLicenseDenied(boolean licenseDenied)
	{
		this.licenseDenied = licenseDenied;
	}
*/
	
}

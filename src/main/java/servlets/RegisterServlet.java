package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import main.Main;
import models.Accounts;

public class RegisterServlet extends HttpServlet
{
	private static final long serialVersionUID = -3267914113129509611L;
	private String name;
	private String surname;
	private String email;
	private String login;
	private String password;
	public static Object objectToSave;
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException
	{
		System.out.println(11);
		req.setCharacterEncoding("UTF-8");
		resp.setCharacterEncoding("UTF-8");
		System.out.println(22);
		if (req.getParameter("finishReg") != null)
		{
			System.out.println(33);
			name = req.getParameter("name");
			surname = req.getParameter("surname");
			email = req.getParameter("email");
			login = req.getParameter("loginReg");
			password = req.getParameter("passwordReg");
			
			System.out.println(44);
			Accounts acc = new Accounts();
			acc.setName(name);
			acc.setSurname(surname);
			acc.setEmail(email);
			acc.setLogin(login);
			acc.setPassword(password);
			System.out.println(55);
			setObjectToSave(acc);
			System.out.println(Main.getB());
			Main.setB(true);
			System.out.println(Main.getB());
			System.out.println(66);
		}
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException
	{
		super.doPost(req, resp);
	}

	
	
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

	public static Object getObjectToSave()
	{
		return objectToSave;
	}

	public static void setObjectToSave(Object objectToSave)
	{
		RegisterServlet.objectToSave = objectToSave;
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

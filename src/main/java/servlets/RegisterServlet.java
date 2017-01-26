package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterServlet extends HttpServlet
{
	private static final long serialVersionUID = -1451723899712538224L;
	
	private static String name;
	private static String surname;
	private static String email;
	private static String login;
	private static String password;
	private static boolean noNews = true;
	private static boolean licenseDenied = true;

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
		noNews = req.getParameter("news") != null;
		licenseDenied = req.getParameter("license") != null;
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException
	{
		super.doPost(req, resp);
	}

// Setters and Getters block //////////////////////////////////////////////
	
	public static String getName()
	{
		return name;
	}

	public static void setName(String name)
	{
		RegisterServlet.name = name;
	}

	public static String getSurname()
	{
		return surname;
	}

	public static void setSurname(String surname)
	{
		RegisterServlet.surname = surname;
	}

	public static String getEmail()
	{
		return email;
	}

	public static void setEmail(String email)
	{
		RegisterServlet.email = email;
	}

	public static String getLogin()
	{
		return login;
	}

	public static void setLogin(String login)
	{
		RegisterServlet.login = login;
	}

	public static String getPassword()
	{
		return password;
	}

	public static void setPassword(String password)
	{
		RegisterServlet.password = password;
	}

	public static long getSerialversionuid()
	{
		return serialVersionUID;
	}
}

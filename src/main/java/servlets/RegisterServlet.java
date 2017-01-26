package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterServlet extends HttpServlet
{
	private static final long serialVersionUID = -1451723899712538224L;
	private static String name = "";
	private static String surname = "";
	private static String email = "";
	private static String login = "";
	private static String password = "";
	private static String birhday = "";
	private static boolean maleSex = true;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException
	{
		name = req.getParameter("name");
		surname = req.getParameter("surname");
		email = req.getParameter("email");
		login = req.getParameter("login");
		password = req.getParameter("password");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException
	{
		super.doPost(req, resp);
	}
	
	
}

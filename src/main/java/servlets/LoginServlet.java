package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Accounts;
import services.LoginService;

public class LoginServlet extends HttpServlet
{
	private static final long serialVersionUID = 8208184279338341072L;

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException
	{
		String loginLog = req.getParameter("loginLog");
		String passwordLog = req.getParameter("passwordLog");
		
		LoginService loginService = new LoginService();
		
		boolean result = loginService.authenticateAccount(loginLog, passwordLog);
		
		Accounts accounts = loginService.getAccountByLogin(loginLog);
		
		if (result == true)
		{
			req.getSession().setAttribute("accounts", accounts);
			resp.sendRedirect("accountPage.jsp");
		}
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException
	{
		super.doPost(req, resp);
	}
}

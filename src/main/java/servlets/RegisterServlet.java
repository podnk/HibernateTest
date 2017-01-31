package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Accounts;

public class RegisterServlet extends HttpServlet
{
	private static final long serialVersionUID = -3267914113129509611L;
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException
	{
		req.setCharacterEncoding("UTF-8");
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset=UTF-8");
		
		String name = req.getParameter("name");
		String surname = req.getParameter("surname");
		String email = req.getParameter("email");
		String loginReg = req.getParameter("loginReg");
		String passwordReg = req.getParameter("passwordReg");
		
		Accounts acc = new Accounts(name, surname, email, loginReg, passwordReg);
	}
}

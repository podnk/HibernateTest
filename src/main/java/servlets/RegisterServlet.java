package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Accounts;
import services.RegisterService;

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
		
		PrintWriter out = resp.getWriter();
		
		String name = req.getParameter("name");
		String surname = req.getParameter("surname");
		String email = req.getParameter("email");
		String loginReg = req.getParameter("loginReg");
		String passwordReg = req.getParameter("passwordReg");
		
		Accounts acc = new Accounts(name, surname, email, loginReg, passwordReg);
		
		try
		{
			RegisterService regService = new RegisterService();
			boolean result = regService.register(acc);
			
			out.println("<html>");
	         out.println("<head>");      
	         out.println("<title>Registration Successful</title>");    
	         out.println("</head>");
	         out.println("<body>");
	         out.println("<center>");
	         
	         if(result)
	         {
	             out.println("<h1>Регистрация прошла успешно!</h1>");
	             out.println("Чтобы войти в личный кабинет: <a href=index.jsp>Click here</a>");
	         }
	         else
	         {
	             out.println("<h1>Регистрация не удалась!</h1>");
	             out.println("Чтобы попробовать снова: <a href=registerPage.jsp>Click here</a>");
	         }
	         
	         out.println("</center>");
	         out.println("</body>");
	         out.println("</html>");
		}
		finally 
		{
			out.close();
		}
	}
}

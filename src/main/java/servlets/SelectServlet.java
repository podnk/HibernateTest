package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SelectServlet extends ForwardServlet
{
	private static final long serialVersionUID = -5826735542762688442L;
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException
	{
		if(request.getParameter("enter") != null)
		{
			super.forward("/accountPage.jsp", request, response);
		}
		else if (request.getParameter("register") != null)
		{
			super.forward("/registerPage.jsp", request, response);
		}
		else if (request.getParameter("finishReg") != null) 
		{
			super.forward("/regConfirm.jsp", request, response);
		}
	}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException
	{
		doPost(request, response);
	}

	
}


package com.shared.servlets;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Login")
public class Login extends HttpServlet
{
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException 
	{
		
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		if(email.equals("employee")&& password.equals("password")) 
		{
			HttpSession session = request.getSession(true);
			session.setAttribute("email", email);
			
			response.sendRedirect("employee.jsp");
		}
		else if(email.equals("customer")&& password.equals("password")) 
		{
			HttpSession session = request.getSession(true);
			session.setAttribute("email", email);
			
			response.sendRedirect("customer.jsp");
		}
		else
		{	
			response.sendRedirect("index.jsp");
		}
		
	}
	
	
}

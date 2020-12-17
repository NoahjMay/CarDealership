
//TODO need to make the back button not work (with the session id) 
//TODO need to fix the logic and make it not hard coded 

package com.may.sharedServlets;
import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Login")
public class Login extends HttpServlet
{
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException 
	{
		
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		if(email.equals("1")&& password.equals("2")) 
		{
			HttpSession session = request.getSession(true);
			session.setAttribute("email", email);
			
			response.sendRedirect("employee.jsp");
		}
		else if(email.equals("3")&& password.equals("4")) 
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
	
//	<servlet>
//	<servlet-name>Login</servlet-name>
//	<servlet-class>com.shared.servlets.Login</servlet-class>
//
//</servlet>
//
//<servlet-mapping>
//	<servlet-name>Login</servlet-name>
//	<url-pattern>/index</url-pattern>
//</servlet-mapping>
//
//<servlet>
//	<servlet-name>DisplayCars</servlet-name>
//	<servlet-class>com.shared.servlets.DisplayCars</servlet-class>
//
//</servlet>
//
//<servlet-mapping>
//	<servlet-name>DisplayCars</servlet-name>
//	<url-pattern>/employee</url-pattern>
//</servlet-mapping>
	
	
}

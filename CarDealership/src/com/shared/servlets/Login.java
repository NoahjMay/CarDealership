
//TODO need to make the back button not work (with the session id) 
//TODO need to fix the logic and make it not hard coded 

package com.shared.servlets;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.classes.CarOffer;
import com.classes.Customer;
import com.classes.Employee;
import com.classes.SaveLoadFile;

@WebServlet("/Login")
public class Login extends HttpServlet
{
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException 
	{  
		
		SaveLoadFile load = new SaveLoadFile();
		
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees = load.employeesLoad();
		
		ArrayList<Customer> customers = new ArrayList<Customer>();
		customers = load.customersLoad();
		
		
		try 
		{

			for (int index = 0; index < customers.size(); index++) 
			{
				Customer customer = customers.get(index);
				
				if(email.equals(customer.getEmailCustomer()) && password.equals(customer.getPasswordCustomer())) 
				{
					HttpSession session = request.getSession(true);
					session.setAttribute("email", email);
					
					response.sendRedirect("employee.jsp");
				}
				
			}
			
			for (int index = 0; index < employees.size(); index++) 
			{
				Employee employee = employees.get(index);
				
				if(email.equals(employee.getEmailEmployee()) && password.equals(employee.getPasswordEmployee())) 
				{
					HttpSession session = request.getSession(true);
					session.setAttribute("email", email);
					
					response.sendRedirect("customer.jsp");
				}
				
			}
			if(response.isCommitted() == false ) 
			{
				response.sendRedirect("index.jsp");
			}
			

		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
	}	
	
}

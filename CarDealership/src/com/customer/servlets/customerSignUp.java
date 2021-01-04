package com.customer.servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.classes.Customer;
import com.classes.SaveLoadFile;

/**
 * Servlet implementation class customerSignUp
 */
@WebServlet("/customerSignUp")
public class customerSignUp extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
       

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		HttpSession session = request.getSession(true);
		
		String phoneCustomer 	= request.getParameter("phoneCustomer");
		String signUpEmail 		= request.getParameter("signUpEmail");
		String signUpPassword 	= request.getParameter("signUpPassword");
		String signUpFirstName 	= request.getParameter("signUpFirstName");
		String signUpLastName	 = request.getParameter("signUpLastName");
		
		SaveLoadFile load = new SaveLoadFile();
		SaveLoadFile save = new SaveLoadFile();
		
		ArrayList<Customer> customers = new ArrayList<Customer>(); 	
		customers = load.customersLoad();

		if(signUpEmail != null && signUpPassword != null) 
		{
			Customer newCustomer = new Customer();

			boolean customerFound = true;
				
			for(int index = 0; index < customers.size(); index++) 
			{
				Customer customer = customers.get(index);
						
				if(customer.getEmailCustomer().toUpperCase().equals(signUpEmail.toUpperCase())) 
				{
					customerFound = true;
				}
				else 
				{
					customerFound = false;
				}
			}	
			if(customerFound == true) 
			{
				RequestDispatcher requestDispatcher = request.getRequestDispatcher("index.jsp");  
			    requestDispatcher.forward(request, response);
			}
			else 
			{
				newCustomer.setPhoneCustomer(phoneCustomer);
				newCustomer.setEmailCustomer(signUpEmail);
				newCustomer.setPasswordCustomer(signUpPassword);
				newCustomer.setFirstNameCustomer(signUpFirstName);
				newCustomer.setLastNameCustomer(signUpLastName);
				
				customers.add(newCustomer);
				save.customersSave(customers);
				session.setAttribute("email",signUpEmail);
				
				RequestDispatcher requestDispatcher = request.getRequestDispatcher("customer.jsp");  
			    requestDispatcher.forward(request, response);
			}
			
		}
		else 
		{
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("signUp.jsp");  
		    requestDispatcher.forward(request, response);
		}
	}

}

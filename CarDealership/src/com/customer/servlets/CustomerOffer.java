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

import com.classes.Car;
import com.classes.CarOffer;
import com.classes.Customer;
import com.classes.SaveLoadFile;

/**
 * Servlet implementation class CustomerOffer
 */
@WebServlet("/CustomerOffer")
public class CustomerOffer extends HttpServlet {
	private static final long serialVersionUID = 1L;
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		HttpSession session = request.getSession(true);
		
		String customerOffer = request.getParameter("customerOfferPrice");
		String customerCarVin = request.getParameter("customerOfferVin");
		String customerEmail = (String) session.getAttribute("email");
		
		SaveLoadFile save = new SaveLoadFile();
		SaveLoadFile load = new SaveLoadFile();
		

		ArrayList<Car>newCars = new ArrayList<Car>(); 
		newCars = load.newCarsLoad();
		
		ArrayList<Car> usedCars = new ArrayList<Car>(); 	
		usedCars = load.usedCarsLoad();

		ArrayList<CarOffer> carOffers = new ArrayList<CarOffer>(); 	
		carOffers = load.offersPlacedLoad();
		
		ArrayList<Customer> customers = new ArrayList<Customer>(); 	
		customers = load.customersLoad();
		

		if(customerOffer != null && customerCarVin != null) 
		{
			CarOffer carOffer = new CarOffer();
			
			carOffer.setOfferPrice(customerOffer);
			
			for(int index = 0; index < customers.size(); index++) 
			{
				Customer customer = customers.get(index);
				
				if(customer.getEmailCustomer().toUpperCase().equals(customerEmail.toUpperCase())) 
				{
					carOffer.setCustomer(customer);
					break;
				}
			
			
			}
			for(int index = 0; index < newCars.size(); index++) 
			{		
				Car car = newCars.get(index);

				if(car.getVin().toUpperCase().equals(customerCarVin.toUpperCase()) ) 
				{
					carOffer.setCustomerCarOffer(car);;
					newCars.remove(car);
					save.newCarsSave(newCars);
					break;
				}					
			}	
			for(int index = 0; index < usedCars.size(); index++) 
			{		
				Car car = usedCars.get(index);

				if(car.getVin().toUpperCase().equals(customerCarVin.toUpperCase()) ) 
				{
					carOffer.setCustomerCarOffer(car);;
					usedCars.remove(car);
					save.usedCarsSave(usedCars);
					break;
				}					
			}
			if(carOffer.getCustomer()!=null && carOffer.getCustomerCarOffer() != null) 
			{
				carOffers.add(carOffer);
				save.offersPlacedSave(carOffers);
			}
		}
				

		session.setAttribute("carOffers",carOffers); 
		session.setAttribute("newCars",newCars); 
		session.setAttribute("usedCars",usedCars);
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("customer.jsp");  
	    requestDispatcher.forward(request, response);
	}

}

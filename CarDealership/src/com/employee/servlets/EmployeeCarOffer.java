package com.employee.servlets;

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
 * Servlet implementation class CarOffer
 */
@WebServlet("/EmployeeCarOffer")
public class EmployeeCarOffer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		HttpSession session = request.getSession(true);
		
		String customerCarOfferVin = request.getParameter("offerVin").toUpperCase();
		boolean offerYesNo = Boolean.parseBoolean(request.getParameter("offerYesNo").toLowerCase());
		
		SaveLoadFile save = new SaveLoadFile();
		SaveLoadFile load = new SaveLoadFile();
		
		ArrayList<Car>newCars = new ArrayList<Car>(); 
		newCars = load.newCarsLoad();
		
		ArrayList<Car> usedCars = new ArrayList<Car>(); 	
		usedCars = load.usedCarsLoad();

		ArrayList<CarOffer> carOffers = new ArrayList<CarOffer>(); 	
		carOffers = load.offersPlacedLoad();
		
		ArrayList<CarOffer> soldCars = new ArrayList<CarOffer>(); 	
		soldCars = load.soldCarsLoad();	

		if(customerCarOfferVin != null && offerYesNo == true) 
		{

			for(int index = 0; index < carOffers.size(); index++) 
			{
				CarOffer soldCar = carOffers.get(index);
					
				if(soldCar.getCustomerCarOffer().getVin().toUpperCase().equals(customerCarOfferVin)) 
				{
					soldCars.add(soldCar);
					save.soldCarsSave(soldCars);
					
					carOffers.remove(soldCar);
					save.offersPlacedSave(carOffers);
					break;
				}
			}
		}
		else if(customerCarOfferVin != null && offerYesNo == false) 
		{

			for(int index = 0; index < carOffers.size(); index++) 
			{
				CarOffer carOffer = carOffers.get(index);
				
				Car car = carOffer.getCustomerCarOffer();
				
				if(car.isNew() == true) 
				{		
					newCars.add(car);
					save.newCarsSave(newCars);
					
					carOffers.remove(carOffer);
					save.offersPlacedSave(carOffers);
					break;
				}
				else if (car.isNew() == false) 
				{
					usedCars.add(car);
					save.usedCarsSave(usedCars);
					
					carOffers.remove(carOffer);
					save.offersPlacedSave(carOffers);
					break;
				}
				else 
				{
					break;
				}
			}
		}
		else 
		{
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("employee.jsp");  
		    requestDispatcher.forward(request, response);
		}			

		 
		session.setAttribute("newCars",newCars); 
		session.setAttribute("usedCars",usedCars);
		session.setAttribute("carOffers",carOffers);
		session.setAttribute("soldCars",soldCars);
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("employee.jsp");  
	    requestDispatcher.forward(request, response);	
	}

}







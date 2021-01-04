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
 * Servlet implementation class EmployeeBusinessReport
 */
@WebServlet("/EmployeeBusinessReport")
public class EmployeeBusinessReport extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		HttpSession session = request.getSession(true);
		
		String newCars = "NEW CARS REPORT | ";
		String usedCars = "USED CARS REPORT | ";
		String newUsedCars = "New And Used Cars Report | ";
		
		String listPriceString = "List Price Total: ";
		String soldPriceString = " | Sold Price Total: ";
		
		double listPriceTotal = 0.0d;
		double soldPriceTotal = 0.0d;
		
		boolean displayNewCarSales = Boolean.parseBoolean(request.getParameter("displayNewCarSales"));
		boolean displayUsedCarSales = Boolean.parseBoolean(request.getParameter("displayUsedCarSales"));
		
		SaveLoadFile load = new SaveLoadFile();
		
		ArrayList<CarOffer> businessReport = new ArrayList<CarOffer>();

		ArrayList<CarOffer> soldCars = new ArrayList<CarOffer>(); 	
		soldCars = load.soldCarsLoad();	

		if(displayNewCarSales == true && displayUsedCarSales == false)
		{
			for(int index = 0; index < soldCars.size(); index++) 
			{
				CarOffer soldCar = soldCars.get(index);
				
				if(soldCar.getCustomerCarOffer().isNew() == true) 
				{
					listPriceTotal += Float.parseFloat(soldCar.getOfferPrice());
					soldPriceTotal += Float.parseFloat(soldCar.getCustomerCarOffer().getPrice());
					
					businessReport.add(soldCar);
				}
			}
			session.setAttribute("businessReportTitle",newCars);		
			session.setAttribute("listPriceTotal",listPriceTotal);
			session.setAttribute("soldPriceTotal",soldPriceTotal);
			
		}
		else if(displayUsedCarSales == true && displayNewCarSales == false)
		{
			for(int index = 0; index < soldCars.size(); index++) 
			{
				CarOffer soldCar = soldCars.get(index);
				
				if(soldCar.getCustomerCarOffer().isNew() == false) 
				{
					listPriceTotal += Float.parseFloat(soldCar.getOfferPrice());
					soldPriceTotal += Float.parseFloat(soldCar.getCustomerCarOffer().getPrice());
					
					businessReport.add(soldCar);
				}
			}	
			session.setAttribute("businessReportTitle",usedCars);
			session.setAttribute("listPriceTotal",listPriceTotal);
			session.setAttribute("soldPriceTotal",soldPriceTotal);
		}
		else if(displayNewCarSales == true && displayUsedCarSales == true)
		{
			for(int index = 0; index < soldCars.size(); index++) 
			{
				CarOffer soldCar = soldCars.get(index);
			
					listPriceTotal += Float.parseFloat(soldCar.getOfferPrice());
					soldPriceTotal += Float.parseFloat(soldCar.getCustomerCarOffer().getPrice());
					
					businessReport.add(soldCar);
			}
			session.setAttribute("businessReportTitle",newUsedCars);
			session.setAttribute("listPriceTotal",listPriceTotal);
			session.setAttribute("soldPriceTotal",soldPriceTotal);

		}
		else 
		{
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("employee.jsp");  
		    requestDispatcher.forward(request, response);			
		}
		session.setAttribute("listPriceString",listPriceString);
		session.setAttribute("soldPriceString",soldPriceString);
		session.setAttribute("businessReport",businessReport); 
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("employee.jsp");  
	    requestDispatcher.forward(request, response);			
	}

}

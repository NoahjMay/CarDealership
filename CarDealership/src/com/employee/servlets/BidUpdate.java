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
import com.classes.SaveLoadFile;

/**
 * Servlet implementation class BidUpdate
 */
@WebServlet("/BidUpdate")
public class BidUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		HttpSession session = request.getSession(true);
		
		SaveLoadFile save = new SaveLoadFile();
		SaveLoadFile load = new SaveLoadFile();
		
		ArrayList<Car>newCars = new ArrayList<Car>(); 
		newCars = load.newCarsLoad();
		
		ArrayList<Car> usedCars = new ArrayList<Car>(); 	
		usedCars = load.usedCarsLoad();
		
		for(int index = 0; index < newCars.size(); index++) 
		{
			
			Car car = newCars.get(index);
			if(car.getVin().equals(request.getParameter("bidableVin"))) 
			{
				car.setBidable(Boolean.parseBoolean(request.getParameter("bidToggle")));
				save.newCarsSave(newCars);
			}		
		}
		
		for(int index = 0; index < usedCars.size(); index++) 
		{
			
			Car car = usedCars.get(index);
			if(car.getVin().equals(request.getParameter("bidableVin"))) 
			{
				car.setBidable(Boolean.parseBoolean(request.getParameter("bidToggle")));
				save.usedCarsSave(usedCars);
			}	
			
		}
		
		session.setAttribute("newCars",newCars); 
		session.setAttribute("usedCars",usedCars);
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("employee.jsp");  
	    requestDispatcher.forward(request, response);
		
	}

}

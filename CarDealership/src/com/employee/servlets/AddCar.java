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
 * Servlet implementation class AddCar
 */
@WebServlet("/AddCar")
public class AddCar extends HttpServlet {
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

		Car newCar = new Car();
		
		newCar.setImage(request.getParameter("image"));
		newCar.setDescription(request.getParameter("description"));
		newCar.setMake(request.getParameter("make"));
		newCar.setModel(request.getParameter("model"));
		newCar.setYear(request.getParameter("year"));
		newCar.setTrim(request.getParameter("trim"));
		newCar.setColor(request.getParameter("color"));
		newCar.setDoors(request.getParameter("doors"));
		newCar.setMpg(request.getParameter("mpg"));
		newCar.setVin(request.getParameter("vin"));
		newCar.setMiles(request.getParameter("miles"));
		newCar.setPrice(request.getParameter("price"));	
		newCar.setDaysOnLot(request.getParameter("daysOnLot"));
		newCar.setBidable(Boolean.parseBoolean(request.getParameter("bidable")));
		newCar.setNew(Boolean.parseBoolean(request.getParameter("isNew")));
		

		if(newCar.isNew() == true) 
		{
			boolean newVinFound = true;
			
			for(int index = 0; index < newCars.size(); index++) 
			{		
				Car car = newCars.get(index);
				
				
				
				if(newCar.getVin().equals(car.getVin())) 
				{				
					newVinFound = true;
					break;
				}else newVinFound = false;
							
			}	
			if(newVinFound == false) 
			{
				newCars.add(newCar);
				save.newCarsSave(newCars);
			}
		}
		
		if(newCar.isNew() == false) 
		{
			boolean usedVinFound = true;
			
			for(int index = 0; index < usedCars.size(); index++) 
			{		
				Car car = usedCars.get(index);
				
				
				
				if(newCar.getVin().equals(car.getVin())) 
				{				
					usedVinFound = true;
					break;
				}else usedVinFound = false;
						
			}	
			if(usedVinFound == false) 
			{
				usedCars.add(newCar);
				save.usedCarsSave(usedCars);
			}
		}

		session.setAttribute("newCars",newCars); 
		session.setAttribute("usedCars",usedCars);
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("employee.jsp");  
	    requestDispatcher.forward(request, response);
		
	}

}

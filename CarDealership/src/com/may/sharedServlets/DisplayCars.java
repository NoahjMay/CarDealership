package com.may.sharedServlets;

import java.io.IOException;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.may.classes.Car;

@WebServlet("/DisplayCars")
public class DisplayCars extends HttpServlet 
{	
	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException  
	{
		String make 		= "chevy";
		String model		= "colorado";
		String year			= "2006";
		String trim			= "ls";
		String color		= "yellow";
		String doors		= "two door";
		String vin			= "hdsfkjhdkjhfuhuh+6565455+4565+";
		String bob 			= "bob";
		
		int daysOnLot		= 20;
				
		boolean isBidable	= false;
		boolean isNew		= false;
		boolean isUsed		= true;
		
		List<Car> newCars = Arrays.asList(new Car(make, model, year, trim, color, doors, vin, daysOnLot, 
				isBidable, isNew, isUsed));
		List<Car> usedCars = Arrays.asList(new Car(make, model, year, trim, color, doors, vin, daysOnLot, 
				isBidable, isNew, isUsed));
		
		request.setAttribute("bob", bob);
		request.setAttribute("usedCars", usedCars);
		request.setAttribute("newCars", newCars);
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("employee.jsp");

		requestDispatcher.forward(request, response);

	
		
	}
	  

	 
	
}

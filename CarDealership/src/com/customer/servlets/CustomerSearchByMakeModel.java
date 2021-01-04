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
import com.classes.SaveLoadFile;
import com.classes.Search;

/**
 * Servlet implementation class CustomerSearchByMakeModel
 */
@WebServlet("/CustomerSearchByMakeModel")
public class CustomerSearchByMakeModel extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		HttpSession session = request.getSession(true);
		
		SaveLoadFile load = new SaveLoadFile();
		
		ArrayList<Car>newCars = new ArrayList<Car>(); 
		newCars = load.newCarsLoad();
		
		ArrayList<Car> usedCars = new ArrayList<Car>(); 	
		usedCars = load.usedCarsLoad();
		
		ArrayList<Car> foundNewCars = new ArrayList<Car>();
		ArrayList<Car> foundUsedCars = new ArrayList<Car>();
		
		Search makeSearch = new Search();
		Search modelSearch = new Search();
			
		if(request.getParameter("customerSearchMake") != null) 
		{
			foundNewCars = makeSearch.searchByMake(newCars, request.getParameter("customerSearchMake"));
		}
		if(request.getParameter("customerSearchModel") != null) 
		{
			foundNewCars = modelSearch.searchByModel(foundNewCars, request.getParameter("customerSearchModel"));
		}
		if(foundNewCars != null) 
		{
			session.setAttribute("newCars",foundNewCars);
		}
		
		if(request.getParameter("customerSearchMake") != null) 
		{
			foundUsedCars = makeSearch.searchByMake(usedCars, request.getParameter("customerSearchMake"));
		}
		if(request.getParameter("customerSearchModel") != null) 
		{
			foundUsedCars = modelSearch.searchByModel(foundUsedCars, request.getParameter("customerSearchModel"));
		}
		if(foundNewCars != null) 
		{
			session.setAttribute("usedCars",foundUsedCars);
		}

		RequestDispatcher requestDispatcher = request.getRequestDispatcher("customer.jsp");  
	    requestDispatcher.forward(request, response);

	}

}

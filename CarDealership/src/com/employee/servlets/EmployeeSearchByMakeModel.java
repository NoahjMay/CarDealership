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
import com.classes.Search;

/**
 * Servlet implementation class EmployeeNewSearchByMakeModel
 */
@WebServlet("/EmployeeSearchByMakeModel")
public class EmployeeSearchByMakeModel extends HttpServlet {
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
			
		foundNewCars = makeSearch.searchByMake(newCars, request.getParameter("searchMake"));
		foundNewCars = modelSearch.searchByModel(foundNewCars, request.getParameter("searchModel"));
		session.setAttribute("newCars",foundNewCars);
	
		foundUsedCars = makeSearch.searchByMake(usedCars, request.getParameter("searchMake"));
		foundUsedCars = modelSearch.searchByModel(foundUsedCars, request.getParameter("searchModel"));
		session.setAttribute("usedCars",foundUsedCars);

		RequestDispatcher requestDispatcher = request.getRequestDispatcher("employee.jsp");  
	    requestDispatcher.forward(request, response);
		
	}

}

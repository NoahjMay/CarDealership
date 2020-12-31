//package com.employee.servlets;
//
//
//import java.io.IOException;
//import java.util.ArrayList;
//
//import javax.servlet.RequestDispatcher;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
//
//import com.classes.Car;
//import com.classes.CarDataForSelectList;
//import com.classes.SaveLoadFile;
//import com.classes.Search;
//
//
///**
// * Servlet implementation class AddCars
// */
//@WebServlet("/EmployeeUpdateCars")
//public class EmployeeUpdateCars extends HttpServlet {
//	private static final long serialVersionUID = 1L; 
//
//	/**
//	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
//	 */
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
//	{
//		HttpSession session = request.getSession(true);
//	
//		ArrayList<Car> newCarsByMake = new ArrayList<Car>();
//		ArrayList<Car> newCarsByModel = new ArrayList<Car>();
//		
//		ArrayList<Car> usedCarsByMake = new ArrayList<Car>();
//		ArrayList<Car> usedCarsByModel = new ArrayList<Car>();
//			
//		CarDataForSelectList makeList = new CarDataForSelectList();
//		
//		SaveLoadFile save = new SaveLoadFile();
//		SaveLoadFile load = new SaveLoadFile();
//		
//		Search newSearch = new Search();
//		Search usedSearch = new Search();
//		
//		@SuppressWarnings("unchecked")
//		ArrayList<String> manufacturers = (ArrayList<String>)session.getAttribute("manufacturers"); 
//		manufacturers = makeList.listMake();
//		
//		if(manufacturers==null) 
//		{
//			manufacturers = new ArrayList<String>();
//		}
//
//		@SuppressWarnings("unchecked")
//		ArrayList<Car>newCars = (ArrayList<Car>)session.getAttribute("newCar"); 
//		newCars = load.newCarsLoad();
//		
//		if(newCars==null) 
//		{
//			newCars = new ArrayList<Car>();
//		}
//		
//		@SuppressWarnings("unchecked")
//		ArrayList<Car> usedCars = (ArrayList<Car>)session.getAttribute("usedCar"); 
//		usedCars = load.usedCarsLoad();
//		
//		if(usedCars==null) 
//		{
//			usedCars = new ArrayList<Car>();
//		}
//		
		

		

		
		
		//String newSearchMake = request.getParameter("searchByNewMake");
		//String usedSearchMake = request.getParameter("searchByUsedMake");
		
		
		
//		if( newSearchMake != null || newSearchMake != "searchByMake") 
//		{
//			
//			searchNewCars = newSearch.searchByMake(newCars, newSearchMake);			
//		}
		
		
//searchNewCars ;
//searchUsedCars;
		
//
//		session.setAttribute("manufacturers",manufacturers);
//		session.setAttribute("newCars",newCars); 
//		session.setAttribute("usedCars",usedCars);
//
//		RequestDispatcher requestDispatcher = request.getRequestDispatcher("employee.jsp");  
//	    requestDispatcher.forward(request, response);
//	}
//
//}

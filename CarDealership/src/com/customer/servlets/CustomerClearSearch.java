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
import com.classes.CarDataForSelectList;
import com.classes.SaveLoadFile;

/**
 * Servlet implementation class CustomerClearSearch
 */
@WebServlet("/CustomerClearSearch")
public class CustomerClearSearch extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		HttpSession session = request.getSession(true);  
		
		CarDataForSelectList makeList = new CarDataForSelectList();
		
		SaveLoadFile load = new SaveLoadFile();

		ArrayList<String> manufacturers = new ArrayList<String>();
		manufacturers = makeList.listMake();
		
		ArrayList<Car>newCars = new ArrayList<Car>();
		newCars = load.newCarsLoad();

		ArrayList<Car> usedCars = new ArrayList<Car>(); 
		usedCars = load.usedCarsLoad();
		
		
		session.setAttribute("manufacturers",manufacturers); 
		session.setAttribute("newCars",newCars); 
		session.setAttribute("usedCars",usedCars);
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("customer.jsp");  
	    requestDispatcher.forward(request, response);	

	}
}

package com.shared.servlets;

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

/**
 * Servlet implementation class newCars
 */
@WebServlet("/DisplayCars")
public class DisplayCars extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DisplayCars() 
    {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{	
		HttpSession session = request.getSession(true);  
		
		ArrayList<Car>newCars = (ArrayList<Car>)session.getAttribute("newCar"); 
		
		if(newCars==null) 
		{
			newCars = new ArrayList<Car>();
		}
		
		ArrayList<Car>usedCars = (ArrayList<Car>)session.getAttribute("usedCar"); 
		
		if(usedCars==null) 
		{
			usedCars = new ArrayList<Car>();
		}
		
		Car mazda = new Car("Mazda", "Miata", "2020", "MX-5", "White", "2 door", "27 mpg",
				"vs623345863", "2 miles", "26580$$", 100, false, true);
		
		Car chevy = new Car("Chevy", "colorado", "2006", "LS", "yellow", "2 door", "23 mpg",
				"nsd6328587741s", "1020000 miles", "5000$", 5, false, false);
		
		Car ford = new Car("Ford", "bronco", "2020", "sport", "yellow", "2 door", "23 mpg",
				"5s42528587741s", "5 miles", "28650$", 120, false, true);
		
		Car dodge = new Car("Dodge", "charger", "2014", "boss", "lime-green", "2 door", "23 mpg",
				"nsd636401", "20 miles", "50000$", 575, true, true);

		
		newCars.add(mazda);
		newCars.add(ford);
		newCars.add(dodge);
		
		usedCars.add(chevy);
		usedCars.add(chevy);
		usedCars.add(chevy);
		usedCars.add(chevy);
		
		session.setAttribute("newCars",newCars); 
		session.setAttribute("usedCars",usedCars);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
//		HttpSession session = request.getSession(true);  
//		
//		ArrayList<Car>newCars = (ArrayList<Car>)session.getAttribute("newCar"); 
//		
//		if(newCars==null) 
//		{
//			newCars = new ArrayList<Car>();
//		}
//		
//		ArrayList<Car>usedCars = (ArrayList<Car>)session.getAttribute("usedCar"); 
//		
//		if(usedCars==null) 
//		{
//			usedCars = new ArrayList<Car>();
//		}
//		
//		Car mazda = new Car("Mazda", "Miata", "2020", "MX-5", "White", "2 door", "27 mpg",
//				"vs623345863", "2 miles", "26580$$", 100, false, true);
//		
//		Car chevy = new Car("Chevy", "colorado", "2006", "LS", "yellow", "2 door", "23 mpg",
//				"nsd6328587741s", "1020000 miles", "5000$", 5, false, false);
//		
//		Car ford = new Car("Ford", "bronco", "2020", "sport", "yellow", "2 door", "23 mpg",
//				"5s42528587741s", "5 miles", "28650$", 120, false, true);
//		
//		Car dodge = new Car("Dodge", "charger", "2014", "boss", "lime-green", "2 door", "23 mpg",
//				"nsd636401", "20 miles", "50000$", 575, true, true);
//
//		
//		newCars.add(mazda);
//		newCars.add(ford);
//		newCars.add(dodge);
//		
//		usedCars.add(chevy);
//		usedCars.add(chevy);
//		usedCars.add(chevy);
//		usedCars.add(chevy);
//		
//		session.setAttribute("newCars",newCars); 
//		session.setAttribute("usedCars",usedCars);  
		
	     //RequestDispatcher rdNewCars = request.getRequestDispatcher("newCars.jsp");  
	     //rdNewCars.forward(request, response);
	     
	     //RequestDispatcher rdUsedCars = request.getRequestDispatcher("usedCars.jsp");  
	     //rdUsedCars.forward(request, response);
	     
	 	//<a href="/newCars.jsp"> New Cars</a> 
		//<a href="/usedCars.jsp"> Used Cars</a>
	    // <jsp:include page="/newCars.jsp"/>
	 	//<jsp:include page="/usedCars.jsp"/>
	}

}

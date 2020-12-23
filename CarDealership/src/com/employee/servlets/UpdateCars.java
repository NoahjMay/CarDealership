package com.employee.servlets;

import java.io.File;
import java.io.FileWriter;
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
 * Servlet implementation class AddCars
 */
@WebServlet("/UpdateCars")
public class UpdateCars extends HttpServlet {
	private static final long serialVersionUID = 1L;

       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateCars() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(true); 
		
		SaveLoadFile save = new SaveLoadFile();
		SaveLoadFile load = new SaveLoadFile();
		
		@SuppressWarnings("unchecked")
		ArrayList<Car>newCars = (ArrayList<Car>)session.getAttribute("newCar"); 
		
		if(newCars==null) 
		{
			newCars = new ArrayList<Car>();
		}
		
		@SuppressWarnings("unchecked")
		ArrayList<Car>usedCars = (ArrayList<Car>)session.getAttribute("usedCar"); 
		
		if(usedCars==null) 
		{
			usedCars = new ArrayList<Car>();
		}
		

		
		Car mazda = new Car("Mazda", "Miata", "2020", "MX-5", "White", "2 door", "27 mpg",
				"vs623345863", "2 miles", "26580$$", "100", false, true);
		
		Car chevy = new Car("Chevy", "colorado", "2006", "LS", "yellow", "2 door", "23 mpg",
				"nsd6328587741s", "1020000 miles", "5000$", "5", false, false);
		
		Car ford = new Car("Ford", "bronco", "2020", "sport", "yellow", "2 door", "23 mpg",
				"5s42528587741s", "5 miles", "28650$", "120", false, true);
		
		Car dodge = new Car("Dodge", "charger", "2014", "boss", "lime-green", "2 door", "23 mpg",
				"nsd636401", "20 miles", "50000$", "575", true, true);

		
		newCars.add(mazda);
		newCars.add(ford);
		newCars.add(dodge);
		
		usedCars.add(chevy);
		usedCars.add(chevy);
		usedCars.add(chevy);
		usedCars.add(chevy);
		
		
		for(int index = 0; index < newCars.size(); index++) 
		{
			
			Car car = newCars.get(index);
			if(car.getVin().equals(request.getParameter("bidableVin"))) 
			{
				car.setBidable(Boolean.parseBoolean(request.getParameter("bidToggle")));
			}		
		}
		
		for(int index = 0; index < usedCars.size(); index++) 
		{
			
			Car car = usedCars.get(index);
			if(car.getVin().equals(request.getParameter("bidableVin"))) 
			{
				car.setBidable(Boolean.parseBoolean(request.getParameter("bidToggle")));
			}		
		}
		
		System.out.println(mazda.isBidable());
		
		Car newCar = new Car();
		
		//boolean isNew = Boolean.parseBoolean();
		
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
		newCar.setNew(Boolean.parseBoolean(request.getParameter("isNew")));
		
		if(newCar.isNew()== true) 
		{
			newCars.add(newCar);
			save.newCarsSave(newCars);
		}
		else {
			usedCars.add(newCar);
			save.usedCarsSave(usedCars);
		}
		

		
		session.setAttribute("newCars",newCars); 
		session.setAttribute("usedCars",usedCars);
		
		 RequestDispatcher requestDispatcher = request.getRequestDispatcher("employee.jsp");  
	     requestDispatcher.forward(request, response);
	}

}

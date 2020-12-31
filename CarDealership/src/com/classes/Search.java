package com.classes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Search 
{

	public ArrayList<Car> searchByMake(ArrayList<Car> Cars, String make)  
	{
		ArrayList<Car> foundCars = new ArrayList<Car>();
		
		for(int index = 0; index < Cars.size(); index++) 
		{		
			Car car = Cars.get(index);
			
			if(car.getMake().equals(make)) 
			{				
				foundCars.add(car);
			}		
		}
		
		return foundCars;
	}
	
	public ArrayList<Car> searchByModel(ArrayList<Car> Cars, String model) 
	{
		ArrayList<Car> foundCars = new ArrayList<Car>();
		
		for(int index = 0; index < Cars.size(); index++) 
		{		
			Car car = Cars.get(index);
			
			if(car.getModel().equals(model)) 
			{				
				foundCars.add(car);
			}		
		}
		
		return foundCars;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

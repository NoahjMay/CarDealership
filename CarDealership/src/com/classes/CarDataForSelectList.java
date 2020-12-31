package com.classes;

import java.util.ArrayList;

public class CarDataForSelectList 
{

	
	public ArrayList<String> listMake() 
	{
		String manufacturerlist[] = 
			{						
										"Abarth","Alfa Romeo","Aston Martin",
										"Audi","Bentley","BMW",
										"Bugatti","Cadillac","Chevrolet",
										"Chrysler","Citroën","Dacia",
										"Daewoo","Daihatsu","Dodge",
										"Donkervoort","DS","Ferrari",
										"Fiat","Fisker","Ford",
										"Honda","Hummer","Hyundai",
										"Infiniti","Iveco","Jaguar",
										"Jeep","Kia","KTM",
										"Lada","Lamborghini","Lancia",
										"Land Rover","Landwind","Lexus",
										"Lotus","Maserati","Maybach",
										"Mazda","McLaren","Mercedes-Benz",
										"MG","Mini","Mitsubishi",
										"Morgan","Nissan","Opel",
										"Peugeot","Porsche","Renault",
										"Rolls-Royce","Rover","Saab",
										"Seat","Skoda","Smart",
										"SsangYong","Subaru","Suzuki",
										"Tesla","Toyota","Volkswagen",
										"Volvo"
			};
			
			ArrayList<String> manufacturers = new ArrayList<String>();
			for(int index = 0; index < manufacturerlist.length; index++) 
			{
				manufacturers.add(manufacturerlist[index]);
			}
			return manufacturers;
	}
	
	
	
	
	
	
	
}

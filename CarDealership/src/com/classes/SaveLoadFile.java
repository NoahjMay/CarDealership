package com.classes;

import java.io.*;

import java.util.*;


public class SaveLoadFile 
{
	public void customersSave(ArrayList<Customer> customers) 
	{
		try 
		{
			File customersFile = new File("customersFile.txt");
			FileWriter customersFileWriter = new FileWriter(customersFile);

			for (int index = 0; index < customers.size(); index++) 
			{
				Customer customer = customers.get(index);

				customersFileWriter.write(	customer.getPhoneCustomer()		+ ", " + customer.getEmailCustomer() 		+ ", " + 
											customer.getPasswordCustomer()	+ ", " + customer.getFirstNameCustomer()	+ ", " + 
											customer.getLastNameCustomer()  + "\n");
			}

			customersFileWriter.close();

		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}

	}
	
	public ArrayList<Customer> customersLoad() 
	{
		ArrayList<Customer> customers = new ArrayList<Customer>();
		try 
		{
			File customersFile = new File("customersFile.txt");
			if(customersFile.canRead()) 
			{
				Scanner fileScanner = new Scanner(customersFile);
				
				while (fileScanner.hasNext()) 
				{
					Customer customer = new Customer();
					
					String data[] = fileScanner.nextLine().split(", ");

					customer.setPhoneCustomer(data[0].trim());
					customer.setEmailCustomer(data[1].trim());
					customer.setPasswordCustomer(data[2].trim());
					customer.setFirstNameCustomer(data[3].trim());
					customer.setLastNameCustomer(data[4].trim());
					
					customers.add(customer);
				}
				fileScanner.close();
			}
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		return customers;
	}
	
	public ArrayList<Employee> employeesLoad() 
	{
		ArrayList<Employee> employees = new ArrayList<Employee>();
		try 
		{
			File employeeFile = new File("employeeFile.txt");
			if(employeeFile.canRead()) 
			{
				Scanner fileScanner = new Scanner(employeeFile);
				
				while (fileScanner.hasNext()) 
				{
					Employee employee = new Employee();
					
					String data[] = fileScanner.nextLine().split(", ");

					employee.setPhoneEmployee(data[0].trim());
					employee.setEmailEmployee(data[1].trim());
					employee.setPasswordEmployee(data[2].trim());
					employee.setFirstNameEmployee(data[3].trim());
					employee.setLastNameEmployee(data[4].trim());
					
					employees.add(employee);
				}
				fileScanner.close();
			}
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		return employees;
	}


	public void newCarsSave(ArrayList<Car> newCars) 
	{
		try 
		{
			File newCarsFile = new File("newCarsFile.txt");
			FileWriter newCarsWriter = new FileWriter(newCarsFile);

			for (int index = 0; index < newCars.size(); index++) 
			{
				Car car = newCars.get(index);

				newCarsWriter.write(car.getImage()		+ ", " + car.getDescription()	+ ", " + car.getMake()	+ ", " + car.getModel() + ", " +
									car.getYear() 		+ ", " + car.getTrim() 			+ ", " + car.getColor() + ", " + car.getDoors() + ", " + 
									car.getMpg() 		+ ", " + car.getVin()			+ ", " + car.getMiles() + ", " + car.getPrice() + ", " + 
									car.getDaysOnLot() 	+ ", " + car.isBidable() 		+ ", " + car.isNew() 	+ "\n");
			}

			newCarsWriter.close();

		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}

	}

	public ArrayList<Car> newCarsLoad() 
	{
		ArrayList<Car> newCars = new ArrayList<Car>();
		try 
		{
			File newCarsFile = new File("newCarsFile.txt");
			if(newCarsFile.canRead()) 
			{
				Scanner fileScanner = new Scanner(newCarsFile);

				

				while (fileScanner.hasNext()) 
				{
					Car car = new Car();
					
					String data[] = fileScanner.nextLine().split(", ");

					car.setImage(data[0].trim());
					car.setDescription(data[1].trim());
					car.setMake(data[2].trim());
					car.setModel(data[3].trim());
					car.setYear(data[4].trim());
					car.setTrim(data[5].trim());
					car.setColor(data[6].trim());
					car.setDoors(data[7].trim());
					car.setMpg(data[8].trim());
					car.setVin(data[9].trim());
					car.setMiles(data[10].trim());
					car.setPrice(data[11].trim());
					car.setDaysOnLot(data[12].trim());
					car.setBidable(Boolean.parseBoolean(data[13].trim()));
					car.setNew(Boolean.parseBoolean(data[14].trim()));

					newCars.add(car);
				}
				fileScanner.close();
			}
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		return newCars;
	}

	public void usedCarsSave(ArrayList<Car> usedCars) 
	{
		try 
		{
			File usedCarsFile = new File("usedCarsFile.txt");

			FileWriter usedCarsWriter = new FileWriter(usedCarsFile);

			for (int index = 0; index < usedCars.size(); index++) 
			{
				Car car = usedCars.get(index);

				usedCarsWriter.write(car.getImage()		+ ", " + car.getDescription()	+ ", " + car.getMake()	+ ", " + car.getModel() + ", " +
									 car.getYear() 		+ ", " + car.getTrim() 			+ ", " + car.getColor() + ", " + car.getDoors() + ", " + 
									 car.getMpg() 		+ ", " + car.getVin()			+ ", " + car.getMiles() + ", " + car.getPrice() + ", " + 
									 car.getDaysOnLot() + ", " + car.isBidable() 		+ ", " + car.isNew() 	+ "\n");
			}

			usedCarsWriter.close();

		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}

	}

	public ArrayList<Car> usedCarsLoad() 
	{
		ArrayList<Car> usedCars = new ArrayList<Car>();
		try 
		{
			File usedCarsFile = new File("usedCarsFile.txt");
			
			if(usedCarsFile.canRead()) 
			{
				Scanner fileScanner = new Scanner(usedCarsFile);

				

				while (fileScanner.hasNext()) 
				{
					Car car = new Car();
					
					String data[] = fileScanner.nextLine().split(", ");

					car.setImage(data[0].trim());
					car.setDescription(data[1].trim());
					car.setMake(data[2].trim());
					car.setModel(data[3].trim());
					car.setYear(data[4].trim());
					car.setTrim(data[5].trim());
					car.setColor(data[6].trim());
					car.setDoors(data[7].trim());
					car.setMpg(data[8].trim());
					car.setVin(data[9].trim());
					car.setMiles(data[10].trim());
					car.setPrice(data[11].trim());
					car.setDaysOnLot(data[12].trim());
					car.setBidable(Boolean.parseBoolean(data[13].trim()));
					car.setNew(Boolean.parseBoolean(data[14].trim()));
					
					usedCars.add(car);
		
				}
				fileScanner.close();	
			}
			
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		return usedCars;
	}
	
	public void offersPlacedSave(ArrayList<CarOffer> carOffer) 
	{
		try 
		{
			File carOfferFile = new File("carOfferFile.txt");
			FileWriter carOfferWriter = new FileWriter(carOfferFile);

			
			
			
			for (int index = 0; index < carOffer.size(); index++) 
			{
				
				Customer customer = carOffer.get(index).getCustomer();
				Car car = carOffer.get(index).getCustomerOfferCar();

				carOfferWriter.write(	customer.getPhoneCustomer() 	+ ", " + customer.getEmailCustomer()	+ ", " +
										customer.getFirstNameCustomer() + ", " + customer.getLastNameCustomer() + ", " +  
										
										car.getImage()		+ ", " + car.getDescription()	+ ", " + car.getMake()	+ ", " + car.getModel() + ", " +
										car.getYear() 		+ ", " + car.getTrim() 			+ ", " + car.getColor() + ", " + car.getDoors() + ", " + 
										car.getMpg() 		+ ", " + car.getVin()			+ ", " + car.getMiles() + ", " + car.getPrice() + ", " + 
										car.getDaysOnLot() 	+ ", " + car.isBidable() 		+ ", " + car.isNew() 	+ "\n");
			}

			carOfferWriter.close();

		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}

	}
	
	public ArrayList<CarOffer> offersPlacedLoad() 
	{
		ArrayList<CarOffer> carOffer = new ArrayList<CarOffer>();
		try 
		{
			File offerCarsFile = new File("offerCarsFile.txt");
			
			if(offerCarsFile.canRead()) 
			{
				Scanner fileScanner = new Scanner(offerCarsFile);

				

				while (fileScanner.hasNext()) 
				{
					
					CarOffer offer = new CarOffer();
					
					Customer customer = new Customer();
					
					Car car = new Car();
					
					String data[] = fileScanner.nextLine().split(", ");

					customer.setPhoneCustomer(data[0].trim());
					customer.setEmailCustomer(data[1].trim());
					customer.setFirstNameCustomer(data[2].trim());
					customer.setLastNameCustomer(data[3].trim());
					car.setImage(data[4].trim());
					car.setDescription(data[5].trim());
					car.setMake(data[6].trim());
					car.setModel(data[7].trim());
					car.setYear(data[8].trim());
					car.setTrim(data[9].trim());
					car.setColor(data[10].trim());
					car.setDoors(data[11].trim());
					car.setMpg(data[12].trim());
					car.setVin(data[13].trim());
					car.setMiles(data[14].trim());
					car.setPrice(data[15].trim());
					car.setDaysOnLot(data[16].trim());
					car.setBidable(Boolean.parseBoolean(data[17].trim()));
					car.setNew(Boolean.parseBoolean(data[18].trim()));
					
					offer.setCustomer(customer);
					offer.setCustomerOfferCar(car);
					
					carOffer.add(offer);
				}
				fileScanner.close();	
			}
			
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		return carOffer;
	}
	
	public void soldCarsSave(ArrayList<CarOffer> soldCars) 
	{
		try 
		{
			File soldCarsFile = new File("soldCarsFile.txt");
			FileWriter soldCarsWriter = new FileWriter(soldCarsFile);

			
			
			
			for (int index = 0; index < soldCars.size(); index++) 
			{		
				Customer customer = soldCars.get(index).getCustomer();
				Car car = soldCars.get(index).getCustomerOfferCar();

				soldCarsWriter.write(	customer.getPhoneCustomer() 	+ ", " + customer.getEmailCustomer()	+ ", " +
										customer.getFirstNameCustomer() + ", " + customer.getLastNameCustomer() + ", " +  
						
										car.getImage()		+ ", " + car.getDescription()	+ ", " + car.getMake()	+ ", " + car.getModel() + ", " +
										car.getYear() 		+ ", " + car.getTrim() 			+ ", " + car.getColor() + ", " + car.getDoors() + ", " + 
										car.getMpg() 		+ ", " + car.getVin()			+ ", " + car.getMiles() + ", " + car.getPrice() + ", " + 
										car.getDaysOnLot() 	+ ", " + car.isBidable() 		+ ", " + car.isNew() 	+ "\n");
			}

			soldCarsWriter.close();

		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}

	}
	
	public ArrayList<CarOffer> soldCarsLoad() 
	{
		ArrayList<CarOffer> soldCars = new ArrayList<CarOffer>();
		try 
		{
			File soldCarsFile = new File("soldCarsFile.txt");
			
			if(soldCarsFile.canRead()) 
			{
				Scanner fileScanner = new Scanner(soldCarsFile);

				

				while (fileScanner.hasNext()) 
				{
					
					CarOffer sold = new CarOffer();
					
					Customer customer = new Customer();
					
					Car car = new Car();
					
					String data[] = fileScanner.nextLine().split(", ");

					customer.setPhoneCustomer(data[0].trim());
					customer.setEmailCustomer(data[1].trim());
					customer.setFirstNameCustomer(data[2].trim());
					customer.setLastNameCustomer(data[3].trim());
					car.setImage(data[4].trim());
					car.setDescription(data[5].trim());
					car.setMake(data[6].trim());
					car.setModel(data[7].trim());
					car.setYear(data[8].trim());
					car.setTrim(data[9].trim());
					car.setColor(data[10].trim());
					car.setDoors(data[11].trim());
					car.setMpg(data[12].trim());
					car.setVin(data[13].trim());
					car.setMiles(data[14].trim());
					car.setPrice(data[15].trim());
					car.setDaysOnLot(data[16].trim());
					car.setBidable(Boolean.parseBoolean(data[17].trim()));
					car.setNew(Boolean.parseBoolean(data[18].trim()));
					
					sold.setOfferAccepted(true);
					sold.setCustomer(customer);
					sold.setCustomerOfferCar(car);
					
					soldCars.add(sold);
				}
				fileScanner.close();	
			}
			
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		return soldCars;
	}
	
	
	
}

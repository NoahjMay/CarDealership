package com.classes;

public class Car 
{


		private String make;
		private String model;
		private String year;
		private String trim;
		private String color;
		private String doors;
		private String mpg;
		private String vin;
		private String miles;
		private String price;
		
		private int daysOnLot		= 0;
				
		private boolean isBidable 	= false;
		private boolean isNew 		= true;
		
		public Car() {}
		
		public Car(String make, String model, String year, String trim, String color, String doors, String mpg,
			String vin, String miles, String price, int daysOnLot, boolean isBidable, boolean isNew) 
		{
		this.make 			= make;
		this.model 			= model;
		this.year 			= year;
		this.trim 			= trim;
		this.color 			= color;
		this.doors 			= doors;
		this.mpg 			= mpg;
		this.vin 			= vin;
		this.miles 			= miles;
		this.price 			= price;
		this.daysOnLot 		= daysOnLot;
		this.isBidable 		= isBidable;
		this.isNew 			= isNew;
		}

		public String getMake() {
			return make;
		}

		public String getModel() {
			return model;
		}

		public String getYear() {
			return year;
		}

		public String getTrim() {
			return trim;
		}

		public String getColor() {
			return color;
		}

		public String getDoors() {
			return doors;
		}

		public String getMpg() {
			return mpg;
		}

		public String getVin() {
			return vin;
		}

		public String getMiles() {
			return miles;
		}

		public String getPrice() {
			return price;
		}

		public int getDaysOnLot() {
			return daysOnLot;
		}

		public boolean isBidable() {
			return isBidable;
		}

		public boolean isNew() {
			return isNew;
		}

		public void setMake(String make) {
			this.make = make;
		}

		public void setModel(String model) {
			this.model = model;
		}

		public void setYear(String year) {
			this.year = year;
		}

		public void setTrim(String trim) {
			this.trim = trim;
		}

		public void setColor(String color) {
			this.color = color;
		}

		public void setDoors(String doors) {
			this.doors = doors;
		}

		public void setMpg(String mpg) {
			this.mpg = mpg;
		}

		public void setVin(String vin) {
			this.vin = vin;
		}

		public void setMiles(String miles) {
			this.miles = miles;
		}

		public void setPrice(String price) {
			this.price = price;
		}

		public void setDaysOnLot(int daysOnLot) {
			this.daysOnLot = daysOnLot;
		}

		public void setBidable(boolean isBidable) {
			this.isBidable = isBidable;
		}

		public void setNew(boolean isNew) {
			this.isNew = isNew;
		}


}
	
	

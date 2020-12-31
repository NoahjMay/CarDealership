package com.classes;

public class Car 
{

		private String image;
		private String description;
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
		private String daysOnLot;
		
		private boolean bidable;
		private boolean isNew;
		
		public Car() 
		{

			
		}

		public Car(String image, String description, String make, String model, String year, String trim, String color,
				String doors, String mpg, String vin, String miles, String price, String daysOnLot, boolean bidable,
				boolean isNew) 
		{
			this.image = image;
			this.description = description;
			this.make = make;
			this.model = model;
			this.year = year;
			this.trim = trim;
			this.color = color;
			this.doors = doors;
			this.mpg = mpg;
			this.vin = vin;
			this.miles = miles;
			this.price = price;
			this.daysOnLot = daysOnLot;
			this.bidable = bidable;
			this.isNew = isNew;
		}

		public String getImage() {
			return image;
		}

		public String getDescription() {
			return description;
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

		public String getDaysOnLot() {
			return daysOnLot;
		}

		public boolean isBidable() {
			return bidable;
		}

		public boolean isNew() {
			return isNew;
		}

		public void setImage(String image) {
			this.image = image;
		}

		public void setDescription(String description) {
			this.description = description;
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

		public void setDaysOnLot(String daysOnLot) {
			this.daysOnLot = daysOnLot;
		}

		public void setBidable(boolean bidable) {
			this.bidable = bidable;
		}

		public void setNew(boolean isNew) {
			this.isNew = isNew;
		}
		
}
	
	

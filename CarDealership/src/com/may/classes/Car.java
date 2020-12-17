package com.may.classes;

public class Car 
{
		@Override
	public String toString() {
		return "<tr>" + make + model +  year + trim + color + doors + vin + daysOnLot + "</tr>";
	}

		private String make;
		private String model;
		private String year;
		private String trim;
		private String color;
		private String doors;
		private String vin;
		
		private int daysOnLot;
				
		private boolean isBidable;
		private boolean isNew;
		private boolean isUsed;
		
		public Car(String make, String model, String year, String trim, String color, String doors,
			String vin, int daysOnLot, boolean isBidable, boolean isNew, boolean isUsed) 
		{
		this.make 			= make;
		this.model 			= model;
		this.year 			= year;
		this.trim 			= trim;
		this.color 			= color;
		this.doors 			= doors;
		this.vin 			= vin;
		this.daysOnLot 		= daysOnLot;
		this.isBidable 		= isBidable;
		this.isNew 			= isNew;
		this.isUsed 		= isUsed;
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

		public String getVin() {
			return vin;
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

		public boolean isUsed() {
			return isUsed;
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

		public void setVin(String vin) {
			this.vin = vin;
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

		public void setUsed(boolean isUsed) {
			this.isUsed = isUsed;
		}	

}
	
	

package com.classes;

public class GenerateBusinessReport 
{
	private long newCarsSold;
	private long grossValueNewCarsSold;
	private long netValueNewCarsSold;
	private long usedCarsSold;
	private long grossValueUsedCarsSold;
	private long netValueUsedCarsSold;
	private String carsSoldByMake;
	private String CarsSoldNyModel;

	GenerateBusinessReport(long newCarsSold, long grossValueNewCarsSold, long netValueNewCarsSold,long usedCarsSold,
							long grossValueUsedCarsSold,long netValueUsedCarsSold,
							String carsSoldByMake, String CarsSoldNyModel) 
	{
	this.newCarsSold 				= newCarsSold;
	this.grossValueNewCarsSold 		= grossValueNewCarsSold;
	this.netValueNewCarsSold 		= netValueNewCarsSold;
	
	this.usedCarsSold 				= usedCarsSold;
	this.grossValueUsedCarsSold 	= grossValueUsedCarsSold;
	this.netValueUsedCarsSold 		= netValueUsedCarsSold;
	this.carsSoldByMake 			= carsSoldByMake;
	this.CarsSoldNyModel 			= CarsSoldNyModel;		
	}

	public long getNewCarsSold() {
		return newCarsSold;
	}

	public long getGrossValueNewCarsSold() {
		return grossValueNewCarsSold;
	}

	public long getNetValueNewCarsSold() {
		return netValueNewCarsSold;
	}

	public long getUsedCarsSold() {
		return usedCarsSold;
	}

	public long getGrossValueUsedCarsSold() {
		return grossValueUsedCarsSold;
	}

	public long getNetValueUsedCarsSold() {
		return netValueUsedCarsSold;
	}

	public String getCarsSoldByMake() {
		return carsSoldByMake;
	}

	public String getCarsSoldNyModel() {
		return CarsSoldNyModel;
	}

	public void setNewCarsSold(long newCarsSold) {
		this.newCarsSold = newCarsSold;
	}

	public void setGrossValueNewCarsSold(long grossValueNewCarsSold) {
		this.grossValueNewCarsSold = grossValueNewCarsSold;
	}

	public void setNetValueNewCarsSold(long netValueNewCarsSold) {
		this.netValueNewCarsSold = netValueNewCarsSold;
	}

	public void setUsedCarsSold(long usedCarsSold) {
		this.usedCarsSold = usedCarsSold;
	}

	public void setGrossValueUsedCarsSold(long grossValueUsedCarsSold) {
		this.grossValueUsedCarsSold = grossValueUsedCarsSold;
	}

	public void setNetValueUsedCarsSold(long netValueUsedCarsSold) {
		this.netValueUsedCarsSold = netValueUsedCarsSold;
	}

	public void setCarsSoldByMake(String carsSoldByMake) {
		this.carsSoldByMake = carsSoldByMake;
	}

	public void setCarsSoldNyModel(String carsSoldNyModel) {
		CarsSoldNyModel = carsSoldNyModel;
	}
}

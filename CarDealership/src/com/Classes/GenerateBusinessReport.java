package com.Classes;
//TODO flush this out more getters setters.
public class GenerateBusinessReport 
{
	private long newCarsSold;
	private long usedCarsSold;
	private String carsSoldByMake;
	private String CarsSoldNyModel;

	GenerateBusinessReport(long newCarsSold, long usedCarsSold, String carsSoldByMake, String CarsSoldNyModel) 
	{
	this.newCarsSold 		= newCarsSold;
	this.usedCarsSold 	= usedCarsSold;
	this.carsSoldByMake 	= carsSoldByMake;
	this.CarsSoldNyModel 	= CarsSoldNyModel;		
	}
}

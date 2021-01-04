package com.classes;

public class CarOffer 
{
	private String offerPrice;
	
	private boolean offerAccepted;

	Customer customer = new Customer();
	
	Car customerCarOffer = new Car();
	
	public CarOffer(){}

	public CarOffer(String offerPrice, boolean offerAccepted, Customer customer, Car customerCarOffer) 
	{
		this.offerPrice = offerPrice;
		this.offerAccepted = offerAccepted;
		this.customer = customer;
		this.customerCarOffer = customerCarOffer;
	}

	public String getOfferPrice() 
	{
		return offerPrice;
	}

	public boolean isOfferAccepted() 
	{
		return offerAccepted;
	}

	public Customer getCustomer() 
	{
		return customer;
	}

	public Car getCustomerCarOffer() 
	{
		return customerCarOffer;
	}

	public void setOfferPrice(String offerPrice) 
	{
		this.offerPrice = offerPrice;
	}

	public void setOfferAccepted(boolean offerAccepted) 
	{
		this.offerAccepted = offerAccepted;
	}

	public void setCustomer(Customer customer) 
	{
		this.customer = customer;
	}

	public void setCustomerCarOffer(Car customerCarOffer) 
	{
		this.customerCarOffer = customerCarOffer;
	}


	
}

package com.classes;

public class CarOffer 
{
	
	boolean offerAccepted;
	
	Customer customer = new Customer();
	
	Car customerOfferCar = new Car();
	
	CarOffer(){}

	public CarOffer(boolean offerAccepted, Customer customer, Car customerOfferCar) 
	{
		this.offerAccepted = offerAccepted;
		this.customer = customer;
		this.customerOfferCar = customerOfferCar;
	}

	public boolean isOfferAccepted() {
		return offerAccepted;
	}

	public Customer getCustomer() {
		return customer;
	}

	public Car getCustomerOfferCar() {
		return customerOfferCar;
	}

	public void setOfferAccepted(boolean offerAccepted) {
		this.offerAccepted = offerAccepted;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public void setCustomerOfferCar(Car customerOfferCar) {
		this.customerOfferCar = customerOfferCar;
	}
	
}

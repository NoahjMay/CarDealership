package com.classes;

public class Customer 
{
	private String emailCustomer;
	private String passwordCustomer;
	private String firstNameCustomer;
	private String lastNameCustomer;

	Customer(String emailCustomer, String passwordCustomer, String firstNameCustomer, String lastNameCustomer) 
	{
	this.emailCustomer 		= emailCustomer;
	this.passwordCustomer 	= passwordCustomer;
	this.firstNameCustomer 	= firstNameCustomer;
	this.lastNameCustomer 	= lastNameCustomer;		
	}

	public String getEmailCustomer() {
		return emailCustomer;
	}

	public String getPasswordCustomer() {
		return passwordCustomer;
	}

	public String getFirstNameCustomer() {
		return firstNameCustomer;
	}

	public String getLastNameCustomer() {
		return lastNameCustomer;
	}

	public void setEmailCustomer(String emailCustomer) {
		this.emailCustomer = emailCustomer;
	}

	public void setPasswordCustomer(String passwordCustomer) {
		this.passwordCustomer = passwordCustomer;
	}

	public void setFirstNameCustomer(String firstNameCustomer) {
		this.firstNameCustomer = firstNameCustomer;
	}

	public void setLastNameCustomer(String lastNameCustomer) {
		this.lastNameCustomer = lastNameCustomer;
	}
	
	
}

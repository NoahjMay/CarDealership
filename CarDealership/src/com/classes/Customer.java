package com.classes;

public class Customer 
{
	private String phoneCustomer;
	private String emailCustomer;
	private String passwordCustomer;
	private String firstNameCustomer;
	private String lastNameCustomer;

	public Customer(){}

	public Customer(String phoneCustomer, String emailCustomer, String passwordCustomer, String firstNameCustomer, String lastNameCustomer) 
	{
		this.phoneCustomer = phoneCustomer;
		this.emailCustomer = emailCustomer;
		this.passwordCustomer = passwordCustomer;
		this.firstNameCustomer = firstNameCustomer;
		this.lastNameCustomer = lastNameCustomer;
	}

	public String getPhoneCustomer() 
	{
		return phoneCustomer;
	}

	public String getEmailCustomer() 
	{
		return emailCustomer;
	}

	public String getPasswordCustomer() 
	{
		return passwordCustomer;
	}

	public String getFirstNameCustomer() 
	{
		return firstNameCustomer;
	}

	public String getLastNameCustomer() 
	{
		return lastNameCustomer;
	}

	public void setPhoneCustomer(String phoneCustomer) 
	{
		this.phoneCustomer = phoneCustomer;
	}

	public void setEmailCustomer(String emailCustomer) 
	{
		this.emailCustomer = emailCustomer;
	}

	public void setPasswordCustomer(String passwordCustomer) 
	{
		this.passwordCustomer = passwordCustomer;
	}

	public void setFirstNameCustomer(String firstNameCustomer) 
	{
		this.firstNameCustomer = firstNameCustomer;
	}

	public void setLastNameCustomer(String lastNameCustomer) 
	{
		this.lastNameCustomer = lastNameCustomer;
	}
	
	

}

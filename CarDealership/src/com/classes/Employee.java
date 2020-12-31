package com.classes;

public class Employee 
{
	private String phoneEmployee;
	private String emailEmployee;
	private String passwordEmployee;
	private String firstNameEmployee;
	private String lastNameEmployee;
	
	public Employee() {}
	
	public Employee(String phoneEmployee, String emailEmployee, String passwordEmployee, String firstNameEmployee, String lastNameEmployee)
	{
		this.phoneEmployee = phoneEmployee;
		this.emailEmployee = emailEmployee;
		this.passwordEmployee = passwordEmployee;
		this.firstNameEmployee = firstNameEmployee;
		this.lastNameEmployee = lastNameEmployee;
	}

	public String getPhoneEmployee() 
	{
		return phoneEmployee;
	}

	public String getEmailEmployee() 
	{
		return emailEmployee;
	}

	public String getPasswordEmployee() 
	{
		return passwordEmployee;
	}

	public String getFirstNameEmployee() 
	{
		return firstNameEmployee;
	}

	public String getLastNameEmployee() 
	{
		return lastNameEmployee;
	}

	public void setPhoneEmployee(String phoneEmployee) 
	{
		this.phoneEmployee = phoneEmployee;
	}

	public void setEmailEmployee(String emailEmployee) 
	{
		this.emailEmployee = emailEmployee;
	}

	public void setPasswordEmployee(String passwordEmployee) 
	{
		this.passwordEmployee = passwordEmployee;
	}

	public void setFirstNameEmployee(String firstNameEmployee) 
	{
		this.firstNameEmployee = firstNameEmployee;
	}

	public void setLastNameEmployee(String lastNameEmployee) 
	{
		this.lastNameEmployee = lastNameEmployee;
	}
	
	
	
	
	
}

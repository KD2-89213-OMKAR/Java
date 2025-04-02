package com.sunbeam;

public class Employee {
	private String firstName;
	private String lastName;
	private double monthlySalary;
	
	public Employee() {
		this.firstName = "";
		this.lastName = "";
		this.monthlySalary = 0.0;
	}
	
	public Employee(String firstName, String lastName, double monthlySalary) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.monthlySalary = monthlySalary;
	}
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	// getter	
	public double getMonthlySalary() {
		return monthlySalary;
	}
	// setter
	public void setMonthlySalary(double monthlySalary) {
		if(monthlySalary < 0) {
			System.out.println("Pleas enter the positive value.");
		}else {
			this.monthlySalary = monthlySalary;
		}
	}

}

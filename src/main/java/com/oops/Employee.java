package com.oops;

public class Employee {

	private String name;
	private String designation;
	private int salary;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}


	
	public void print() {
		System.out.println(getName());
		System.out.println(getDesignation());
		System.out.println(getSalary());
	}
}

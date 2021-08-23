package com.oops;

public class Company {

	Engineer engineer;
	String name;
	
	public static void main(String[] args) {
		
		Employee employee=new Employee();
		employee.setName("Kiran");
		employee.setDesignation("Engineer");
		employee.setSalary(50000);
		
		employee.print();
		
		
		
	}
}

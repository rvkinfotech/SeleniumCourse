package com.constructor.demo;

public class Pen {

	String color;
	int cost;
	String companyName;
	
	static int d;
	
	public Pen(String acolor, int acost, String acompnayName){
		this.color=acolor;
		this.cost=acost;
		this.companyName=acompnayName;
	}
	
	public Pen() {
		
	}
	
	public Pen(int cost) {
		
	}
	
	public void printValues() {
		System.out.println(color);
		print();
		Pen.d=10;
		
		Pen.print();
	}
	public static void main(String[] args) {

		Pen.d=5;
		Pen p=new Pen("red",20,"Natraj");
		//p.color="red";
		p.printValues();
		
		//Pen pen=new Pen(2,"Natraj");
		
		

	}
static void print() {
	System.out.println("Its static method");
	
	
}
	
	
}

package com.demo.inheritance;

public class Square extends Shape {

	int b=20;
	public Square(int x) {
		super(x);
		System.out.println(this.b);
	}
	
	
	public void calculteArea() {
		System.out.println(a);
		System.out.println(b);
	}
	
	/*
	 * final void fun1() { System.out.println("Shape"); }
	 */
	
	public static void main(String[] args) {
		
		//Square sq=new Square(10);
		Shape sq=new Square(10);
		sq.calculteArea();
		//System.out.println(sq.a);
	}
	
}



// Square - Child Class, Derived Class, Sub Class
// Shape -  Parent Class, Base Class, Super Class


// IS-A relationship

// Aggregation vs Composition
package com.demo.inheritance;

public class Shape {
	protected int a;
	
	
	public Shape(int temp) {
		a=temp;		
	}
	
	final void fun1() {
		System.out.println("Shape");
	}
	
	
	public void calculteArea() {
			System.out.println(a);
		}
}

package com.demo.inheritance;

public class Math {

	public void add(int a,int b) {
		System.out.println(a+b);
	}
	
	public void add(String a,String b) {
		System.out.println(a+b);
	}
	
	public void add(float a,float b,float c) {
		
	}
	public static void main(String[] args) {
		
		Math m=new Math();
		m.add(1,2);
		m.add("Hello"," World!");
		//m.add(1.5f, 3.0f);
	}

}

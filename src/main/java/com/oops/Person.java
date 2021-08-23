package com.oops;

public class Person {

	float weight;
	float height;
	String color;
	String name;
	
	public Person(float pweight,float pheight,String pcolor,String pname) {
		weight=pweight;
		height=pheight;
		color=pcolor;
		name=pname;
				
	}
	
	public void walk() {
		
	}
	
	public void run() {
		
	}
	
	public void sleep() {
		
	}
	
	public void eat() {
		
	}
	
	
	public static void main(String[] args) {
		
		Person p1=new Person(73.3f,5.7f,"Red","Ajay");
		
		Person p2=new Person(53.3f,4.7f,"Red","Vijay");
	}
}

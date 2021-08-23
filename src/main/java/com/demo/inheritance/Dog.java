package com.demo.inheritance;

public class Dog extends Animal {

	@Override
	public void sound() {
		System.out.println("From Dog , Barking");
	}
	
	public static void main(String[] args) {
		
		Dog d=new Dog();
		d.sound();
		
		
		Animal a=new Animal();
		a.sound();
		
		
		Animal a1=new Dog();
		a1.sound();
		
	}
}

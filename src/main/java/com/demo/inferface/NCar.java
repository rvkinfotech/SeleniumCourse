package com.demo.inferface;

public class NCar extends Car {

	@Override
	public void seetingCapacity() {
		System.out.println("NCar");
	}
	
	public void fun1() {
		System.out.println("Hey");
	}

	public static void main(String[] args) {
		
		IVehical iv=new NCar();
		//iv.fun1();
		
	}
}

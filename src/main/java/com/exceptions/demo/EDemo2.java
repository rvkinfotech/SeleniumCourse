package com.exceptions.demo;

public class EDemo2 {

	public static void main(String[] args) {
	
		int a[]=new int[5];
		
		try {
		
			a[10]=3;
		
		System.out.println(a[10]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			//e.printStackTrace();
		}
		System.out.println("End of the program");

	}

}

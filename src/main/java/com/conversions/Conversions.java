package com.conversions;

public class Conversions {

	public static void main(String[] args) {
		
		int a=Integer.parseInt("+234");
		int b=Integer.parseInt("-200");
		
		System.out.println(a+b);
		
		double da=Double.parseDouble("78.23654");
		double db=Double.parseDouble("22.23654");
		
		System.out.println(da+db);
		
		Double.toString(da);
		String s=Double.toString(2.235478);
		System.out.println(s instanceof String);
		
		
		System.out.println(Math.sqrt(64));
		System.out.println(Math.random());
		
		if(a>b) {
			System.out.println();
		}
		System.out.println();
	}
}

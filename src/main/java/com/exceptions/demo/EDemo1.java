package com.exceptions.demo;

import java.util.Scanner;

public class EDemo1 {

	public static void main(String[] args) {
		
		System.out.println("Enter a number");
		Scanner sc1=new Scanner(System.in);
		int a=sc1.nextInt();
		
		System.out.println("Enter b number");
		Scanner sc2=new Scanner(System.in);
		int b=sc2.nextInt();
		
		try {
		
			System.out.println(a/b);
		
		}catch(ArithmeticException e) {
			
			//e.printStackTrace();
			
			System.out.println(e.getMessage());
		}finally {
			
			System.out.println("Finally Block");
		}
		
		System.out.println("Program Completed");
	}
}

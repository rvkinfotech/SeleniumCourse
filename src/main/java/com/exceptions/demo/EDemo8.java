package com.exceptions.demo;

import java.util.Scanner;

public class EDemo8 {

	public static void main(String[] args){
		
		System.out.println("Enter Age:");
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		
		try {
			if ( age > 18)
				System.out.println("You have Vote to Right");
			else
				throw new AgeLimitException("Age is not > 18");
		}catch(Exception e) {
			//System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}

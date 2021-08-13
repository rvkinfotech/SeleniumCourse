package com.arrays.demo;

import java.util.Scanner;

public class FindElementInArray {

	public static void main(String[] args) {
		
		int a[]= {23,52,2,3,47,78};
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number to Search in Array");
		int n=sc.nextInt();
		
		boolean flag=false;
		for(int i=0;i<a.length;i++) {
			if(n==a[i])
				flag=true;
			
		}

		if(flag)
			System.out.println("Element is found in Array");
		else
			System.out.println("Element is not found in Array");
	}

}

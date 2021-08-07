package com.arrays.demo;

public class ArrayDemo1 {

	int a=10;
	
	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5};
		
		for(int i=0;i<a.length;i++) {
			
			//System.out.println("a["+i+"]="+a[i]);
			
			System.out.print(a[i]);
		}
		System.out.println();
		System.out.println("Now in Reverse");
		// Print in Reverse 
		
		
		for(int j=a.length-1;j>=0;j--) {
			System.out.print(a[j]);
		}
		
	}
}

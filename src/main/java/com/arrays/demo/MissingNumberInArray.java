package com.arrays.demo;

public class MissingNumberInArray {

	
	public static void main(String[] args) {
		// sorted array
		
		int a[]= {1,2,3,5,6};
		//21 - 17 = 4
		
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum+=a[i];
		}
		System.out.println(sum);
		
		int arraylenth=a.length-1;
		int total=a[arraylenth]*(a[arraylenth]+1)/2;  // n*(n+1)/2
		System.out.println(total);
		
		System.out.println(total-sum);
		
	}
}

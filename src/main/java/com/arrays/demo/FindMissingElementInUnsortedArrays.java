package com.arrays.demo;

import java.util.Arrays;

public class FindMissingElementInUnsortedArrays {

	public static void main(String[] args) {
		
		int a[]= {1,3,4,5,6};
		
		Arrays.sort(a);
		/*
		 * for(int i=0;i<a.length;i++) System.out.println(a[i]);
		 */
		
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

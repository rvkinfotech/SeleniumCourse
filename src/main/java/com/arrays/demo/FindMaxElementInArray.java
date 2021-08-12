package com.arrays.demo;

public class FindMaxElementInArray {

	public static void main(String[] args) {
		
		int a[]= {100,2,3,72,43,92,55,65,84};
		int max=a[0];
		
		//System.out.println(a.length);
		
		for(int i=0;i<a.length;i++) {
			if(a[i]>max)
				max=a[i];
			
		}
		System.out.println(max);
		
	}
}

package com.arrays.demo;

public class TwoDArrayDemo {

	public static void main(String[] args) {
		
		int  a[][]={{1,11,111,1111},{2,22,222},{3,33},{4,44,444}};
		int b[][]=new int[4][];
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
			System.out.print(" "+a[i][j]);
			}
			System.out.println();
		}
		
	}
}

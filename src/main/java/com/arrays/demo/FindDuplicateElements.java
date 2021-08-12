package com.arrays.demo;

public class FindDuplicateElements {

	public static void main(String[] args) {
		
		int a[]= {100,2,3,72,43,92,55,65,84,100};
		
		for(int i=0;i<a.length;i++)
			for(int j=i+1;j<a.length;j++)
				if(a[i]==a[j]) {
					System.out.println("Duplicate Element found "+j);
				}
	}

}

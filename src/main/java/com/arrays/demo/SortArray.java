package com.arrays.demo;

public class SortArray {

	public static void main(String[] args) {
	int a[]	= {7,3,2,8,9};
	
	int lenth=a.length;
	
	int temp=0;
	for(int i=0;i<lenth;i++)
		for(int j=i+1;j<lenth;j++) { //Bubble Sort
			if(a[i]<a[j]) {
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}	
		}
	
	for(int k=0;k<lenth;k++)
		System.out.println(a[k]);
	
	}

}

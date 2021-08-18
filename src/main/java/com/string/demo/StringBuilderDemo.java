package com.string.demo;

public class StringBuilderDemo {

	public static void main(String[] args) {
	
		StringBuilder sb=new StringBuilder("MADAMs");
		String s=new String("Hello");
		System.out.println(sb);
		//System.out.println(sb.reverse());
		
		System.out.println(sb.reverse());
		System.out.println(sb);
		System.out.println(sb.append(" java"));
		
		System.out.println(sb);
		System.out.println(s);
		
		if(sb.equals(sb.reverse()))
			System.out.println("Given String is Polendrum");
		else
			System.out.println("Given String is not Polendrum");
		
		int a[]= {1,2};
		System.out.println(a);
		System.out.println(new Employee());
		// equals, hashcode, toString
		
		
		System.out.println(sb.capacity());
		
		StringBuilder sb1=new StringBuilder("MADAMs");
		System.out.println(sb1.capacity());
		
		
		System.out.println(sb1.delete(5, 7));
		//System.out.println(sb1.deleteCharAt(6));
		
		
		StringBuilder sb3=new StringBuilder("Java is goods");
		System.out.println(sb3.substring(6));
		System.out.println(sb3.substring(0,3));
	}

}

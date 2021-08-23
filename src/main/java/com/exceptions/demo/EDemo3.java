package com.exceptions.demo;

public class EDemo3 {

	public static void main(String[] args) {
	
		String s=null;
		
		try {
		System.out.println(s.length());
		}catch(NullPointerException e) {
			e.printStackTrace();
		}finally {
			System.out.println("End of the program");
		}
	}

}

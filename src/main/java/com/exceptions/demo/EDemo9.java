package com.exceptions.demo;

public class EDemo9 {

	public static void main(String[] args) {
		
		
		try {
			//System.out.println(0/0);
			try {
				String s=null;
				s.length();
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}finally {
				System.out.println("Inner Finally");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("Outer Finally");
		}

	}

}

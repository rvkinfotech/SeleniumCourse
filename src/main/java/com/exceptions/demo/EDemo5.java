package com.exceptions.demo;

public class EDemo5 {

	public static void main(String[] args) {
		
		String s=null;
		
		try {
			
			// error anticipate 
			System.out.println(s.length());
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}catch(Throwable t) {
			
		}finally {
			
			//resources release
		}

	}

}

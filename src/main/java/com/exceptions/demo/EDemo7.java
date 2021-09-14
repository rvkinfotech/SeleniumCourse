package com.exceptions.demo;

public class EDemo7 {

	int a,b;
	
	public void fun1(){
		
		try {
			System.out.println(a/b);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void fun2() throws Exception{
		
		Thread.sleep(1000);
		
	}
	public static void main(String[] args) throws Exception {
		
		EDemo7  e7=new EDemo7();
		
			 
			 e7.fun1();
			 
		
			e7.fun2();
		
	}
}

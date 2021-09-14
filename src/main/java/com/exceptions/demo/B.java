package com.exceptions.demo;

import com.oops.Employee;

public class B extends A{

	Employee e;
	
	public void fun1() throws ArithmeticException{
		System.out.println((0/0));
		
		
	}
	
	public static void main(String[] args) throws Throwable {
		 B b;
		 try {
			 b=new B();
			 
			 b.fun1();
		 }catch(Exception e) {
			 e.printStackTrace();
		 }finally {
			 System.out.println("End of the Progam");
			 b=null;
			
		 }
		 
		 System.out.println("out of");
		 
		 
		 b.finalize();
	}
}


// final , finally , finalize 
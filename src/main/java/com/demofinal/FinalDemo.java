package com.demofinal;

public final class FinalDemo {

	final int a=10;  // final variable cannot be re-assign with value
	
	// methods with final cannot be override
	// class with final cannot support inheritance and it can't extend
	
	public static void main(String[] args) {
	
		FinalDemo fd=new FinalDemo();
		//fd.a=20;
		
		
		System.out.println(fd.a);
	}

}

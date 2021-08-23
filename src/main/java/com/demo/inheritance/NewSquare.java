package com.demo.inheritance;

public class NewSquare extends Square {

	public NewSquare(int x) {
		super(x);
		
	}

	public static void main(String[] args) {
		
		NewSquare nsq=new NewSquare(30);
		nsq.calculteArea();
	}
}


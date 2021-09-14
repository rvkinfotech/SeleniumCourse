package com.setinterface.demo;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		
		Set<String> setobj=new TreeSet<String>();
		
		setobj.add("HTML");
		setobj.add("C");		
		setobj.add("C#");
		setobj.add("C++");
		
		for(String s:setobj)
			System.out.println(s);
		
		
		
	}

}

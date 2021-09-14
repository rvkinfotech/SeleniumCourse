package com.setinterface.demo;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		
		Set<String> lhsObj1=new LinkedHashSet<String>();
		Set<String> lhsObj2=new LinkedHashSet<String>();

		lhsObj1.add("Hello");
		lhsObj2.addAll(lhsObj1);
		
		
		System.out.println(lhsObj2.size());  // 1
		
		lhsObj2.add("Hello");
		
		for(String s:lhsObj2)
			System.out.println(s);
		
		
	}

}

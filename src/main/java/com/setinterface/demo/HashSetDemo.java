package com.setinterface.demo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		
		Set<String> setobj1=new HashSet<String>();
		
		setobj1.add("Java");
		setobj1.add("Java");
		
		System.out.println(setobj1.size());   //1 
		System.out.println(setobj1.isEmpty()); // false
		System.out.println(setobj1.contains("C")); // false
		System.out.println(setobj1.remove("Java")); //true
		System.out.println(setobj1.remove("C")); // false

		System.out.println(setobj1.isEmpty()); // true
		
		
		setobj1.add("Java");
		setobj1.add("C");
		
		setobj1.add("C#");
		setobj1.add("C++");
		
		for(String s: setobj1) {
			System.out.println(s);
		}

		Iterator<String> itr=setobj1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		Set<String> setobj2=new HashSet<String>();
		setobj2.add("HTML");
		setobj2.add("CSS");
		
		setobj2.addAll(setobj1);

		System.out.println(setobj2.size());//6
		System.out.println(setobj2.removeAll(setobj1));
		System.out.println(setobj2.size());//2
		
		Object[] obj=setobj2.toArray();
		for(int i=0;i<obj.length;i++) {
			System.out.println(obj[i]);
		}
		
		
	
	}

}

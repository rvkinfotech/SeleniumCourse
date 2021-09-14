package com.demo.listinterface;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		List<String> list1=new ArrayList<String>();
		
		list1.add("Capgemini");
		list1.add("Infosys");
		list1.add("TCS");
		list1.add("Accenture");
		list1.add("Oracle");
		list1.add("ADP");
		
		// single result
		
		System.out.println(list1.size());  // 6
		System.out.println(list1.contains("Oracle")); // true
		System.out.println(list1.get(1));  // Infosys
		System.out.println(list1.isEmpty());  // false
		System.out.println(list1.remove(0)); // Capgemini
		System.out.println(list1.remove("ADP"));// true
		System.out.println(list1.size());  // 4
		//list1.clear();
		System.out.println(list1.size());  // 0
		
		
		for(String str: list1) {
			System.out.println(str);
		}
		
		System.out.println("-------------------------------");
		
		// group functions
		
		List<String> list2=new ArrayList<String>();
		
		
		
		
		System.out.println(list2.size()); //0
		list2.add("Microsoft");	// adds Microsoft at end of arraylist
		list2.add(1, "Google");// Adds Google string at location 1

		//list2.addAll(list1); // adding list1 to list2 object
		list2.addAll(0,list1); // adding list1 to list2 object
		
		for(String str: list2) {
			System.out.println(str);
		}
		System.out.println(list2.size()); // 6
		
		System.out.println(list2.containsAll(list1)); // true
		System.out.println(list2.removeAll(list1)); // true
		
		list2.add("Oracle");
		
		System.out.println(list2.retainAll(list1)); // retain common value in both list1 & list2 values
		
		for(String str: list2) {
			System.out.println(str);
		}
		
		System.out.println(list2.size());
		System.out.println(list1.equals(list2));  // false
		list2=list1;
		
		System.out.println(list1.size() +"  ==  "+ list2.size());
		
		for(String str: list1) {
			System.out.println(str);
		}
		
		System.out.println(list1.equals(list2));  // true
		
		
		
	}

}

package com.demo.listinterface;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		List<String> llist1=new LinkedList<String>();
		List<String> llist2=new LinkedList<String>();
		List<String> llist3=new LinkedList<String>();
		
		llist1.add("Java");
		llist1.add(0,"C#");
		
		
		llist2.add("HTML");
		
		llist1.addAll(llist2); //  get added at end of list
		
		llist3.add("JavaScript");
		
		llist1.addAll(0, llist3); // llist3 get added at 0 location
		
		
		for(String s: llist1) {
			System.out.println(s);
		}
		
		
		llist1.removeAll(llist3);
		//llist1.remove("HTML");
		
		
		for(String s: llist1) {
			System.out.println(s);
		}
		
		System.out.println(llist1.containsAll(llist2));
		
		System.out.println(llist1.indexOf("HTML"));
		
		
		// Iterator looping - Print valurs in the list
		
		Iterator<String> itr=llist1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		//list iterator
		
		ListIterator<String> lsitr=llist3.listIterator();
		while(lsitr.hasNext()) {
			System.out.println(lsitr.next());
			
		}
		
	}
}

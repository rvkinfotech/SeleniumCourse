package com.queue.demo;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		
		// String,Integer,Long,Float,Double,Short,Byte, Employee, Character
		
		Queue<Integer> list1=new LinkedList<Integer>();
		
		list1.add(15);
		list1.add(3);
		list1.add(17);
		list1.add(90);
		
		for(Integer i:list1)
			System.out.println(i);
		
		Iterator<Integer> itr=list1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		System.out.println(list1.element());  // 15
		
		list1.offer(45);
		
		for(Integer i:list1)
			System.out.println(i);
	}

}

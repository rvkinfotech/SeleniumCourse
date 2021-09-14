package com.queue.demo;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {

	public static void main(String[] args) {


		Queue<String> queObj1=new PriorityQueue<String>();
		
		System.out.println(queObj1.isEmpty());  // true
		
		queObj1.add("Mango");
		queObj1.add("Apple");
		queObj1.add("Orange");
		
		// Printing all elements in Queue
		Iterator<String> itr=queObj1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		// retrive head element in queue
		System.out.println(queObj1.peek());
		
		// retrive head element and remove
		System.out.println(queObj1.poll());
		
		System.out.println(queObj1.size());
		
		// retrive head element if not found no such element exception
		System.out.println(queObj1.element());
		
		// Printing all elements in Queue
		for(String s:queObj1)
			System.out.println(s);
		
		System.out.println(queObj1.remove());
		System.out.println(queObj1.remove("Orange"));
		
		System.out.println(queObj1.size());
		
		Queue<String> queObj2=new PriorityQueue<String>();
		
		System.out.println(queObj2.peek());
		
		try {
			System.out.println(queObj2.element());
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		queObj2.add("BSc");
		queObj2.add("Bcom");
		queObj2.add("BTech");
		
		
		queObj1.add("BSc");
		queObj1.add("MTech");
		//queObj1.addAll(queObj2);
		
		Iterator<String> itr1=queObj1.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		
		System.out.println(queObj2.retainAll(queObj1));
		
		System.out.println("----------------");
		Iterator<String> itr2=queObj2.iterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
		
		System.out.println(queObj1.removeAll(queObj2)); // remove all elements of queobj2
		
		System.out.println(queObj1.size());
		
	}

}

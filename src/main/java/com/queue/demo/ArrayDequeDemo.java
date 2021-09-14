package com.queue.demo;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class ArrayDequeDemo {

	public static void main(String[] args) {
	
		
		Deque<Character> charObj=new ArrayDeque<Character>();
		
		charObj.add('C');
		charObj.add('D');
		
		charObj.push('K');  // stack
		
		charObj.addFirst('Z');
		charObj.addLast('A');
		
		charObj.poll(); // Z
		
		charObj.pollFirst();// K
		
		charObj.pollLast(); // A
		
		charObj.pop(); // C
		
		
		System.out.println(charObj.getFirst()); // D
		System.out.println(charObj.getLast()); //D
		
		/*
		 * for(Character c: charObj) System.out.println(c);
		 */
		
		Iterator<Character> itr=charObj.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
			
	}

}

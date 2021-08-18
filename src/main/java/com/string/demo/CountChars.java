package com.string.demo;

import java.util.HashMap;
import java.util.Map;

public class CountChars {

	public static void main(String[] args) {
		
		CountChars.printStringCounts();
		
		String s="Hello World Java is Object Oriented";
		
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		char ch[]=s.toCharArray();
		int counter=1;
		
		for(Character charV: ch) {
			
			if(map.containsKey(charV)) {
				map.put(charV, map.get(charV)+1);
			}else {
				map.put(charV, 1);
			}
		}

		for(Map.Entry entry: map.entrySet())
			System.out.println(entry.getKey()+""+entry.getValue());
	}
	
	
	
	
	
	public static void printStringCounts() {
		
		String s="Hello World Java is Object Oriented. Java is greate also";
		
		Map<String,Integer> map=new HashMap<String,Integer>();
		String strArray[]=s.split(" ");
		int counter=1;
		
		for(String charV: strArray) {
			
			if(map.containsKey(charV)) {
				map.put(charV, map.get(charV)+1);
			}else {
				map.put(charV, 1);
			}
		}

		for(Map.Entry entry: map.entrySet())
			System.out.println(entry.getKey()+""+entry.getValue());
	}

}

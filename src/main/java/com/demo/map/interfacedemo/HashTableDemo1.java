package com.demo.map.interfacedemo;

import java.util.Hashtable;
import java.util.Map;

public class HashTableDemo1 {

	public static void main(String[] args) {
		
		Map<String,Integer> mapObj=new Hashtable<>();
		
		
		mapObj.put("one",1);
		mapObj.put("two",2);
		mapObj.put("three",3);
		mapObj.put("four",4);
		
		
		for(Map.Entry<String, Integer> entrySet: mapObj.entrySet() ) {
			System.out.println(entrySet.getKey() +"   "+ entrySet.getValue());
		}
	}

}

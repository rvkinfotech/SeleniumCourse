package com.demo.map.interfacedemo;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo1 {

	public static void main(String[] args) {
		
		// linkedhashmap preserves order of insertion
		
		Map<String,String> mapObj=new LinkedHashMap<>();
		
		mapObj.put("Salary","10000");
		mapObj.put("Name","Ajay");
		mapObj.put("Age","25");
		mapObj.put("Job","IT");
		
		
		for(Map.Entry<String, String> entrySet: mapObj.entrySet() )
			System.out.println(entrySet.getKey() +"   "+ entrySet.getValue());

		
	}

}

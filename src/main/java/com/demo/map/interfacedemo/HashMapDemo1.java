package com.demo.map.interfacedemo;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo1 {

	
	public static void main(String[] args) {
		
		// no insertion order nor sort
		
		Map<String,String> mapObj=new HashMap<>();
		
		mapObj.put("Name","Ajay");
		mapObj.put("Age","25");
		mapObj.put("Job","IT");
		
		
		System.out.println(mapObj.isEmpty());  // true
		
		System.out.println(mapObj.size()); // 3 
		
		System.out.println(mapObj.remove("Job")); // removes Job key
		
		//mapObj.clear();
		
		System.out.println(mapObj.containsKey("Name"));  //true
		
		System.out.println(mapObj.containsKey("Job"));  // false
		
		System.out.println(mapObj.containsValue("IT"));  // false
		System.out.println(mapObj.containsValue("Ajay")); //true
		
		System.out.println(mapObj.get("Name")); // Ajay
		
		System.out.println(mapObj.get("Job")); // null
		
		
		// replace methods
		
		System.out.println(mapObj.replace("Name", "Ajay","Vijay"));
		
		System.out.println(mapObj.replace("Name", "Kiran"));
		
		// both key and values
		for(Map.Entry<String, String> set: mapObj.entrySet() ) {
			System.out.println(set.getKey() +" " +set.getValue());
		}
		
		// only keys
		
		for(String str: mapObj.keySet()) {
			System.out.print(str);
			System.out.println("value "+mapObj.get(str));
		}
		
		// only vlaues
		for(String str: mapObj.values()) {
			System.out.print(str);
			
		}
	
	}
	
}

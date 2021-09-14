package com.demo.map.interfacedemo;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo1 {

	public static void main(String[] args) {
		
		// tree map sorts keys
		Map<String,String> mapObj=new TreeMap<>();
		
		mapObj.put("Salary","10000");
		mapObj.put("Name","Ajay");
		mapObj.put("Age","25");
		mapObj.put("Job","IT");
		
		
		for(Map.Entry<String, String> entrySet: mapObj.entrySet() )
			System.out.println(entrySet.getKey() +"   "+ entrySet.getValue());

	}

}

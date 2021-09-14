package com.comparableandcomparator.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestDemo {

	public static void main(String[] args) {
		
		
		Student s1=new Student(11, "hari", 20);
		Student s2=new Student(10, "kiran", 20);
		
		
		List<Student> list=new ArrayList<Student>();
		
		list.add(s1);
		list.add(s2);
		
		
		System.out.println(s1.compareTo(s2));
		
		Collections.sort(list);
		
		for(Student s:list)
			System.out.println(s.sno);
		
		
		
	}

}

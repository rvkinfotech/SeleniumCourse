package com.comparableandcomparator.demo;

import java.util.Comparator;

public class SnameDemo implements Comparator<Student>{

	public static void main(String[] args) {
	
		Student s1=new Student(9, "hari", 20);
		Student s2=new Student(10, "kiran", 20);
		
		SnameDemo sd=new SnameDemo();
		int result=sd.compare(s1, s2);
		System.out.println(result);
	}

	

	@Override
	public int compare(Student o1, Student o2) {
		return o1.sname.compareTo(o2.sname);
	
	}

}

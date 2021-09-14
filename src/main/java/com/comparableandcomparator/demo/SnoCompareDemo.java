package com.comparableandcomparator.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class SnoCompareDemo implements Comparator<Student>{

	public static void main(String[] args) {
		
		Student s1=new Student(11, "hari", 20);
		Student s2=new Student(10, "kiran", 20);

		SnoCompareDemo scd=new SnoCompareDemo();
		int result=scd.compare(s1, s2);
		System.out.println(result);
		
		
	List<Student> list=new ArrayList<Student>();
		
		list.add(s1);
		list.add(s2);
		
		
		Collections.sort(list, new SnoCompareDemo() );
		
		Iterator<Student> itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next().sno);
		}

	}

	@Override
	public int compare(Student o1, Student o2) {
		
		if (o1.sno==o2.sno)
		return 0;
		else if (o1.sno>o2.sno)
			return 1;
		else
			return -1;
	}



}

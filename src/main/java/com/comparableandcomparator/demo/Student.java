package com.comparableandcomparator.demo;

public class Student implements Comparable<Student> {

	int sno;
	String sname;
	int sage;
	
	public Student(int sno, String sname, int sage) {
		super();
		this.sno = sno;
		this.sname = sname;
		this.sage = sage;
	}

	@Override
	public int compareTo(Student o) {
		
		if(sno==o.sno)
		return 0;
		else if( sno<o.sno)
		return 1;
		else
		return -1;
	}
	
	
}

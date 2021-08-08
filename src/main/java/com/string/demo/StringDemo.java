package com.string.demo;

public class StringDemo {

	String str;
	Employee e;
	
	public void fun1() {
		
		e=new Employee();
		System.out.println(e);
		
	}
	public static void main(String[] args) {
		
		StringDemo  strDemo=new StringDemo(); 
		
		String s1=new String();
		
		strDemo.fun1();
		
		Employee e1=new Employee();
		System.out.println(e1);
		System.out.println(strDemo.str);
		
		System.out.println(s1);
		
		
		String str1="abc";
		System.out.println(str1);
		String str2=str1;
		
		String str3=new String("abc");
		
		if (str1==str2)
			System.out.println("if block");
		
		if (str2==str3)
			System.out.println("if if block");
		
		
		String str4=new String(str3);
		if ( str4==str3)
			System.out.println("will not print this");
		
		String str5="abc";
		if (str1==str5)
			System.out.println("str1==str5");
		
		
		String s2=new String("xyz");
		String s3=new String("xyz");
		
		if(s2==s3) // address compare
			System.out.println("s2==s3");
		
		if(s2.equals(s3)) // content compare - equals()
			System.out.println("s2 equals s3");
		
		
		String sc1=new String("hello"); 
		
		//4. way
		 char data[] = {'a', 'b', 'c'};
	     String str = new String(data);
			
	     String strc=new String(data,1,2);
	     
	     // String, StringBuffer, StrigBuilder
	     
	     StringBuffer sb=new StringBuffer("ghi");
	     
	     String str6=new String(sb);
	     
	     StringBuilder sbr=new StringBuilder("ijk");
	     
	     String str7=new String(sbr);
	     
	     // 1. String empty - not empty
	     
	     System.out.println(str7.isEmpty());
	     System.out.println(s1.isEmpty());
	     
	     //2. Lenght
	     
	     System.out.println(str7.length());
	     
	     //3. print
	     
	     System.out.println(str7);
	     
	     //4. concat
	     String str8=str7+str6;
	     //System.out.println(str7+""+str6);
	     System.out.println(str8);
	     
	     //5. String content comparision
	     
	 	if(s2.equals(s3)) // content compare - equals()
			System.out.println("s2 equals s3");
	 	
	 	String s4="Abc";
	 	//6.  Ignore case and compare
	 	if(s2.equalsIgnoreCase(s4))
	 		System.out.println("s2 equals s4");

	 	//7. case conversion
	 	
	 	System.out.println("lmn".toUpperCase());
	 	System.out.println("LMN".toLowerCase());
	 	
	 	//8. get character from string based on index
	 	
	 	System.out.println(str7.charAt(2));
	 	//System.out.println(str7.charAt(3)); // index out of bound error
	 	
	 
	}

}

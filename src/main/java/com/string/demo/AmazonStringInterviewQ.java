package com.string.demo;

public class AmazonStringInterviewQ {

	public static void main(String[] args) {
		
		// aaabbcdd  -> a3b2c1d2
		
		String s="aaabbcdd";
		char ch[]=s.toCharArray();
		StringBuilder sb=new  StringBuilder();
		
		char previousChar=0;
		int counter=0;
		
		for(char cchar: ch) {
			
			if(previousChar==cchar)
				counter++;
			else {
				if(previousChar!=0)
					sb.append(previousChar).append(counter);
				
			previousChar=cchar;
			counter=1;
			}
			
		}
		sb.append(previousChar).append(counter);
		System.out.print(sb);
		
	}
}

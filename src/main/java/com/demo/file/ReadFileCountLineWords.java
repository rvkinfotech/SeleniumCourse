package com.demo.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ReadFileCountLineWords {

	public static void main(String[] args) {
		
		BufferedReader  br=null;
		String str=null;
		int lineCount=0;
		int wordCount=0;
		String word[] = null;
		
		try {
			
			br=new BufferedReader(new FileReader(new File("E:\\SeleniumFramework\\readfile.txt")));
			
			while((str=br.readLine() )!= null) {
				lineCount++;
				word=str.split(" ");
				wordCount+=word.length;
				
			}
				
				System.out.println(lineCount);
				System.out.println("word count "+ wordCount);
				
		}catch(Exception e) {
			
		}finally {
			
			try {
				br.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		}
	}

}

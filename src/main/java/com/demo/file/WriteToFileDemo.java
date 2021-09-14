package com.demo.file;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFileDemo {

	public static void main(String[] args) throws IOException {
		
		BufferedWriter bw=null;
		
		try {
			
			bw=new BufferedWriter(new FileWriter(new File("Writefile.txt")));
			bw.write("Writing data to File");	
		
			
		}catch(Exception e) {
			
		}finally {
			
			bw.close();
		}
		

	}

}

package com.demo.file;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Properties;

public class WriteFileDemo {

	public static void main(String[] args) {
		
		FileOutputStream fos=null;
		Properties prop=null;
		
		try {
			
			
			fos=new FileOutputStream(new File("temp.prop"));
			prop=new Properties();
			
			prop.setProperty("userName", "Hello");
			prop.setProperty("Password", "hello");
			
			prop.store(fos, null);
			
		}catch(Exception e) {
			
			e.printStackTrace();
			
		}finally {
			
			try {
			
				fos.close();
			}catch(Exception e) {
				e.printStackTrace();
				
			}
		}
	}

}

package com.demo.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadFileDemo1 {

	public static void main(String[] args) {
		
		FileInputStream fs = null;
		Properties prop = null;
		
		try {
			 fs=new FileInputStream(new File("E:\\SeleniumFramework\\environment.properties"));
			
			 prop=new Properties();
			 prop.load(fs);
			
			System.out.println(prop.get("url"));
			System.out.println(prop.get("userName"));
			System.out.println(prop.get("Password"));
			System.out.println(prop.get("email"));
			
		}catch(Exception e) {
			
			e.printStackTrace();
			
		}finally {
			try {
				
				fs.close();
				prop.clear();
				
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
	}

}

package com.demo.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class WriteDataToExcel {

	public static void readFile() {
		 try {
			  // Specify the path of file
			  File src=new File("Users.xlsx");
			 
			   // load file
			   FileInputStream fis=new FileInputStream(src);
			 
			   // Load workbook
			   XSSFWorkbook wb=new XSSFWorkbook(fis);
			   
			   // Load sheet- Here we are loading first sheetonly
			      XSSFSheet sh1= wb.getSheetAt(0);
			 
			  // getRow() specify which row we want to read.
			 
			  // and getCell() specify which column to read.
			  // getStringCellValue() specify that we are reading String data.
			 
			 
			 System.out.println(sh1.getRow(0).getCell(0).getStringCellValue());
			 
			 System.out.println(sh1.getRow(0).getCell(1).getStringCellValue());
			 
			 System.out.println(sh1.getRow(1).getCell(0).getStringCellValue());
			 
			 System.out.println(sh1.getRow(1).getCell(1).getStringCellValue());
			 
			 System.out.println(sh1.getRow(2).getCell(0).getStringCellValue());
			 
			 System.out.println(sh1.getRow(2).getCell(1).getStringCellValue());
			 
			  } catch (Exception e) {
			 
			   System.out.println(e.getMessage());
			 
			  }
	}
	
	
	public static void writeFile() {
		
		try {
			 
			  // Specify the file path which you want to create or write
			 
			  File src=new File("Users.xlsx");
			 
			  // Load the file
			 
			  FileInputStream fis=new FileInputStream(src);
			 
			   // load the workbook
			 
			   XSSFWorkbook wb=new XSSFWorkbook(fis);
			 
			  // get the sheet which you want to modify or create
			 
			   XSSFSheet sh1= wb.getSheetAt(0);
			 
				
				/*
				 * // getRow specify which row we want to read and getCell which column
				 * 
				 * System.out.println(sh1.getRow(0).getCell(0).getStringCellValue());
				 * 
				 * System.out.println(sh1.getRow(0).getCell(1).getStringCellValue());
				 * 
				 * System.out.println(sh1.getRow(1).getCell(0).getStringCellValue());
				 * 
				 * System.out.println(sh1.getRow(1).getCell(1).getStringCellValue());
				 * 
				 * System.out.println(sh1.getRow(2).getCell(0).getStringCellValue());
				 * 
				 * System.out.println(sh1.getRow(2).getCell(1).getStringCellValue());
				 */
				 
			// here createCell will create column
			 
			// and setCellvalue will set the value
			 
			 sh1.getRow(0).createCell(2).setCellValue("confirm Password");
			 
			 sh1.getRow(1).createCell(2).setCellValue("Admin@123");
			 
			 sh1.getRow(2).createCell(2).setCellValue("Admin@123");
			 
			 
			// here we need to specify where you want to save file
			 
			 FileOutputStream fout=new FileOutputStream(new File("writeusers.xlsx"));
			 
			 
			// finally write content 
			 
			 wb.write(fout);
			 
			// close the file
			 
			 fout.close();
			 
			  } catch (Exception e) {
			 
			   System.out.println(e.getMessage());
			 
			  }
	}
	
	public static void main(String[] args) throws IOException {
		
		WriteDataToExcel.writeFile();
		
		
	}
	
}

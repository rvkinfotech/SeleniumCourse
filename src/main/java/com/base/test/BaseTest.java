package com.base.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class BaseTest{

	public ExtentHtmlReporter extentHtmlReporter;
	public  ExtentReports extentReports;
	public  ExtentTest extentTest;
	
	public WebDriver webDriver;
	
	
	public BaseTest() {
		 
		  extentHtmlReporter=new ExtentHtmlReporter(System.getProperty("user.dir")+"\\test-output\\report.html");
		  extentHtmlReporter.config().setDocumentTitle("Regression Execution Report");
		  extentHtmlReporter.config().setReportName("Regression July Release");
		  extentHtmlReporter.config().setTheme(Theme.DARK);
		  
		  extentReports=new ExtentReports();
		  extentReports.attachReporter(extentHtmlReporter);
		  extentReports.setSystemInfo("HOSTNAME","LOCALHOST");
		  extentReports.setSystemInfo("OS","WINDOWS 10");
		  extentReports.setSystemInfo("BROWSER","FIREFOX");
	}
	
	
	public void initializedDriver(String browserName) {
		
		if(browserName.equals("Chrome")) {
			
			  System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Drivers\\chrome\\chromedriver.exe");
			  webDriver=new ChromeDriver();
			
		}else if(browserName.equals("Firefox")){
			 
			System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\Drivers\\gecko\\geckodriver.exe");
			webDriver=new FirefoxDriver();
			
		}else if(browserName.equals("Edge")) {
			
			System.setProperty("webdriver.edge.driver",System.getProperty("user.dir")+"\\Drivers\\edge\\msedgedriver.exe");
			webDriver=new EdgeDriver();
			 
			
			
		}else{
			
			webDriver=null;
		}
		
	}
	
	public void closeBrowser() {
		webDriver.close();
	}
	
	
	public void quitBrowser() {
		webDriver.quit();
	}
	
}

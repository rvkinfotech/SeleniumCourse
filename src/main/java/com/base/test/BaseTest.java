package com.base.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest{


	public WebDriver webDriver;
	
	public WebDriver initializedDriver(String browserName) {
		
		if(browserName.equals("Chrome")) {
			
			  System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\demo\\Drivers\\chrome\\chromedriver.exe");
			  webDriver=new ChromeDriver();
			
		}else if(browserName.equals("Firefox")){
			 
			System.setProperty("webdriver.gecko.driver","C:\\Users\\user\\eclipse-workspace\\demo\\Drivers\\gecko\\geckodriver.exe");
			webDriver=new FirefoxDriver();
			
		}else if(browserName.equals("Edge")) {
			
			System.setProperty("webdriver.edge.driver","C:\\Users\\user\\eclipse-workspace\\demo\\Drivers\\edge\\msedgedriver.exe");
			webDriver=new EdgeDriver();
			 
			
			
		}else{
			
			webDriver=null;
		}
		return webDriver;
	}
	
	public void closeBrowser() {
		webDriver.close();
	}
	
	
	public void quitBrowser() {
		webDriver.quit();
	}
	
}

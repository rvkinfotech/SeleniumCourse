package com.base.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest{


	public WebDriver webDriver;
	
	public WebDriver initializedDriver(String browserName) {
		
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
		return webDriver;
	}
	
	public void closeBrowser() {
		webDriver.close();
	}
	
	
	public void quitBrowser() {
		webDriver.quit();
	}
	
}

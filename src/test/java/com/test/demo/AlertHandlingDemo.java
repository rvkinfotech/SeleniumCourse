package com.test.demo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertHandlingDemo {

	public static void main(String[] args) throws InterruptedException { 
		System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\Drivers\\gecko\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("https://www.testandquiz.com/selenium/testing.html");   
		//Handling alert boxes  
	    //Click on generate alert button  
	driver.findElement(By.xpath("//button[contains(.,'Generate Alert Box')]")).click();  
	          
	    //Using Alert class to first switch to or focus to the alert box  
	   Alert alert = driver.switchTo().alert();  
	          
	    //Using accept() method to accep the alert box  
	    alert.accept();  
	          
	    //Handling confirm box  
	    //Click on Generate Confirm Box  
	    driver.findElement(By.xpath("//button[contains(.,'Generate Alert Box')]")).click();  
	          
	          
	    Alert confirmBox = driver.switchTo().alert();  
	          
	    //Using dismiss() command to dismiss the confirm box  
	    //Similarly accept can be used to accept the confirm box  
	    confirmBox.dismiss(); 
		}
}

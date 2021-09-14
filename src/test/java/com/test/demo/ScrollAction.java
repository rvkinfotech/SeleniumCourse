package com.test.demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScrollAction {

public static void main(String[] args) {
	
	System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\Drivers\\gecko\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
		      driver.get("https://www.tutorialspoint.com/about/about_careers.htm");
		      driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		      // identify element
		      WebElement n=driver.findElement(By.xpath("//*[text()='Privacy Policy']"));
		      // Javascript executor
		      ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", n);
		   }

}

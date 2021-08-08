package com.test.demo;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.base.test.BaseTest;

public class SimpleTestOnFacebosokLogin extends BaseTest {

	
	 WebDriver driver;
	
	 
	 
	 @BeforeClass
	 public void beforeClass() {
		 driver=initializedDriver("Firefox");
		 driver.get("https://www.facebook.com/");
	 }
	  
	  @Test public void verifyFirefoxBroserOpensFacebook() {
		  	
	  String actualTitle=driver.getTitle();
	  String expectedTitle="Facebook – log in or sign up"; assertEquals(actualTitle,
	  expectedTitle); 
	  quitBrowser();
		  
	  }
	  
	 

	@Test
	public void verifyFacebookLoginWithWrongCredentials() {

		driver.findElement(By.name("email")).sendKeys("Juju");
		driver.findElement(By.name("pass")).sendKeys("Juju");
		driver.findElement(By.name("login")).click();

		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}

		String actualError = driver.findElement(By.xpath("//*[contains(text(),'Invalid username or password')]")).getText();
		String expectedError = "Invalid username or password";

		assertEquals(expectedError, actualError);
		
	}
	
	
	

}

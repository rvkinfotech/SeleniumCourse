package com.test.demo;

import org.testng.annotations.Test;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.base.test.BaseTest;
import com.beust.jcommander.Parameter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;



@Listeners(com.test.demo.Listeners.class)

public class ExtentReportsDemo extends BaseTest {
	
  WebDriver driver;	
  
  ExtentHtmlReporter extentHtmlReporter;
  ExtentReports extentReports;
  ExtentTest extentTest;
 
  @BeforeTest
  public void setupReports() {
	  
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
  
  @BeforeClass
	public void beforeClass() {
	  driver=initializedDriver("Edge");
	}

	@AfterClass
	public void afterClass() {
		quitBrowser();
	}
  
  @Test(dataProvider = "dp", groups="Regression")
  public void test1(String userName, String userPassword) {
	  
	  extentTest=extentReports.createTest("Login to Facebook");
	  driver.get("https://www.facebook.com/");
	  driver.findElement(By.name("email")).sendKeys(userName);
		driver.findElement(By.name("pass")).sendKeys(userPassword);
		driver.findElement(By.name("login")).click();
		
  }
  
  @Parameters({"Browser"})  
  @Test(description = "Just to print", priority = 1, enabled = true, groups="BVT")
  public void test2(String browserName) {
	  extentTest=extentReports.createTest("Just Print");
	  System.out.println("Just to Print");
	  System.out.println(browserName);
  }
  
 

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "hello@gmail.com", "hello" },
      new Object[] { "hi@gmail.com", "hi" },
    };
  }
  
  @AfterTest
  public void closeReports() {
	  extentReports.flush();
  }
}

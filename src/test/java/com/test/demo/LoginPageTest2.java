package com.test.demo;

import org.testng.annotations.Test;

import com.base.test.BaseTest;
import com.selenium.demo.pageobject.LoginPge;
import com.selenium.demo.pageobject.DashboardPage;

public class LoginPageTest2 extends BaseTest{
  
	LoginPge lp;
	DashboardPage dp;
	
  @Test
  public void loginTest() {
	  extentTest=extentReports.createTest("Login to loginTest");
	  initializedDriver("Chrome");
	  webDriver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
	   lp=new LoginPge(webDriver);
	   dp=new DashboardPage(webDriver);
	   lp.doLoginOperation("admin@yourstore.com","admin");
	   lp.verifyHomePage("Dashboard");
	   extentReports.flush();
  }
}

package com.test.demo;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.base.test.BaseTest;
import com.selenium.demo.pageobjects.LoginPge;
import com.selenium.demo.pageobjects.DashboardPage;

public class LoginPageTest extends BaseTest{
  
	LoginPge lp;
	DashboardPage dp;
	
  @Test
  public void loginTest() {
	  initializedDriver("Chrome");
	  webDriver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
	   lp=new LoginPge(webDriver);
	   dp=new DashboardPage(webDriver);
	   lp.enterEmailId("admin@yourstore.com");
	   lp.enterPassword("admin");
	   lp.clickOnLoginBtn();
	   String actualText=dp.getDashboardHeader();
	   assertEquals("Dashboard", actualText);
	   
  }
}

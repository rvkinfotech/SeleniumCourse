package com.selenium.demo.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;




public class LoginPge {

	public WebDriver webDriver;
	public DashboardPage dp;
	
	@FindBy(id="Email")
	WebElement emailId;
	
	@FindBy(id="Password")
	WebElement passowrdField;
	
 	@FindBy(xpath="//button[@type='submit']")
	WebElement loginBtn;
	
	
	public LoginPge(WebDriver driver){
		webDriver=driver;
		dp=new DashboardPage(webDriver);
		PageFactory.initElements(webDriver, this);
		PageFactory.initElements(webDriver, this.dp);
	}
	
	public void doLoginOperation(String userName,String passwordparam) {
		emailId.clear();
		emailId.sendKeys(userName);
		passowrdField.clear();
		passowrdField.sendKeys(passwordparam);
		loginBtn.click();
		
	}
	
	public void verifyHomePage(String expected) {
		
		//Assert.assertEquals(expected,dp.getDashboardHeader());
	}
	
}

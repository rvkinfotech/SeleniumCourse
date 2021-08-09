package com.selenium.demo.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPge {

	public WebDriver webDriver;
	public LoginPge(WebDriver driver) {
		webDriver=driver;
	}
	
	By email=By.id("Email");
	By password=By.id("Password");
	By loginBtn=By.xpath("//button[@type='submit']");
	
	public void enterEmailId(String emailId) {
		webDriver.findElement(email).clear();
		webDriver.findElement(email).sendKeys(emailId);
	}
	
	public void enterPassword(String passWord) {
		webDriver.findElement(password).clear();
		webDriver.findElement(password).sendKeys(passWord);
	}
	
	public void clickOnLoginBtn() {
		webDriver.findElement(loginBtn).click();
	}
	
	
	
}

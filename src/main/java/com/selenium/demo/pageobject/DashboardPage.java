package com.selenium.demo.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {
	
	public WebDriver webDriver;
	
	@FindBy(xpath="//h1[contains(.,'Dashboard')]")
	WebElement dashbord;
	
	public DashboardPage(WebDriver driver) {
		webDriver=driver;
		PageFactory.initElements(webDriver, this);
	}
	
	public String getDashboardHeader() {
		return dashbord.getText();
	}
}


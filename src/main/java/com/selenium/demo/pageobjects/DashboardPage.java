package com.selenium.demo.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {
	
	public WebDriver webDriver;
	
	public DashboardPage(WebDriver driver) {
		webDriver=driver;
	}

	By dashboardHeader=By.xpath("//h1[contains(.,'Dashboard')]");
	
	public String getDashboardHeader() {
		return webDriver.findElement(dashboardHeader).getText();
	}
}

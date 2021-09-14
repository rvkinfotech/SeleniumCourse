package com.test.demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ExpectedConditionExample {

	// created reference variable for WebDriver
	WebDriver driver;

	@BeforeMethod
	public void setup() throws InterruptedException {
	System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\Drivers\\gecko\\geckodriver.exe");
	// initializing driver variable using FirefoxDriver
	driver=new FirefoxDriver();
	// launching gmail.com on the browser
	driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	// maximized the browser window
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void test() throws InterruptedException {
	// saving the GUI element reference into a "element" variable of WebElement type
	WebElement element = driver.findElement(By.id("txtUsername"));
	// entering username
	element.sendKeys("Admin");
	element.sendKeys(Keys.RETURN);
	// entering password
	driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	// clicking signin button
	driver.findElement(By.name("Submit")).click();
	// explicit wait - to wait for the compose button to be click-able
	WebDriverWait wait = new WebDriverWait(driver,30);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.className(".quickLinkText")));
	// click on the compose button as soon as the "compose" button is visible
	driver.findElement(By.className(".quickLinkText")).click();
	}

	@AfterMethod
	public void teardown() {
	// closes all the browser windows opened by web driver
	driver.quit();
	}
}

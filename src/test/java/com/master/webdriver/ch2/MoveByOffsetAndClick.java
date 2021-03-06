package com.master.webdriver.ch2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveByOffsetAndClick {

	public static void main(String... args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("file://C:/Selectable.html");
		WebElement seven = driver.findElement(By.name("seven"));
		System.out.println("X coordinate: "+seven.getLocation().getX()+" Ycoordinate: "+seven.getLocation().getY());
		Actions builder = new Actions(driver);
		builder.moveByOffset(seven.getLocation().getX()+1, seven.
		getLocation().getY()+1).click();
		builder.perform();
		}
}

package com.testing.practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RefreshBrowserInDifferentWays {

	
	static WebDriver driver;
	
	
	public static void main(String[] args) throws InterruptedException {
		driver = new FirefoxDriver();
		driver.get("https://www.google.co.in");
		Thread.sleep(3000);
		driver.navigate().refresh();//Most commonly used and simple command for refreshing a webpage.
		driver.findElement(By.id("lst-ib")).sendKeys(Keys.F5);//Second most commonly used command for refreshing a webpage. As it is using a send keys method, we must use this on any Text box on a webpage.
		driver.get(driver.getCurrentUrl());//This is a tricky one, as it is using another command as an argument to it. If you look carefully, it is just feeding get command with a page url.
		driver.navigate().to(driver.getCurrentUrl());
	}
	

}

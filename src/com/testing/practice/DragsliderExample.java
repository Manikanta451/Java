package com.testing.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


public class DragsliderExample {

	WebDriver driver;
	
	@Test
	public void testDragAndDropExample() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "E:\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.flipkart.com");
		Thread.sleep(6000);
		//Wait for the frame to be available and switch to it
		WebElement appliances =driver.findElement(By.xpath("/html/body/div[1]/div/header/div[2]/div/ul/li[2]/a/span"));
		appliances.click();
		Thread.sleep(1000);
		WebElement fullhd =driver.findElement(By.xpath("/html/body/div[1]/div/header/div[2]/div/ul/li[2]/ul/li/ul/li[1]/ul/li[3]/a/span"));
		fullhd.click();
		Thread.sleep(4000);
		WebElement Destinationlocator = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div[1]/div/div/div[2]/section/div[3]/div[1]/div[1]/div"));
		
		Actions move = new Actions(driver);
		Action action = (Action) move.dragAndDropBy(Destinationlocator, 60, 0).build();
		Thread.sleep(2000);
		action.perform();
		
	
	
		
	}
	

}

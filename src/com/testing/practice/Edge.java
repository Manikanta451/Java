package com.testing.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

 
public class Edge {
	
	
 @Test
	public void luanchedge(){
		
		
 
		// Set the driver path
		System.setProperty("webdriver.edge.driver","C://Program Files (x86)//Microsoft Web Driver//MicrosoftWebDriver.exe");
		
		//Start Edge Session
		WebDriver driver=new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("http://learn-automation.com");
		
		driver.quit();
		
 
	}
 
}

package com.test.flightsite;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheaoOair {
	
	
	public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D://ElopParentProject//BrowserDrivers//chromedriver.exe");
        WebDriver driver = new ChromeDriver();              
        driver.get("https://www.cheapoair.com/");
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
     	driver.manage().window().maximize();
     	driver.findElement(By.id("ember760")).sendKeys("HYD - Hyderabad, India");
     	Thread.sleep(1000);
    	driver.findElement(By.id("ember765")).sendKeys("VTZ - Vishakhapatnam, India");
     	
     	
        

    }
}

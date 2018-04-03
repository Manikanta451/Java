package com.test.seleniumpracticesite;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AjaxDropdown {

public static void main(String []args)throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver","D://ElopParentProject//BrowserDrivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://suvian.in/selenium/1.10selectElementFromDD.html");
		driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
		Thread.sleep(2000);
		List<WebElement> list = driver.findElements(By.xpath("/html/body/div[1]/div/div/div/div/div/div"));
		for (WebElement ele : list){
	          System.out.println("Values " + ele.getAttribute("innerHTML"));
	          if (ele.getAttribute("innerHTML").contains("Option 3")) {
	             ele.click();
	             break;
	            }
             }
         }
}
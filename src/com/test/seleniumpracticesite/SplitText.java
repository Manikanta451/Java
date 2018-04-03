package com.test.seleniumpracticesite;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SplitText {
	
public static void main(String []args){
		
		System.setProperty("webdriver.chrome.driver","D://ElopParentProject//BrowserDrivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://suvian.in/selenium/1.9copyAndPasteTextAdvanced.html");
		String text=driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/h3[1]")).getText();
		String splittext=text.substring(36,59);
		driver.findElement(By.id("copyandpasteadvanced")).sendKeys(splittext);
	   
		//driver.quit();
		
		
    }
}

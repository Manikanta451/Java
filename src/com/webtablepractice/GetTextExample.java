package com.webtablepractice;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextExample {
	static WebDriver driver;
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E://Seleniumeclipsewoekspace//AdoptABlock//BrowserDrivers//chromedriver.exe");
		 driver= new ChromeDriver();
		driver.get("https://www.google.co.in/");
		List<WebElement> languages=driver.findElements(By.xpath("//div[@id='_eEe']/a"));
             //System.out.println("Languages supported by Google are:");
		for(WebElement alllanguages:languages)
			System.out.println(alllanguages.getText());
		driver.quit();
	}
}
package com.testing.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingBrowser {

	public static void main(String[] args) {
		WebDriver driver =new FirefoxDriver();
		driver.get("http://www.gcreddy.com/");
		
		String PageTitle=driver.getTitle();
		System.out.println(PageTitle);
		
		String URL=driver.getCurrentUrl();
		System.out.println(URL);

		String PageSource=driver.getPageSource();
		System.out.println(PageSource);
		
		String WindoeHandle=driver.getWindowHandle();
		System.out.println(WindoeHandle);

	}

}

package com.testing.practice1;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TestNGDemo_App {

	public String str;
	WebDriver driver;
	
	@Test(priority=1)
	public void StartApp(){
		System.setProperty("webdriver.chrome.driver","D://ElopParentProject//BrowserDrivers//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.demo.guru99.com/V4/index.php");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String CurrentURL= driver.getCurrentUrl();
		driver.manage().window().maximize();
		Assert.assertTrue(CurrentURL.contains("/V4/"));
	}
	
	@Test(priority=2)
	public void LoginApp() throws InterruptedException{
		Thread.sleep(5000);
		driver.findElement(By.name("uid")).sendKeys("mngr84776");
		driver.findElement(By.name("password")).sendKeys("rebAtAm");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Boolean status= driver.findElement(By.xpath("//h2[@class='barone']")).isDisplayed();
		Assert.assertTrue(status);
	}
	
	@Test(priority=3)
	public void LogoutApp() throws InterruptedException{
		Thread.sleep(5000);
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,100)","");
		Thread.sleep(1000);
		List<WebElement> list=driver.findElements(By.tagName("a"));
	       for(WebElement ele : list){
	    	   if (ele.getAttribute("href").equals("http://www.demo.guru99.com/V4/manager/Logout.php")){
	    		   ele.click();
	    		   Thread.sleep(1000);
	    		   checkAlert();
		    	}
	       }
		
   }
	
	public boolean checkAlert() {
		try {
			str = driver.switchTo().alert().getText();
			driver.switchTo().alert().accept();
			return true;
		} catch (NoAlertPresentException Ex) {
				Ex.printStackTrace();
		}
		return false;
	}
	
	
}


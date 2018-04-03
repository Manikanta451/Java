package com.testing.practice1;



import java.util.concurrent.TimeUnit;

import org.testng.annotations.*;

import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Adb {
  private WebDriver driver;
  private String baseUrl;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    driver.manage().window().maximize();
    baseUrl = "http://www.righttechwebprojects.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testAdb() throws Exception, InterruptedException {
    driver.get(baseUrl);
    driver.findElement(By.xpath("/html/body/div[2]/form/div[3]/div[2]/div[2]/div[1]/div/ul/li[3]/a")).click();
    Thread.sleep(5000);
    driver.findElement(By.xpath("/html/body/div[2]/form/div[4]/div[2]/div[1]/div/ul/li[1]/a/div/img")).click();
    Thread.sleep(5000);
    driver.findElement(By.xpath("//div[@id='googft-mapCanvas']/div/div/div/div[3]/div")).click();
    Thread.sleep(8000);
    driver.findElement(By.linkText("Adopt this block")).click();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_ddl_Reg_Type")).click();
    new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder1_ddl_Reg_Type"))).selectByVisibleText("Individual");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txt_Reg_Name")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txt_Reg_Name")).sendKeys("Manikanta");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txt_Address1")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txt_Address1")).sendKeys("1255 Lynnfirld Road");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txt_Address2")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txt_Address2")).sendKeys("Suite226");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txt_City")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txt_City")).sendKeys("Memphis");
    new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder1_ddl_States"))).selectByVisibleText("ME");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txt_Zipcode")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txt_Zipcode")).sendKeys("38119");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txt_PContactName")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txt_PContactName")).sendKeys("Manikanta");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txt_Title")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txt_Title")).sendKeys("Sample");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txt_Phoneno")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txt_Phoneno")).sendKeys("9666597666");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txt_Mobileno")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txt_Mobileno")).sendKeys("9666811666");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txt_AltContactEmail")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txt_AltContactEmail")).sendKeys("mani6747@gmail.com");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txt_AltContactName")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txt_AltContactName")).sendKeys("kady");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txt_AltPhoneNo")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txt_AltPhoneNo")).sendKeys("08842357894");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txt_NewLoginEmail")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txt_NewLoginEmail")).sendKeys("mani6747@gmail.com");
    new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder1_ddlLoginType"))).selectByVisibleText("Existing Login");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txt_ExtLoginEmail")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txt_ExtLoginEmail")).sendKeys("mani6747@gmail.com");
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txt_ExtPassword")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txt_ExtPassword")).sendKeys("123456");
    new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder1_ddlWhyAdoptablock"))).selectByVisibleText("I love my neighborhood");
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  
}


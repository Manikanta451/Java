package com.testing.practicerealtimequestions;


import  static org.junit.Assert.*;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public  class CBTExampleTest {

	static String username = "ebiztesting57%40gmail.com";// @ character must be encoded as %40
	static String authkey = "u588be47ccc60e0f"; // Your authkey

	public  static void main(String[]  args) throws Exception {
			DesiredCapabilities caps =  new DesiredCapabilities();
			caps.setCapability("name", "Selenium Test Example");
			caps.setCapability("build", "1.0");
			caps.setCapability("browser_api_name", "Edge14");
			caps.setCapability("os_api_name", "Win10-E14");// the os_api_name was not valid	
			caps.setCapability("screen_resolution", "1024x768");
			RemoteWebDriver driver =  new RemoteWebDriver(new URL("http://" + username +":" + authkey +  "@hub.crossbrowsertesting.com:80/wd/hub"),  caps); //quotation marks had been removed from where they needed to be on this line.
			System.out.println(driver.getSessionId());
                    // we wrap the test in a try catch loop so we can log assert failures in our system
				try {
					// load the page url
					System.out.println("Loading Url");
					driver.get("http://crossbrowsertesting.github.io/selenium_example_page.html");
					// maximize the window - DESKTOPS ONLY
					System.out.println("Maximizing window");
					driver.manage().window().maximize();
					// Check the page title (try changing to make the assertion fail!)
					assertEquals(driver.getTitle(),"Selenium Test Example Page");
					System.out.println(driver.getTitle());
				} catch (AssertionError  ae) {
					 ae.printStackTrace();
				} catch (Exception  a) {
					a.printStackTrace();
				} finally {
					driver.quit();
				}

			}

}

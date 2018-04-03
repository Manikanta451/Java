package com.testing.practice1;

import java.io.IOException;
import java.util.List;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FindBrokenLinksExample {
	
	private WebDriver driver;
	private int invalidLinksCount;

	@BeforeClass
	public void setUp() {
		driver = new FirefoxDriver();
		driver.get("http://google.com");
	}

	@Test
	public void validateInvalidLinks() throws Exception, ClientProtocolException, IOException {

		invalidLinksCount = 0;
		List<WebElement> anchorTagsList = driver.findElements(By.tagName("a"));
				
		System.out.println("Total no. of links are "+ anchorTagsList.size());
				
		for (WebElement anchorTagElement : anchorTagsList) {
			if (anchorTagElement != null) {
				String url = anchorTagElement.getAttribute("href");
				System.out.println(url);
				if (url != null && !url.contains("javascript")) {
					verifyURLStatus(url);
				} else {
					invalidLinksCount++;
				}
			}
		}

		System.out.println("Total no. of invalid links are "+ invalidLinksCount);
	}

	@AfterClass
	public void tearDown() {
		if (driver != null)
			driver.quit();
	}

	public void verifyURLStatus(String URL) throws ClientProtocolException, IOException, Exception {

		HttpClient client = HttpClientBuilder.create().build();
		HttpGet request = new HttpGet(URL);
		HttpResponse response = client.execute(request);
		// verifying response code and The HttpStatus should be 200 if not,
		// increment invalid link count
		////We can also check for 404 status code like response.getStatusLine().getStatusCode() == 404
		if (response.getStatusLine().getStatusCode() != 200)
			invalidLinksCount++;
	}
}

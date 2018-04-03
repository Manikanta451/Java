package com.testing.practice1;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry implements IRetryAnalyzer {
	
	int min=0;
	int max=2;

	@Override
	public boolean retry(ITestResult resilt) {

		if (min<=max) {
			System.out.println("Following test is failing " +resilt.getName());
			min++;
			return true;
		}
		return false;
	}

}

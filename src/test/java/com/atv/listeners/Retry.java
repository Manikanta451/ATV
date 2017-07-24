package com.atv.listeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry implements IRetryAnalyzer {
	int min=0;
	int max=2;

	public boolean retry(ITestResult result) {
		if (min<=max) {
			System.out.println("Following test is failing " +result.getName());
			min++;
			return true;
		}
		return false;
	} 

}

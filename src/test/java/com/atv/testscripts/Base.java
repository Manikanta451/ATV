package com.atv.testscripts;

import org.openqa.selenium.WebDriverException;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import com.atv.pagefactory.DriverHome;
import com.atv.pagefactory.Login;
import com.atv.utilities.Xls_Reader;

/**
 * 
 * 
 * This is the base class for all the test suites,It executes before executing
 * the TestSuite Classes
 * 
 */

public class Base {

	public DriverHome driverhome;
	public Login login;
	public static String passMessage = null;
	public static String finalMessage = null;
	public static String skipMessage = null;
	public Xls_Reader xls;

	@BeforeTest
	@Parameters({ "browser" })
	public void setUp(String browser) throws Exception {
		try {
			Reporter.log("=====Browser Session Started=====", true);
			driverhome = new DriverHome(browser, "test");	
		} catch (WebDriverException e) {
			e.printStackTrace();	
		}
	}

	
	@AfterTest
	public void close() throws Exception {
		try {
			Thread.sleep(5000);
			//driverhome.quitDriver();
			Reporter.log("=====Browser Session End=========", true);
		} catch (WebDriverException e) {
			e.printStackTrace();
		}
	}
	
}
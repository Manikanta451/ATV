package com.atv.pagefactory;

import org.openqa.selenium.WebDriver;
import com.atv.datainitialization.DataInt;
import com.atv.pageobjects.LoginPageObjects;

public class Login extends LoginPageObjects{
	
	public Login(WebDriver driver) {
		super(driver);
	}

	public void accountlogin(DataInt dataInt) throws Exception {
			waitForSeconds(5);
			Emailid.sendKeys(dataInt.getEmail());
			waitForSeconds(2);
			Password.sendKeys(dataInt.getPassword());
			waitForSeconds(2);
			Loginbutton.click();
	  }		
}
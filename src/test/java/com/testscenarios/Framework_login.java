package com.testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.objectrepository.Locators;
import com.utilities.CommonFunctions;

import java.io.FileInputStream;
import java.util.Properties;

	  public class Framework_login extends CommonFunctions{
		  Locators lc = new Locators();
	    @Test
	    
	    public void f() throws Exception{
	    	chromeBrowserLaunch();
	  	FileInputStream file = new FileInputStream(".\\src\\test\\resources\\QA.properties");
	  	Properties p =new Properties();
	  	p.load(file);
	  	  
	  	  driver.get("https://www.justrechargeit.com/SignIn.aspx");
	  	  //type date into All edit boxes
	  	  driver.findElement(lc.JRI_login_email).sendKeys(p.getProperty("email"));
	  	  driver.findElement(lc.JRI_login_password).sendKeys(p.getProperty("password"));
	  	  driver.findElement(lc.JRI_login_captcha).sendKeys(p.getProperty("captcha"));
	    }
	  	  
	  	  //Click on Secure signin button
	  	  
	  	  //driver.findElement(lc.JRI_login_signin).click();
	  	public void clickByAnyLocator(By JRI_login_signin) throws Exception {	
			WebElement element = driver.findElement(JRI_login_signin);
			// Check your locator is displayed?
			if (driver.findElements(JRI_login_signin).size() > 0) {
				// Check your element is in enable state?
				if (element.isEnabled()) {
					// Click on Button/radiobutton/checkbox/Link...
					element.click();
				} else {
					System.out.println("Given locator is not enable state on DOM(Current page***");
				}
			} else {
				System.out.println("Given locator is not displayed on DOM(Current page***");
	    }
	  

	  	}
	    }
  


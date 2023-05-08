package com.testscenarios;

import org.testng.annotations.Test;

import com.objectrepository.Locators;

import java.io.FileInputStream;
import java.util.Properties;


	  import org.openqa.selenium.WebDriver;
	  import org.openqa.selenium.chrome.ChromeDriver;

	  public class Framework_login {
		  Locators lc = new Locators();
	    @Test
	    
	    public void f() throws Exception{
	  	  WebDriver driver;
	  	  driver = new ChromeDriver();
	  	FileInputStream file = new FileInputStream(".\\src\\test\\resources\\QA.properties");
	  	Properties p =new Properties();
	  	p.load(file);
	  	  
	  	  driver.get("https://www.justrechargeit.com/SignIn.aspx");
	  	  //type date into All edit boxes
	  	  driver.findElement(lc.JRI_login_email).sendKeys(p.getProperty("email"));
	  	  driver.findElement(lc.JRI_login_password).sendKeys(p.getProperty("password"));
	  	  driver.findElement(lc.JRI_login_captcha).sendKeys(p.getProperty("captcha"));
	  	  
	  	  //Click on Secure signin button
	  	  driver.findElement(lc.JRI_login_signin).click();
	    }
	  

  }
  


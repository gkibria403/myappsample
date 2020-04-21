package testcases;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.Landingpage;
import utilities.BrowserSetup;

public class ChromeTestLogin {
	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		driver=BrowserSetup.getBrowser("chrome");
	}

	@Test
	public void login() {
	    driver.get(Landingpage.url);
	    //Landingpage.Click_login_link(driver);
	    driver.findElement(Landingpage.show_options).click();
	    
	    //now we are in the login page
	    
	    
	}
	

	@AfterMethod
	public void closeBrowser() {
		//driver.quit();
	}

}

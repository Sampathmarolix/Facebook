package com.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.BaseClsa;

public class LoginPage extends BaseClsa{

	

		
		@FindBy(name="emailid")  
		WebElement emailid;
		
		@FindBy(xpath="//input[@id='pword']")
		WebElement pword;
		
		
		@FindBy(xpath="//button[text()='Login']")
		WebElement Login;
		
		
		
		@FindBy(xpath="//img[@src='/WebApp/assets/dist/img/logo.png']")
		WebElement logo;
		
		
		
		//Initialization step 2
		
	    public LoginPage() {
		
		PageFactory.initElements(driver, this);
	    }
	    
	    
		public HomePage login() {
			
			     
			
			emailid.sendKeys(prop.getProperty("username"));
			pword.sendKeys(prop.getProperty("password"));
			Login.click();
			return new HomePage();
		}
		
		public String titletest() { 
			
		return driver.getTitle();	
			
	}

}

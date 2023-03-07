package com.Testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Base.BaseClsa;
import com.Pages.HomePage;
import com.Pages.LoginPage;


public class LoginTest extends BaseClsa{
	
	
	 LoginPage loginpage;
	 HomePage hp;
	 
	public LoginTest() {
		
		super();
	}
	
	
	@BeforeMethod
	
	public void setup() {
		
		initialization();
			
			loginpage = new LoginPage();
			hp = new HomePage();
			
		}
	
	@Test
	public void verifylogin() {
		
		hp= loginpage.login();
	
	}
	

}

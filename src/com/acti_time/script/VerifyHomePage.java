package com.acti_time.script;

import org.testng.annotations.Test;

import com.acti_time.pom.HomePage;
import com.acti_time.pom.LoginPage;

public class VerifyHomePage extends BaseTest
{

	@Test
	public void verifyHomePage() throws InterruptedException
	{
		LoginPage l1=new LoginPage(driver);
				l1.setUsername("admin");
				l1.setPassword("manager");
				l1.clickOnLoginButton();
			
		Thread.sleep(3000);
		HomePage h1=new HomePage(driver);
				h1.clickOnLogoutButton();
	}
}

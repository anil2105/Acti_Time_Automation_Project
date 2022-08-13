package com.acti_time.script;

import org.testng.annotations.Test;

import com.acti_time.pom.LoginPage;

public class VerifyValidLoginPage extends BaseTest
{

	@Test
	public void verifyValidLoginPage()
	{
		LoginPage l1=new LoginPage(driver);
				l1.setUsername("admin");
				l1.setPassword("manager");
				l1.clickOnLoginButton();
	}
	
}

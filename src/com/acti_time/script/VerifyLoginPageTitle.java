package com.acti_time.script;

import org.testng.annotations.Test;

import com.acti_time.pom.LoginPage;

public class VerifyLoginPageTitle extends BaseTest
{
	
	@Test
	public void verifyLoginPagaTitle()
	{
		LoginPage l1=new LoginPage(driver);
				l1.verifyTitle("actiTIME - Login");
				
	}
}

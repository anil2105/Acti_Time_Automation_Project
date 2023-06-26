package com.acti_time.script;

import org.testng.annotations.Test;

import com.acti_time.pom.InvalidLoginPage;
import com.acti_time.pom.LoginPage;

public class VerifyInvalidLoginPage extends BaseTest
{
	
	@Test
	public void verifyInvalidLoginPage() throws InterruptedException
	{
		LoginPage l1=new LoginPage(driver);
				l1.setUsername("aaaaa");
				l1.setPassword("bbbbbbb");
				l1.clickOnLoginButton();
		
		Thread.sleep(3000);
		
		InvalidLoginPage i1=new InvalidLoginPage(driver);
				i1.verifyErrorMsg();
				
	}
}

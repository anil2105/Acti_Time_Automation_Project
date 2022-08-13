package com.acti_time.script;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.acti_time.pom.HomePage;
import com.acti_time.pom.LoginPage;

public class VerifyHomePageTitle extends BaseTest
{
	
	@Test
	public void verifyHomePageTitle() throws InterruptedException
	{	
		LoginPage l1=new LoginPage(driver);
				l1.setUsername("admin");
				l1.setPassword("manager");
				l1.clickOnLoginButton();

		Thread.sleep(3000);
	
		WebDriverWait wait=new WebDriverWait(driver, 20);
		
		wait.until(ExpectedConditions.titleContains("Time"));
				l1.verifyTitle("actiTIME - Enter Time-Track");
		
		
		HomePage h1=new HomePage(driver);
				h1.clickOnLogoutButton();
			
	}
}

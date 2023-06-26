package com.acti_time.script;

import org.testng.annotations.Test;

import com.acti_time.pom.HomePage;
import com.acti_time.pom.LoginPage;
import com.acti_time.pom.Reports;

public class VerifyReports extends BaseTest
{

	@Test
	public void verifyReports() throws InterruptedException
	{
		LoginPage l1=new LoginPage(driver);
		l1.setUsername("admin");
		l1.setPassword("manager");
		l1.clickOnLoginButton();
		
		Thread.sleep(3000);
		
		Reports r1=new Reports(driver);
				r1.clickOnReports();
				
				Thread.sleep(2000);
				r1.clickOnCreateReport();
				
				Thread.sleep(2000);
				r1.clickOnBillingSummary();
				
				Thread.sleep(2000);
				r1.clickOnCLoseIcon();
	
		Thread.sleep(3000);

		HomePage h1=new HomePage(driver);
		h1.clickOnLogoutButton();
		
		
		
	}
}

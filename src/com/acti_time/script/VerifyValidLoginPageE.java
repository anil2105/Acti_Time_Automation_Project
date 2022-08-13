package com.acti_time.script;

import org.testng.annotations.Test;

import com.acti_time.generics.Excel;
import com.acti_time.pom.HomePage;
import com.acti_time.pom.LoginPage;

public class VerifyValidLoginPageE extends BaseTest
{
	
	@Test
	public void verifyValidLoginPageE() throws InterruptedException
	{
		String sheet="VerifyValidLoginPageE";
		
		String un = Excel.getCell(PATH, sheet, 1, 1);
		
		String pw = Excel.getCell(PATH, sheet, 1, 2);
		
		String lpt = Excel.getCell(PATH, sheet, 1, 3);

		String hpt = Excel.getCell(PATH, sheet, 1, 4);
		
		LoginPage l1=new LoginPage(driver);
				l1.verifyTitle(lpt);
				l1.setUsername("admin");
				l1.setPassword("manager");
				l1.clickOnLoginButton();
				
		HomePage h1=new HomePage(driver);
		
				Thread.sleep(3000);
				h1.verifyTitle(hpt);
				
				Thread.sleep(3000);
				h1.clickOnLogoutButton();

	}
	
	
}

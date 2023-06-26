package com.acti_time.script;

import org.testng.annotations.Test;

import com.acti_time.generics.Excel;
import com.acti_time.pom.InvalidLoginPage;
import com.acti_time.pom.LoginPage;

public class VerifyInvalidLoginPageE extends BaseTest
{
	
	@Test
	public void verifyInvalidLoginPageE() throws InterruptedException
	{
		String sheet="VerifyInvalidLoginPageE";
		
		int totalRowCount = Excel.getRowCount(PATH, sheet);
		
		for(int i=1; i<=totalRowCount; i++)
		{
			String un = Excel.getCell(PATH, sheet, i, 1);
			
			String pw = Excel.getCell(PATH, sheet, i, 2);
			
			LoginPage l1=new LoginPage(driver);
					l1.setUsername(un);
					l1.setPassword(pw);
					l1.clickOnLoginButton();
					
			InvalidLoginPage i1=new InvalidLoginPage(driver);
			
					Thread.sleep(3000);
			
					i1.verifyErrorMsg();
							
		}
	}
}

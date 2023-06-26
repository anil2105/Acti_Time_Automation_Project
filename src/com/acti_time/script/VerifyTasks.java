package com.acti_time.script;

import org.testng.annotations.Test;

import com.acti_time.pom.HomePage;
import com.acti_time.pom.LoginPage;
import com.acti_time.pom.Tasks;

public class VerifyTasks extends BaseTest
{

	@Test
	public void verifyTasks() throws InterruptedException
	{
		LoginPage l1=new LoginPage(driver);
				l1.setUsername("admin");
				l1.setPassword("manager");
				l1.clickOnLoginButton();
		
		
		Tasks t1=new Tasks(driver);
		
			Thread.sleep(2000);
			t1.clickOnTasks();
			
			Thread.sleep(2000);
			t1.clickOnTaskName("Anil");
			
			Thread.sleep(2000);
			t1.clickOnApplyFilter();
	
		Thread.sleep(3000);
		
		HomePage h1=new HomePage(driver);
		h1.clickOnLogoutButton();
	}
}

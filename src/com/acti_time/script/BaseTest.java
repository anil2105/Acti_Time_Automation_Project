

package com.acti_time.script;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public abstract class BaseTest implements AutomationConstant
{
	
	public WebDriver driver;
	
	//PreCondition 
	@BeforeClass
	public void preCondition()
	{
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");	//Open the browser
		driver= new ChromeDriver();
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Enter the URL
		driver.get("http://localhost/login.do");
	
		//Wait for 20 secs if application slow
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	//PostCondition
	@AfterClass
	public void postCondition()
	{
		//Closes the current window
		driver.close();
		
		//Closes all the windows
		//driver.quit();
	}
}

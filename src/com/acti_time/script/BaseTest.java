package com.acti_time.script;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public abstract class BaseTest implements AutomationConstant {

	public WebDriver driver;

	// PreCondition
	@BeforeClass
	public void preCondition() {

		WebDriverManager.chromedriver().setup(); // Open the browser
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);

		// Maximize the window
		driver.manage().window().maximize();
		
		// Wait for 20 secs if application slow
		// driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
		// Enter the URL
		driver.get("http://localhost/login.do");
	}
	
	// PostCondition
	@AfterClass
	public void postCondition() {
		// Closes the current window
		driver.close();

		// Closes all the windows
		// driver.quit();
	}
}

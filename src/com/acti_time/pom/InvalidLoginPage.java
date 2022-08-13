package com.acti_time.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class InvalidLoginPage extends BasePage
{

	@FindBy(xpath="//span[contains(text(), 'invalid.')]")
	private WebElement errorMsg;
	
	public InvalidLoginPage(WebDriver driver)
	{
		super(driver);
		
		PageFactory.initElements(driver, this);
		
	}
	
	public void verifyErrorMsg()
	{
		Assert.assertTrue(errorMsg.isDisplayed());
	}
}

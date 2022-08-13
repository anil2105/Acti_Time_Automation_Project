package com.acti_time.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimeLink extends BasePage
{

	@FindBy(xpath="//a[.='actiTIME Inc.']")
	
	private WebElement actiTimeLink;
	
	public ActiTimeLink(WebDriver driver)
	{
		super(driver);
		
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnActiTimeLink()
	{
		actiTimeLink.click();
	}
	
	public void clickOnNewtab()
	{
		Actions action=new Actions(driver);
		
		action.moveToElement(actiTimeLink).sendKeys("t").perform();
	}
}

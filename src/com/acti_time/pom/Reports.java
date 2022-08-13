package com.acti_time.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Reports extends BasePage
{
	
	@FindBy(xpath="//div[.='REPORTS']")
	private WebElement reports;
	
	@FindBy(id="ext-gen30")
	private WebElement newReports;
	
	@FindBy(id="ext-gen74")
	private WebElement billingSummary;
	
	
	public Reports(WebDriver driver)
	{
		super(driver);
		
		PageFactory.initElements(driver, this);
	}
	
	
	public void clickOnReports()
	{
		reports.click();
	}
	
	public void clickOnNewReports()
	{
		Actions action=new Actions(driver);
		
		action.moveToElement(newReports).click().perform();
		
	}
	
	public void clickOnBillingSummary()
	{
		billingSummary.click();
	}
	
}



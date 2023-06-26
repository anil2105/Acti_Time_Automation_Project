package com.acti_time.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Reports extends BasePage
{
	
	@FindBy(css = ".reports img.sizer")
	private WebElement reports;
	
	@FindBy(xpath ="//span[contains(text(),'Create Report')]")
	private WebElement createReport;
	
	@FindBy(xpath ="//span[contains(text(),'Billing Summary')]")
	private WebElement billingSummary;
	
	@FindBy(xpath = "//img[@id='closeLightbox']")
	private WebElement closeIcon;
	
	
	public Reports(WebDriver driver)
	{
		super(driver);
		
		PageFactory.initElements(driver, this);
	}
	
	
	public void clickOnReports()
	{
		reports.click();
	}
	
	public void clickOnCreateReport()
	{
		Actions action=new Actions(driver);
		
		action.moveToElement(createReport).click().perform();
		
	}
	
	public void clickOnBillingSummary()
	{
		billingSummary.click();
	}
	
	public void clickOnCLoseIcon()
	{
		closeIcon.click();
	}
	
}



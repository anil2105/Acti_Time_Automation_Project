package com.acti_time.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tasks extends BasePage
{

	@FindBy(xpath="//div[.='TASKS']")
	private WebElement tasks;
	
	@FindBy(name="visiableFilterString")
	private WebElement taskName;
	
	@FindBy(id="tasksFilterSubmitButton")
	private WebElement applyFilter;
	
	
	public Tasks(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	
	public void clickOnTasks()
	{
		tasks.click();
	}
	
	public void clickOnTaskName(String ftn)
	{
		taskName.sendKeys(ftn);
	}
	
	public void clickOnApplyFilter()
	{
		applyFilter.click();
	}
	
}

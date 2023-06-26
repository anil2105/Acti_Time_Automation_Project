package com.acti_time.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckBox extends BasePage
{
	
	@FindBy(id="keepLoggedInCheckBox")
	
	private WebElement checkBox;
	
	public CheckBox(WebDriver driver)
	{
		super(driver);
		
		PageFactory.initElements(driver, this);
	}
	
	public void clickCheckBox()
	{
		checkBox.click();
		
		if(checkBox.isDisplayed())
		{
			System.out.println("True: Check box is selected");
		}
		else
		{
			System.out.println("False: Check box is not slected");
		}
	}
}

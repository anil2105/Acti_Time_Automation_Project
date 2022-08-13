package com.acti_time.script;

import org.testng.annotations.Test;

import com.acti_time.pom.CheckBox;

public class VerifyCheckBox extends BaseTest
{

	@Test
	public void verifyCheckBox()
	{
		CheckBox c1=new CheckBox(driver);
				c1.clickCheckBox(); 
	}
}

package com.acti_time.script;

import org.testng.annotations.Test;

import com.acti_time.pom.Version;

public class VerifyVersion extends BaseTest
{

	@Test
	public void verifyVersion()
	{
		Version v1=new Version(driver);
				v1.verifyVersion("actiTIME 2016.3");
	}
}

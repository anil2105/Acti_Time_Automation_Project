package com.acti_time.script;

import org.testng.annotations.Test;

import com.acti_time.generics.Excel;
import com.acti_time.pom.Version;

public class VerifyVersionE extends BaseTest
{
	@Test
	public void verifyVersionE()
	{
		String sheet="VerifyVersionE";
		
		String version = Excel.getCell(PATH, sheet, 1, 1);
		
		Version v1=new Version(driver);
				
			v1.verifyVersion(version);
		
	}
	
}

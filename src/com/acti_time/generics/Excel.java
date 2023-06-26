package com.acti_time.generics;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel 
{
	
	//row count
	
	public static int getRowCount(String path,String sheet) //Return type is int
	{
		int rc=0;
			
		try
		{
			FileInputStream fis=new FileInputStream(path);
			
			Workbook wb = WorkbookFactory.create(fis);
			
			rc=wb.getSheet(sheet).getLastRowNum();
		}
		
		catch(Exception e)
		{
			System.out.println("We are not able to count last row number");
		}
		
		return rc;
	}


//.....................................................
	//cell count
	
	public static int getCellCount(String path,String sheet, int r) //Return type is int
	{
		int rc=0;
		
		try
		{
			FileInputStream fis=new FileInputStream(path);
		
			Workbook wb = WorkbookFactory.create(fis);
		
			rc=wb.getSheet(sheet).getRow(r).getLastCellNum();
		}
	
		catch(Exception e)
		{
			System.out.println("We are not able to count last cell number");
		}
	
		return rc;
	}
	
//.....................................................
	//printing purpose
	
	public static String getCell(String path,String sheet,int r, int c) //Return type is String
	{
		String getSheet="";
			
		try
		{
			FileInputStream fis=new FileInputStream(path);
			
			Workbook wb = WorkbookFactory.create(fis);
			
			getSheet=wb.getSheet(sheet).getRow(r).getCell(c).toString();
		}
		
		catch(Exception e)
		{
			System.out.println("We are not getting cell");
		}
		
		return getSheet;
	}
}

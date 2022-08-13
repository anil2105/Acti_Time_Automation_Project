package com.data_driven_testing;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_PrintContents_3Rows3Columns 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		
		//modify code --> Rel filepath
		String path1=".//data//Book1.xlsx"; 
		
		FileInputStream fis=new FileInputStream(path1);
		
		Workbook wb = WorkbookFactory.create(fis);
		
		for(int i=0;i<=2;i++) //3 rowCount-->starts from 0th index
		{
			for(int j=0;j<=2;j++) //3 columnCount-->starts from 0th index
			{
				String printValue = wb.getSheet("Emp_Details").getRow(i).getCell(j).toString();
				System.out.print(printValue+"     ");
			}
				System.out.println(); //to go to next line
		}  
	}
}

package com.data_driven_testing;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelModifiedCode 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		//modify code --> Rel filepath
		String path1=".//data//Book1.xlsx"; 
				
		FileInputStream fis=new FileInputStream(path1);
				
		Workbook wb = WorkbookFactory.create(fis);
				
		//modify excel sheet
		Cell sh1 = wb.getSheet("Emp_Details").getRow(4).getCell(4); 
				
		//toString --> for printing the value
		String printValue = sh1.toString();
				
		System.out.println(printValue); //Bangalore
	}
}

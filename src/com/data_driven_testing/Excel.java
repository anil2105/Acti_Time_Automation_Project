package com.data_driven_testing;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		String path="C:\\Users\\Admin\\Desktop\\Anil\\Poo\\E_Commerce_Domain\\Acti_Time_Automation_Project\\data\\Book1.xlsx";
		
		FileInputStream fis=new FileInputStream(path);
		
		Workbook wb = WorkbookFactory.create(fis);
		
		//Sheet
		Sheet sheet = wb.getSheet("Emp_Details");
		
		//Row --> starts from 0th index
		Row row = sheet.getRow(4);
							//(9)-->NullPointerException 
		
		//Cell --> starts from 0th index
		Cell cell = row.getCell(4);
							//(6)-->NullPointerException
								
		//toString() --> for printing the value
		String printValue = cell.toString();
		
		System.out.println(printValue); //Bangalore
		
	}
}

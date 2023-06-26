package com.data_driven_testing;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_Total_RowsColumns 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		
		//modify code --> Rel filepath
		String path1=".//data//Book1.xlsx"; 
		
		FileInputStream fis=new FileInputStream(path1);
		
		Workbook wb = WorkbookFactory.create(fis);
		
		
		//Total rows in Emp_Details sheet -->getLastRowNum()
		int totalRows = wb.getSheet("Emp_Details").getLastRowNum();
	
		System.out.println("Total rows: "+totalRows); //8
		
		
		//How many cells are there in each row -->getLastCellNum()
		
		for(int i=0; i<=totalRows; i++)
		{
			short eachRowtotalCells = wb.getSheet("Emp_Details").getRow(i).getLastCellNum();
		
			System.out.println("Each Row Total Cell: "+eachRowtotalCells); //6
		}
	}
}

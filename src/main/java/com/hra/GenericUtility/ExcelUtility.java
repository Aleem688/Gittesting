package com.hra.GenericUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

public class ExcelUtility {
	
	public String readDataFromExcel(String sheetName, int rowno,int cellno) throws EncryptedDocumentException, IOException
	{
		FileInputStream fi=new FileInputStream(IPathConstants.excelpath);
		Workbook wb = WorkbookFactory.create(fi);
		String value = wb.getSheet(sheetName).getRow(rowno).getCell(cellno).getStringCellValue();
		return value;
		
		}
	
	public void writeDataIntoExcel(String sheetName, int rowno, int cellno,String data) throws EncryptedDocumentException, IOException
	{
FileInputStream fi1=new FileInputStream(IPathConstants.excelpath);
Workbook wb = WorkbookFactory.create(fi1);
wb.getSheet(sheetName).getRow(rowno).getCell(cellno).setCellValue(data);
          FileOutputStream fos=new FileOutputStream(IPathConstants.excelpath);
          wb.write(fos);
          wb.close();
}
	public HashMap<String,String> getMultipleDataFromExcel(String sheetName,int keycellno,int keycellvalue) throws Throwable
	{
		DataFormatter df=new DataFormatter();
		FileInputStream fi=new FileInputStream(IPathConstants.excelpath);
		Workbook wb = WorkbookFactory.create(fi);	
		Sheet sh = wb.getSheet(sheetName);
		int count = sh.getLastRowNum();
		HashMap<String,String>map= new HashMap<String,String>();
		for(int i=0; i<=count; i++)
		{
			String key = df.formatCellValue(sh.getRow(i).getCell(0));
			String value = df.formatCellValue(sh.getRow(i).getCell(1));
//			String key = sh.getRow(i).getCell(keycellno).getStringCellValue();
//			String value = sh.getRow(i).getCell(keycellvalue).getStringCellValue();
			map.put(key, value);
		}
		return map;
			
		}
	
	public String getExcelDataBasedOnKey(String sheetName, String expKey) throws Throwable
	{
		DataFormatter df=new DataFormatter();
		FileInputStream fi=new FileInputStream(IPathConstants.excelpath);
		Workbook wb = WorkbookFactory.create(fi);	
		Sheet sh = wb.getSheet(sheetName);
		int rowCount = sh.getLastRowNum();
		String value="";
		for(int i=0; i<rowCount; i++)
		{
			String Actualkey = df.formatCellValue(sh.getRow(i).getCell(0));
			if(expKey.equals(Actualkey))
			{
				value=df.formatCellValue(sh.getRow(i).getCell(1));
				break;
			}	
		}
		return value;
	}
	
	public String getExcelDataBasedOnKeyApproach2(String sheetName, String expKey) throws Throwable
	{
		DataFormatter df=new DataFormatter();
		FileInputStream fi=new FileInputStream(IPathConstants.excelpath);
		Workbook wb = WorkbookFactory.create(fi);	
		Sheet sh = wb.getSheet(sheetName);
		int rowCount = sh.getLastRowNum();
		int cellCount=sh.getRow(0).getLastCellNum();
		String value="";
		for(int j=0; j<rowCount; j++)
		{
			String actualKey=df.formatCellValue(sh.getRow(0).getCell(j));
				if(expKey.equals(actualKey))
				{
					value=df.formatCellValue(sh.getRow(1).getCell(j));
					break;
				}
		}
			
		return value;	
		}
	@DataProvider
	public Object[][] dataProviderMultiplesetofData(String sheet)throws Throwable
	{
		FileInputStream fi=new FileInputStream(IPathConstants.excelpath);
		 Workbook wb = WorkbookFactory.create(fi);
		Sheet sh = wb.getSheet(sheet);
		int lastRow = sh.getLastRowNum();
		int lastCell = sh.getRow(0).getLastCellNum();
		
		Object[][] obj = new Object[lastRow+1][lastCell];
		
		for(int i=0; i<=lastRow; i++)
		{
			for(int j=0; j<lastCell; j++)
			{
				obj[i][j]=sh.getRow(i).getCell(j).getStringCellValue();
			}
		
	}
		return obj;
	}
	}
		
	

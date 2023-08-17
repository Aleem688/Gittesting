package practiseTestNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.hra.GenericUtility.IPathConstants;

public class DataProviderFromExcel {
	@Test(dataProvider ="readDataFromExcel")
	public void fetchDataFromDataProvider(String client, String location)
	{
	System.out.println("Client---->"+client+"   location---->"+location);
	}
	
	@DataProvider
	public Object[][] readDataFromExcel() throws EncryptedDocumentException, IOException
	{
		FileInputStream fi=new FileInputStream(IPathConstants.excelpath);
		 Workbook wb = WorkbookFactory.create(fi);
		Sheet sh = wb.getSheet("Dataprovider");
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

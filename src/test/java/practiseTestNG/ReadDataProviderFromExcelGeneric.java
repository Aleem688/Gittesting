package practiseTestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.hra.GenericUtility.ExcelUtility;

public class ReadDataProviderFromExcelGeneric {
	
	@Test(dataProvider ="getDataFromGeneric" )
	
	public void readData(String client, String location)
	{
	
	System.out.println("Client---->"+client+"  Location--->"+location);
	
	}
	
	@DataProvider
	public Object[][] getDataFromGeneric() throws Throwable
	{
		ExcelUtility elib=new ExcelUtility();
		Object[][] value = elib.dataProviderMultiplesetofData("Dataprovider");
		return value;
		
	}
	
}

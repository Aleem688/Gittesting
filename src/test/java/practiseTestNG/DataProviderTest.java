package practiseTestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
	
	@Test(dataProvider ="data")
	
	public void getDataFromDataProvider(String branch, String location )
	{
	System.out.println("BRANCH----->"+branch+"LOCATION---->"+location);
	
	}
	
	
	
	
	@DataProvider
	
	public Object[][] data()
	{
		Object[][] obj = {{"Qspider","bangalore"},{"testyantra","kattriguppe"}};
		
//		obj[0][0]="Qspider";
//		obj[0][1]="bangalore";
//		
//		obj[1][0]="testyantra";
//		obj[1][1]="kattriguppe";
		
		return obj;
	}
	@DataProvider
	public Object[][] data1()
	{
		Object[][] obj = new Object[2][3];
		obj[0][0]="Bangalore";
		obj[0][1]="gulbarga";
		obj[0][2]=600;
		
		obj[1][0]="Bijapur";
		obj[1][1]="Bangalore";
		obj[1][2]=700;
		
		return obj;
		
	}

	
}

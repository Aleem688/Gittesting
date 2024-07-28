package TestDemo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataTest {
	
	@Test(dataProvider="getData")
	
	public void verifyData(String name,String email, int price)
	{
		
	}

	
	@DataProvider(name="getData")
	
	public Object fetchData()
	{
		return new Object[][] 
				{
			
			{"arshad","zaheer@gamil,com",10000},
			{"moulalai","feroz@gmail.com",70000},
			
				};
				
	}
	}



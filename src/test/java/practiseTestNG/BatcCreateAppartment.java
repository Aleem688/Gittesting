package practiseTestNG;

import org.testng.annotations.Test;

import com.hra.GenericUtility.BaseClass;

public class BatcCreateAppartment extends BaseClass {
	
	@Test(groups = "Regression")
	public void createAppartment()
	{
		System.out.println("...created appartment");
	}
@Test(groups = "smoke")
	public void modifyAppartment()
	{
		System.out.println("...modify appartment");
	}
@Test
public void deleteAppartment()
{
	System.out.println("...delete appartment");
}
	
}

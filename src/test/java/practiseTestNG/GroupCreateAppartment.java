package practiseTestNG;

import org.testng.annotations.Test;

import com.hra.GenericUtility.BaseClass;

public class GroupCreateAppartment extends BaseClass {
	
	@Test(groups = "smoke")
	public void createAppartment()
	{
		System.out.println("...created appartment");
	}
   @Test(groups = "smoke")
   public void modifyAppartment()
   {
	   System.out.println("....modify appartment");
   }


}

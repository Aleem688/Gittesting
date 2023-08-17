package practiseTestNG;

import org.testng.annotations.Test;

import com.hra.GenericUtility.BaseClass;

public class BatcCreateIndividual extends BaseClass {
	@Test(groups = {"smoke","Regression"})
	public void createIndividual()
	{
		System.out.println("...created individual");
	}
   @Test(groups = "Regression")
   public void modifyIndividual()
   {
	   System.out.println("....modify created");
   }
}

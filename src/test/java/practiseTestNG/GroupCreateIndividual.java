package practiseTestNG;

import org.testng.annotations.Test;

import com.hra.GenericUtility.BaseClass;

public class GroupCreateIndividual extends BaseClass {
	
	@Test
	public void createIndividual()
	{
		System.out.println("...created individual");
	}
   @Test
   public void modifyIndividual()
   {
	   System.out.println("....modify individual");
   }

}

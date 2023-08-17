package practiseTestNG;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class TestNGClass {
	
	@Test(priority = 2,invocationCount = 2)
	
	public void createTest()
	{
		System.out.println("------testCreated------");
	}
	
	
	@Test(priority = 1,dependsOnMethods="createTest")
	
	public void editTest()
	{
		System.out.println("-----testEdited----");
	}
	
	@Test(priority = 3)
	
	public void  deleteTest()
	{
		System.out.println("-----testDelete");
	}
}

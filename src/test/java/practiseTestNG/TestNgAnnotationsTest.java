package practiseTestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNgAnnotationsTest {
	
	@BeforeSuite
	public void openDataBase()
	{
	System.out.println("opening to the database");	
	}

	@BeforeClass
	public void launchBrowser()
	{
		System.out.println("launch the browser");
	}
	
	@BeforeMethod
	public void loginToApplication()
	{
		System.out.println("login to application for individual");
	}
	@Test
	public void createIndividual()
	{
		System.out.println("individual registration created");
	}
	
	@AfterMethod
	public void logOutToApplication()
	{
		System.out.println("signout to application");
	}
	
	@BeforeMethod
	public void loginToApplication2()
	{
		System.out.println("login to application for appartment");
	}
	
	@Test
	public void createAppartment()
	{
		System.out.println("appartment registration created");
	}
	
	@AfterMethod
	public void logOutToApplication2()
	{
		System.out.println("signout to application");
	}
	
	@AfterClass
	public void closeBrowser()
	{
		System.out.println("close the browser");
	}
	
	@AfterSuite
	public void closeDatabase()
	{
		System.out.println("close the database");
	}
}

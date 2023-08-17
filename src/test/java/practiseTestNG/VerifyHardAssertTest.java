package practiseTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyHardAssertTest {
	
	@Test
	
	public void verifyAssert()
	{
		WebDriverManager.chromedriver().setup();
		String expectedtitle ="Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		String actualTitle = driver.getTitle();
		
		Assert.assertEquals(actualTitle,expectedtitle);
		
		System.out.println("....step1....");
		System.out.println("..step2....");
	}

}

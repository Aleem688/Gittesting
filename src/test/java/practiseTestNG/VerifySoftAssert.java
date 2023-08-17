package practiseTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifySoftAssert {
	
	@Test

	public void verifySoftAssert() {
		{
			WebDriverManager.chromedriver().setup();
			String expectedtitle = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.flipkart.com/");
			String actualTitle = driver.getTitle();
            
		SoftAssert sa=new SoftAssert();
		sa.assertNotEquals(actualTitle,expectedtitle);

			System.out.println("....step1....");
			System.out.println("..step2....");
			
			sa.assertAll();
		}
	}

}

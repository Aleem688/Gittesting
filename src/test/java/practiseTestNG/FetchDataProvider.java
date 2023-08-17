package practiseTestNG;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FetchDataProvider {
	@Test(dataProviderClass = DataProviderTest.class, dataProvider ="data")
	
	public void getData(String branch, String location)
	{
		System.out.println("BRANCH---->"+branch+"Location---->   "+location);
	}
	
	
	@Test(dataProviderClass = DataProviderTest.class, dataProvider="data1")
	
	public void fetchData(String src, String dest, int price)
	{
		System.out.println("from---->"+src+"to---->"+dest+"Price---->"+price);
	}
}
	/*@Test(dataProvider = "getUsernameAndPassword")
	public void loginToFacebook(String un,String pwd)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.facebook.com/");
		WebElement usernameTextFiled = driver.findElement(By.id("email"));
		usernameTextFiled.sendKeys(un);
		WebElement passwordTextField = driver.findElement(By.id("pass"));
		passwordTextField.sendKeys(pwd);
	}
	
	@DataProvider
	public String[][] getUsernameAndPassword()
	{
		String [][]pwd = {{"Deepak@123gmail.com","DPK123"},{"Arshad123@gmail.com","ARSHD123"},{"Testyantra123@gmail.com","TY123"}};
		return pwd;
	}
            }
	/*@Test
	public void verifyIphonePrices() throws Throwable
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait wait =new WebDriverWait(driver, 10);
		driver.get("https://www.flipkart.com/");
	//	Thread.sleep(4000);
		//wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//button[contains(text(),'✕')]"))));
	//	driver.findElement(By.xpath("//button[contains(text(),'✕')]")).click();
		
		driver.findElement(By.name("q")).sendKeys("iphone 14 pro"+Keys.ENTER);
		List<WebElement> iphonePrices = driver.findElements(By.xpath("//div[contains(text(),'APPLE iPhone 14')]/parent::div/following-sibling::div//div[contains(@class,'WHN')]"));
        
		for(int i=1; i<=iphonePrices.size(); i++)
		{
			Assert.assertTrue(driver.findElement(By.xpath("(//div[contains(text(),'APPLE iPhone 14 Pro')])["+i+"]")).isDisplayed());
			Assert.assertTrue(driver.findElement(By.xpath("(//div[contains(text(),'APPLE iPhone 14')]/parent::div/following-sibling::div//div[contains(@class,'WHN')])["+i+"]")).isDisplayed());
		}
	driver.close();*/
	
	


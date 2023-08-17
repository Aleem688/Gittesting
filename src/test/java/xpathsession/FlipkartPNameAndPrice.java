package xpathsession;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FlipkartPNameAndPrice {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		Actions a=new Actions(driver);
		a.moveByOffset(30, 30).click().perform();
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("samsung mobiles");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		List<WebElement> name = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		List<WebElement> price = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
		for(int i=0; i<name.size(); i++)
		{
			String mobilenames = name.get(i).getText();
			String mobileprice = price.get(i).getText();
			mobileprice.replace(",","");
			System.out.println(mobilenames+"   "+mobileprice);
		}
		driver.close();
		
	}

}

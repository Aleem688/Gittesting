package xpathsession;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonPNameAndPrice {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
		driver.findElement(By.id("nav-search-submit-button")).click();
		List<WebElement> name = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		List<WebElement> price = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
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

package practice;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoibiboCalenderTest {

	public static void main(String[] args) {
        String MonthAndYear="September 2023";
        int date=22;
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.goibibo.com/");
		driver.findElement(By.xpath("//span[@class='logSprit icClose']")).click();
		driver.findElement(By.xpath("(//div[@class='sc-12foipm-16 dwhdnN fswFld '])[3]")).click();
		driver.findElement(By.xpath("//div[.='July 2023']/ancestor::div[@class='DayPicker-Month']/descendant::p[.='22']")).click();
		
		String actualDate="//div[.='"+MonthAndYear+"']/ancestor::div[@class='DayPicker-Month']/descendant::p[.='"+date+"']";
		String nextArrow ="//span[@aria-label='Next Month']";
		
		for(;;)
		
			try {
				driver.findElement(By.xpath(actualDate)).click();
				break;
			}
		catch(Exception e)
		{
			driver.findElement(By.xpath(nextArrow)).click();
			
		}
		driver.findElement(By.xpath("//span[.='Done']")).click();
	}

}

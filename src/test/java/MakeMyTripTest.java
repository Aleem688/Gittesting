import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MakeMyTripTest {

	public static void main(String[] args) {
		String MonthAndYear = "January 2024";
		int date=1;
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/");
		Actions act =new Actions(driver);
		act.moveByOffset(40, 40).click().perform();
		driver.findElement(By.xpath("//span[.='Departure']")).click();
		String actualdate ="//div[.='"+MonthAndYear+"']/ancestor::div[@class='DayPicker-Month']/descendant::p[.='"+date+"']";
		String nextarrow ="//span[@aria-label='Next Month']";
	    
		for(;;)
try {
	driver.findElement(By.xpath(actualdate)).click();
	break;
}
		catch(Exception e)
		{
			driver.findElement(By.xpath(nextarrow)).click();
		}
}
}

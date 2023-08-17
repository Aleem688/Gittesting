package xpathsession;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ProkabbadiTestCase {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.prokabaddi.com/");
		driver.findElement(By.xpath("//button[@class='btn-close']")).click();
		driver.findElement(By.xpath("//span[.='Standings']")).click();
		String team = "Jaipur Pink Panthers";
		String played = driver.findElement(By.xpath("//p[.='"+team+"']/ancestor::div[@class='table-data team']/following-sibling::div[@class='table-data matches-play']/p")).getText();
		
		String won = driver.findElement(By.xpath("//p[.='"+team+"']/ancestor::div[@class='table-data team']/following-sibling::div[@class='table-data matches-won']/p")).getText();
	
	System.out.println("played="+played + " won= "+won);
	}

}

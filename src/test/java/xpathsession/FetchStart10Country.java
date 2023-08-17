package xpathsession;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FetchStart10Country {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.icc-cricket.com/rankings/mens/team-rankings/t20i");
		List<WebElement> countries = driver.findElements(By.xpath("((//table/tbody//td[1])[number(text())<11])/parent::tr//span[@class='u-hide-phablet']"));
		int count = countries.size();
		System.out.println(count);
		for(int i=0; i<countries.size(); i++)
		{
			String data = countries.get(i).getText();
			System.out.println(data);
		}
	}

}

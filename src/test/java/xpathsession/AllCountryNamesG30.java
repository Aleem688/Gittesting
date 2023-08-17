package xpathsession;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AllCountryNamesG30 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://www.icc-cricket.com/rankings/mens/team-rankings/t20i");
	List<WebElement> namecountry = driver.findElements(By.xpath("((//table//tr//span[@class='u-hide-phablet']/parent::td/following-sibling::td[1])[number(text())>30])/ancestor::tr//span[@class='u-hide-phablet']"));
	int count = namecountry.size();
	System.out.println(count);
	for(int i=0; i<namecountry.size(); i++)
	{
		String names = namecountry.get(i).getText();
		System.out.println(names);
	}
	}

}

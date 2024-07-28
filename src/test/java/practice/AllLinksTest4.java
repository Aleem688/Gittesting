package practice;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AllLinksTest4 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		   WebDriver driver=new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		   driver.get("https://ksp.karnataka.gov.in/english");
		    List<WebElement> allinks = driver.findElements(By.xpath("//a"));
		    ArrayList<String> link=new ArrayList<String>();
		     int count = allinks.size();
		     System.out.println(count);
		     for(int i=0; i<allinks.size(); i++)
		     {
		    	String eachlink = allinks.get(i).getAttribute("href");
		    	URL url=null;
		    	int statuscode = 0;
		    	try {
		    		url=new URL(eachlink);
		    		HttpURLConnection httpurlconnection=(HttpURLConnection)url.openConnection();
		    		statuscode=httpurlconnection.getResponseCode();
		    		if(statuscode>=400)
		    		{
		    			link.add(eachlink+"----->"+statuscode);
		    		}
		    	}
		    	catch(Exception e)
		    	{
		    		link.add(eachlink+"----->"+statuscode);
		    	}
		    	
		     }
		       System.out.println(link);
	}

}

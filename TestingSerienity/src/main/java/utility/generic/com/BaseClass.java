package utility.generic.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public WebDriver driver;
	
	 @BeforeClass
	    public void setUp() {
	        //System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
		 
		 WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	    }

	    @AfterClass
	    public void tearDown() {
	       // if (driver != null) {
	            driver.quit();
	        }
	    }
	



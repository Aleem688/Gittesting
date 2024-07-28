package com.hra.GenericUtility;

import java.io.IOException;
import java.sql.SQLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.hra.pom.ApplicationHomePage;
import com.hra.pom.LoginPage;
import com.hra.pom.RegisterPage;
import com.hra.pom.UserHomePage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public DateBaseUtility dlib = new DateBaseUtility();
	public WebDriverUtility wlib = new WebDriverUtility();
	public FileUtility flib = new FileUtility();
	public ExcelUtility elib = new ExcelUtility();
	public JavaUtility jlib = new JavaUtility();
	

	public WebDriver driver;
	public static WebDriver sdriver;

	@BeforeSuite(alwaysRun =true)

	public void connectToDataBase() throws Throwable {

		dlib.connectionToDataBase();
		System.out.println(".....connect to the database");

	}
   
	// @Parameters("BROWSER")

	@BeforeClass(alwaysRun =true)

	public void openBrowser() throws IOException {
		String BROWSER = flib.getPropertyFileData("browser");
		if (BROWSER.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		} else if (BROWSER.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}

		else {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		sdriver=driver;
		wlib.maximizeWindow(driver);

	}

	@BeforeMethod(alwaysRun =true)
	public void loginToApplication() throws IOException {
		String USERNAME = flib.getPropertyFileData("username");
		String PASSWORD = flib.getPropertyFileData("password");
		String URL = flib.getPropertyFileData("url");
		driver.get(URL);
		wlib.waitForPageLoad(driver);
//		ApplicationHomePage a = new ApplicationHomePage(driver);
//	    ap.getLgbtn().click();
//		ap.getRegisterbtn().click();
//		LoginPage l = new LoginPage(driver);
//		l.loginToApplication(USERNAME, PASSWORD);
//	    RegisterPage r = new RegisterPage(driver);
//	    r.getRegisterlink().click();

		System.out.println("....login to application....");
	}

	@AfterMethod(alwaysRun =true)
	public void closeApplication() {
		// UserHomePage hs=new UserHomePage(driver);
		// hs.getLogoutbtn();
		//driver.findElement(By.xpath("//a[text()='Logout']")).click();
		System.out.println("...logout to application....");
	}
       
	@AfterClass(alwaysRun =true)
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
		System.out.println("close the browser");
	}

	@AfterSuite(alwaysRun =true)
	public void closeDataBase() throws Throwable {
		//dlib.closeDb();
		System.out.println("...close the database");
	}

}
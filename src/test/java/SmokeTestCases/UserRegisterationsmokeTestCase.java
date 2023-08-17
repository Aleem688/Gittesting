package SmokeTestCases;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Properties;
import java.util.Map.Entry;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.hra.GenericUtility.BaseClass;
import com.hra.GenericUtility.DateBaseUtility;
import com.hra.GenericUtility.ExcelUtility;
import com.hra.GenericUtility.FileUtility;
import com.hra.GenericUtility.IPathConstants;
import com.hra.GenericUtility.JavaUtility;
import com.hra.GenericUtility.WebDriverUtility;
import com.hra.pom.ApplicationHomePage;
import com.hra.pom.RegisterPage;
import com.hra.pom.UserRegistrationPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UserRegisterationsmokeTestCase extends BaseClass {

	@Test
	public void userRegistration() throws Throwable {

//		FileUtility flib = new FileUtility();
//
//		WebDriverUtility wlib = new WebDriverUtility();
//
//		DateBaseUtility dlib = new DateBaseUtility();
//
//		ExcelUtility elib = new ExcelUtility();
//
//		JavaUtility jlib = new JavaUtility();
//
//		WebDriverManager.chromedriver().setup();
//		String URL = flib.getPropertyFileData("url");

		/*
		 * String BROWSER = flib.getPropertyFileData("browser"); String USERNAME =
		 * flib.getPropertyFileData("username"); String PASSWORD =
		 * flib.getPropertyFileData("password");/*
		 * 
		 * /*FileInputStream fis1=new
		 * FileInputStream(".//src/test/resources/ProjectHra.xlsx"); Workbook wb =
		 * WorkbookFactory.create(fis1); String FullName =
		 * wb.getSheet("Registration").getRow(0).getCell(1).getStringCellValue(); String
		 * username =
		 * wb.getSheet("Registration").getRow(1).getCell(1).getStringCellValue(); String
		 * mobilenumber =
		 * wb.getSheet("Registration").getRow(2).getCell(1).getStringCellValue(); String
		 * emailid =
		 * wb.getSheet("Registration").getRow(3).getCell(1).getStringCellValue(); String
		 * password =
		 * wb.getSheet("Registration").getRow(4).getCell(1).getStringCellValue(); String
		 * confirmpass =
		 * wb.getSheet("Registration").getRow(5).getCell(1).getStringCellValue(); /*
		 * 
		 * 
		 * /* if(BROWSER.equalsIgnoreCase("chrome")) {
		 * WebDriverManager.chromedriver().setup();
		 * 
		 * driver=new ChromeDriver(); } else if(BROWSER.equalsIgnoreCase("firefox")) {
		 * WebDriverManager.firefoxdriver().setup(); driver=new FirefoxDriver(); } else{
		 * WebDriverManager.chromedriver().setup(); driver=new ChromeDriver(); }
		 */
		/*
		 * String FULLNAME = elib.readDataFromExcel("Registration", 0, 1); String
		 * USERNAME = elib.readDataFromExcel("Registration", 1, 1); String MOBILE =
		 * elib.readDataFromExcel("Registration", 2, 1); String EMAIL =
		 * elib.readDataFromExcel("Registration", 3, 1); String PASSWORD =
		 * elib.readDataFromExcel("Registration", 4, 1); String CONFIRMPASSWORD =
		 * elib.readDataFromExcel("Registration", 4, 1);
		 */

//		WebDriver driver = new ChromeDriver();
//		wlib.maximizeWindow(driver);
//
//		wlib.waitForPageLoad(driver);
//
//		driver.get(URL);
		ApplicationHomePage ap=new ApplicationHomePage(driver);
		 ap.getRegisterbtn().click();
		 
		

		
		HashMap<String, String> map = elib.getMultipleDataFromExcel("Registration", 0, 1 + jlib.getRandomNumber());

		/*
		 * driver.findElement(By.id("fullname")).sendKeys(FULLNAME);
		 * driver.findElement(By.id("username")).sendKeys(USERNAME);
		 * driver.findElement(By.id("mobile")).sendKeys(MOBILE+jlib.getRandomNumber());
		 * driver.findElement(By.id("email")).sendKeys(EMAIL);
		 * driver.findElement(By.id("password")).sendKeys(PASSWORD);
		 * driver.findElement(By.id("c_password")).sendKeys(CONFIRMPASSWORD);
		 */
//		FileInputStream fi1 = new FileInputStream(IPathConstants.excelpath);
//		Workbook wb = WorkbookFactory.create(fi1);
//		Sheet sh = wb.getSheet("Registration");
//		int count = sh.getLastRowNum();
//		HashMap<String, String> map = new HashMap<String, String>();
//		for (int i = 0; i <= count; i++) {
//			String key = sh.getRow(i).getCell(0).getStringCellValue();
//			String value = sh.getRow(i).getCell(1).getStringCellValue();
//			map.put(key, value);
//		}
		//String expdata1 = "mobile";

		for (Entry<String, String> set : map.entrySet()) {
			try {
				//if (set.getKey().contains(expdata1)) 
				if(set.getKey().equals("//input[@id='email']"))
				
				{
					//driver.findElement(By.xpath(set.getKey())).sendKeys(set.getValue());
					WebElement gig = driver.findElement(By.xpath(set.getKey()));
					 String a = jlib.getRandomNumber()+set.getValue();
					 gig.sendKeys(a);
					 System.out.println(a);
				}

				else {
					driver.findElement(By.xpath(set.getKey())).sendKeys(set.getValue());
				}

			} catch (Exception e) {

			}
		}

		// driver.findElement(By.xpath("//button[@type='submit']")).click();
		UserRegistrationPage ur = new UserRegistrationPage(driver);
		ur.getSubmitbtn().click();

		String expdata = "Registration successfull. Now you can login";
		try {
String actualdata = driver.findElement(By.xpath("//div[contains(text(),'Registeration successfull')]")).getText();
              Assert.assertEquals(actualdata,expdata);
              
              System.out.println("Registration successfull");
//			if (actualdata.contains(expdata)) {
//				System.out.println("registration successfull");
//			}
		} catch (Exception e) {

			System.out.println("Registration  not successfull");
		}

	}
	}



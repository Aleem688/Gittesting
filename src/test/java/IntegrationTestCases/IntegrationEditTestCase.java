package IntegrationTestCases;

	import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map.Entry;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
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
import com.hra.pom.LoginPage;
import com.hra.pom.RegisterPage;
import com.hra.pom.UserHomePage;

import io.github.bonigarcia.wdm.WebDriverManager;

	public class IntegrationEditTestCase extends BaseClass {
		@Test
		public void editUserDetails() throws Throwable {

//			WebDriverManager.chromedriver().setup();
//			
//			WebDriver driver=new ChromeDriver();
//			
//	FileUtility flib=new FileUtility();
//
//	WebDriverUtility wlib=new WebDriverUtility();
//
//	DateBaseUtility dlib=new DateBaseUtility();
//
//	ExcelUtility elib=new ExcelUtility();
//
//	JavaUtility jlib=new JavaUtility();
//
//	wlib.maximizeWindow( driver);
//
//	wlib.waitForPageLoad(driver);
//
//	String URL = flib.getPropertyFileData("url");
//	String BROWSER = flib.getPropertyFileData("browser");
//	String USERNAME = flib.getPropertyFileData("username");
//	String PASSWORD = flib.getPropertyFileData("password");
//	
//	driver.get(URL);

			// driver.findElement(By.xpath("//a[text()='Login']")).click();
			ApplicationHomePage ap = new ApplicationHomePage(driver);
			ap.getLgbtn().click();

			LoginPage la = new LoginPage(driver);
			la.loginToApplication(flib.getPropertyFileData("username"), flib.getPropertyFileData("password"));

			// driver.findElement(By.xpath("//a[text()='Register']")).click();
			RegisterPage r = new RegisterPage(driver);
			r.getRegisterLink();

			// driver.findElement(By.xpath("//input[@id='exampleInputEmail1']")).sendKeys(USERNAME);
			// driver.findElement(By.xpath("//input[@id='exampleInputPassword1']")).sendKeys(PASSWORD);
			// driver.findElement(By.xpath("//button[@type='submit']")).click();
			// driver.findElement(By.xpath("//a[text()='Register']")).click();

			/*
			 * String FULLNAME = elib.readDataFromExcel("Individual", 0, 1); String MOBILE =
			 * elib.readDataFromExcel("Individual", 1, 1); String ALTERNATEMOBILE =
			 * elib.readDataFromExcel("Individual", 2, 1); String EMAIL =
			 * elib.readDataFromExcel("Individual", 3, 1); String PLOTNO =
			 * elib.readDataFromExcel("Individual", 4, 1); String AVAILABLEROOMS =
			 * elib.readDataFromExcel("Individual", 5, 1); String COUNTRY =
			 * elib.readDataFromExcel("Individual", 6, 1); String STATE =
			 * elib.readDataFromExcel("Individual", 7, 1); String CITY =
			 * elib.readDataFromExcel("Individual", 8, 1); String RENT =
			 * elib.readDataFromExcel("Individual", 9, 1); String DEPOSITE =
			 * elib.readDataFromExcel("Individual", 10, 1); String ADDRESS =
			 * elib.readDataFromExcel("Individual", 11, 1); String VACANT =
			 * elib.readDataFromExcel("Individual", 12, 1);
			 * 
			 */

//	FileInputStream fi1=new FileInputStream(IPathConstants.excelpath);
//			Workbook wb = WorkbookFactory.create(fi1);
//	           Sheet sh = wb.getSheet("Individual");
//	         int count = sh.getLastRowNum();
//	         HashMap<String, String> map=new HashMap<String, String>();
//	         for(int i=0; i<count; i++)
//	         {
//	        	String key = sh.getRow(i).getCell(0).getStringCellValue();
//	        	String value = sh.getRow(i).getCell(1).getStringCellValue();
//	        	map.put(key, value);
//	         }
			HashMap<String, String> map = elib.getMultipleDataFromExcel("Individual", 0, 1 + jlib.getRandomNumber());
			String expdata1 = "mobile";
			for (Entry<String, String> set : map.entrySet()) {
				try {
					  
					if (set.getKey().contains(expdata1)) {
						driver.findElement(By.xpath(set.getKey())).sendKeys(set.getValue());
					} else {
						driver.findElement(By.xpath(set.getKey())).sendKeys(set.getValue());
					}
				
                
				} catch (Exception e) {

				}
			}
			/*
			 * driver.findElement(By.xpath("//input[@id='fullname']")).sendKeys(FULLNAME);
			 * driver.findElement(By.xpath("(//input[@id='mobile'])[1]")).sendKeys(MOBILE);
			 * driver.findElement(By.xpath("(//input[@id='alternat_mobile'])[1]")).sendKeys(
			 * ALTERNATEMOBILE);
			 * driver.findElement(By.xpath("(//input[@id='email'])[1]")).sendKeys(EMAIL);
			 * driver.findElement(By.xpath("(//input[@id='plot_number'])[1]")).sendKeys(
			 * PLOTNO); driver.findElement(By.xpath("(//input[@id='rooms'])[1]")).sendKeys(
			 * AVAILABLEROOMS);
			 * driver.findElement(By.xpath("(//input[@id='country'])[1]")).sendKeys(COUNTRY)
			 * ; driver.findElement(By.xpath("(//input[@id='state'])[1]")).sendKeys(STATE);
			 * driver.findElement(By.xpath("(//input[@id='city'])[1]")).sendKeys(CITY);
			 * 
			 * 
			 * 
			 * 
			 * driver.findElement(By.xpath("(//input[@id='rent'])[1]")).sendKeys(RENT);
			 * driver.findElement(By.xpath("(//input[@id='deposit'])[1]")).sendKeys(DEPOSITE
			 * );
			 * driver.findElement(By.xpath("(//input[@id='address'])[1]")).sendKeys(ADDRESS)
			 * ;
			 */
			WebElement dd = driver.findElement(By.xpath("//select[@id='vacant']"));

			wlib.select("Vacant", dd);

			File f = new File(".//src/test/resources/2. Select SQL.png");
			String path = f.getAbsolutePath();
			driver.findElement(By.xpath("(//input[@id='image'])[1]")).sendKeys(path);

			driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
			

			//driver.findElement(By.xpath("//a[text()='Details/Update']")).click();
			
			UserHomePage up=new UserHomePage(driver);
			up.getDetailsuptlink().click();

			WebElement element = driver.findElement(
					By.xpath("(//p[contains(text(),'Megha')]/ancestor::div[@class='card-block']/a[text()='Edit'])[1]"));
			try {
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].scrollIntoView(true)", element);
				js.executeScript("window.scrollBy(0,-100)", "");
				Thread.sleep(3000);
				element.click();
			} catch (Exception e) {

			}
			driver.findElement(By.xpath("(//input[@id='city'])[1]")).click();
			driver.findElement(By.xpath("(//input[@id='city'])[1]")).clear();
			String exp2data = "Gulbarga";
			driver.findElement(By.xpath("(//input[@id='city'])[1]")).sendKeys(exp2data);
			
			String actual = driver.findElement(By.xpath("(//input[@id='city'])[1]")).getAttribute("value");
			Assert.assertEquals(actual, exp2data);
			System.out.println("pass===" + actual);
			

//	if{
//		
//			Assert.assertEquals(actual, expdata);
//			System.out.println("pass"+actual);
//	}
//	else {
//		System.out.println("fail");
//	}
//	catch(Exception e)
//{
//	
//}

			driver.close();

		}}
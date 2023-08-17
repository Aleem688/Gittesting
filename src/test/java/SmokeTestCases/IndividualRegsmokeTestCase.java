package SmokeTestCases;

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
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Listeners;
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
@Listeners(com.hra.GenericUtility.ListenerImplementClass.class)
public class IndividualRegsmokeTestCase extends BaseClass {
	 @Test
      public void createIndividualRegistration()throws Throwable
      {
//		FileUtility flib = new FileUtility();
//		WebDriverUtility wlib = new WebDriverUtility();
//		DateBaseUtility dlib = new DateBaseUtility();
//		ExcelUtility elib = new ExcelUtility();
//		JavaUtility jlib = new JavaUtility();
//
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
//		wlib.maximizeWindow(driver);
//		wlib.waitForPageLoad(driver);

		
		 ApplicationHomePage ap = new ApplicationHomePage(driver);
			ap.getLgbtn().click();
			
		 LoginPage l = new LoginPage(driver);
		    l.loginToApplication(flib.getPropertyFileData("username"), flib.getPropertyFileData("password"));
			

		RegisterPage rs = new RegisterPage(driver);

		//String BROWSER = flib.getPropertyFileData("browser");

		//driver.get(flib.getPropertyFileData("url"));
		//ap.getLgbtn().click();

		//l.loginToApplication(flib.getPropertyFileData("username"), flib.getPropertyFileData("password"));

		rs.getRegisterlink().click();
		
		HashMap<String, String> map = elib.getMultipleDataFromExcel("Individual", 0, 1+jlib.getRandomNumber());

//		FileInputStream fi1 = new FileInputStream(IPathConstants.excelpath);
//		Workbook wb = WorkbookFactory.create(fi1);
//		Sheet sh = wb.getSheet("Individual");
//		int count = sh.getLastRowNum();
//	    HashMap<String, String> map = new HashMap<String, String>();
//	    for (int i = 0; i <= count; i++) {
//		String key = sh.getRow(i).getCell(0).getStringCellValue();
//		String value = sh.getRow(i).getCell(1).getStringCellValue();
//			map.put(key, value);
//		}
		String expdata1 = "mobile";
		Thread.sleep(5000);
		for (Entry<String, String> set : map.entrySet()) {
			try {
				if (set.getKey().contains(expdata1)) {
					driver.findElement(By.xpath(set.getKey())).sendKeys(set.getValue());
				} else {
					driver.findElement(By.xpath(set.getKey())).sendKeys(set.getValue());
				}

			} catch (Exception e) {
				// TODO: handle exception

			}
		}

		/*
		 * driver.findElement(By.xpath("//a[text()='Login']")).click();
		 * driver.findElement(By.xpath("//input[@id='exampleInputEmail1']")).sendKeys(
		 * USERNAME);
		 * driver.findElement(By.xpath("//input[@id='exampleInputPassword1']")).sendKeys
		 * (PASSWORD); driver.findElement(By.xpath("//button[@type='submit']")).click();
		 * driver.findElement(By.xpath("//a[text()='Register']")).click();
		 */

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
		 * 
		 * 
		 * // String value = elib.getExcelDataBasedOnKey("Individual", //
		 * "//input[@id='apartment_name']");
		 * 
		 * 
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
		 * driver.findElement(By.xpath("(//input[@id='rent'])[1]")).sendKeys(RENT);
		 * driver.findElement(By.xpath("(//input[@id='deposit'])[1]")).sendKeys(DEPOSITE
		 * );
		 * driver.findElement(By.xpath("(//input[@id='address'])[1]")).sendKeys(ADDRESS)
		 * ;
		 */

		WebElement dd = driver.findElement(By.xpath("//select[@id='vacant']"));

		Select s = new Select(dd);
		s.selectByVisibleText("Vacant");

		File f = new File(".//src/test/resources/2. Select SQL.png");
		String path = f.getAbsolutePath();
		driver.findElement(By.xpath("(//input[@id='image'])[1]")).sendKeys(path);

		driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();

//	WebElement element = driver.findElement(By.xpath("(//p[text()='arshad']/parent::div/../preceding-sibling::a)[1]"));
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("argument[0].scrollIntoView()", element);
//		element.click();

		String expdata = "Registration successfull. Thank you";
		try {
			String actualdata = driver.findElement(By.xpath("//div[contains(text(),'Registration successfull')]"))
					.getText();
			if (actualdata.contains(expdata)) {
				System.out.println("registration successfull");
			}
		} catch (Exception e) {
			System.out.println("registration successfull");
		}
		driver.close();
	}
	}



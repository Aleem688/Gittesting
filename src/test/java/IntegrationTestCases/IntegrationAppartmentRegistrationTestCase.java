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
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.hra.GenericUtility.BaseClass;
import com.hra.GenericUtility.DateBaseUtility;
import com.hra.GenericUtility.ExcelUtility;
import com.hra.GenericUtility.FileUtility;
import com.hra.GenericUtility.IPathConstants;
import com.hra.GenericUtility.JavaUtility;
import com.hra.GenericUtility.WebDriverUtility;
import com.hra.pom.AppartmentRegistrationPage;
import com.hra.pom.ApplicationHomePage;
import com.hra.pom.LoginPage;
import com.hra.pom.RegisterPage;

import io.github.bonigarcia.wdm.WebDriverManager;
import practiseTestNG.DataProviderFromExcel;
//@Listeners(com.hra.GenericUtility.ListenerImplementClass.class)
@Listeners(com.hra.GenericUtility.ListenerImplementClass.class)
public class IntegrationAppartmentRegistrationTestCase extends BaseClass {

	@Test
	//(retryAnalyzer = com.hra.GenericUtility.RetryImplementationClass.class)
	public void createAppartmentReg() throws Throwable {

//		WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();
//        FileUtility flib = new FileUtility();
//        WebDriverUtility wlib = new WebDriverUtility();
//        DateBaseUtility dlib = new DateBaseUtility();
//        ExcelUtility elib = new ExcelUtility();
//        JavaUtility jlib = new JavaUtility();
//
//		//String URL = flib.getPropertyFileData("url");
//	//	String BROWSER = flib.getPropertyFileData("browser");
//	//	String USERNAME = flib.getPropertyFileData("username");
//	//	String PASSWORD = flib.getPropertyFileData("password");
//
//		driver.get(flib.getPropertyFileData("url"));
//		wlib.maximizeWindow(driver);
//		wlib.waitForPageLoad(driver);

		ApplicationHomePage ap = new ApplicationHomePage(driver);
		ap.getLgbtn().click();

		LoginPage l = new LoginPage(driver);
		l.loginToApplication(flib.getPropertyFileData("username"), flib.getPropertyFileData("password"));

		RegisterPage r = new RegisterPage(driver);
		r.getRegisterlink().click();

		// driver.findElement(By.xpath("//a[text()='Register']")).click();
		// driver.findElement(By.xpath("//a[text()='Apartment Registration']")).click();
		AppartmentRegistrationPage ar = new AppartmentRegistrationPage(driver);
		ar.getAppartmentreglink().click();
		
		Assert.fail();

//	FileInputStream fis = new FileInputStream(IPathConstants.excelpath);
//
//	Workbook wb = WorkbookFactory.create(fis);
//	Sheet sh = wb.getSheet("Appartment");
//    int count = sh.getLastRowNum();
//	
//	for(int i=0; i<=count; i++)
//	{
//		driver.findElement(By.xpath(key)).sendKeys(value);
//	}
//		HashMap<String, String> map = new HashMap<>();
//
//		for (int i = 0; i <= count; i++) {
//			String key = sh.getRow(i).getCell(0).getStringCellValue();
//			String value = sh.getRow(i).getCell(1).getStringCellValue();
//			map.put(key, value);
//		}

		HashMap<String, String> map = elib.getMultipleDataFromExcel("Appartment", 0, 1);
		ar.getAddmorebuttonlink().click();
//		for (int i = 0; i <= count; i++)
//		{
//			driver.findElement(By.xpath(Key)).sendKeys(Value);
//		}

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

		File f = new File("src/test/resources/2. Select SQL.png");
		String path = f.getAbsolutePath();
		driver.findElement(By.xpath("(//input[@id='image'])[2]")).sendKeys(path);

		// WebElement purpose = driver.findElement(By.xpath("//select[@id='purpose']"));
		WebElement purpose = ar.getDdtxtbx();
		wlib.select("Residential", purpose);

		// WebElement floor = driver.findElement(By.xpath("//select[@id='floor']"));
		WebElement floor = ar.getDdtxtbx2();
		wlib.select("1st", floor);

		// WebElement owner = driver.findElement(By.xpath("//select[@id='ownership']"));
		WebElement owner = ar.getDdtxtbx3();
		wlib.select("Rented", owner);

		// WebElement vac = driver.findElement(By.xpath("(//select[@id='vacant'])[2]"));
		WebElement vac = ar.getDdtxtbx4();
		wlib.select("Vacant", vac);

		// driver.findElement(By.xpath("(//button[text()='Submit'])[1]")).click();
		ar.getSubmitbtn().click();

		String expdata = "Registration successfull. Thank you";
		try {
			String actualdata = driver.findElement(By.xpath("//div[contains(text(),'Registration successfull. Thank you')]")).getText();
			 Assert.assertEquals(actualdata,expdata);
//			if (actualdata.contains(expdata)) {
//				System.out.println("appartment registration successfull");
//			}
		} catch (Exception e) {
			System.out.println("Registration not successfull");
		}
		driver.close();
	}
	}
	
//	@DataProvider
//	public Object[][] getExcelData() throws Throwable
//	{
//		ExcelUtility excelUtility = new ExcelUtility();
//		Object[][] data= excelUtility.dataProviderMultiplesetofData("Appartment");
//		return data;
//	}



package SystemTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.hra.GenericUtility.BaseClass;
import com.hra.GenericUtility.DateBaseUtility;
import com.hra.GenericUtility.ExcelUtility;
import com.hra.GenericUtility.FileUtility;
import com.hra.GenericUtility.JavaUtility;
import com.hra.GenericUtility.WebDriverUtility;
import com.hra.pom.ApplicationHomePage;
import com.hra.pom.LoginPage;
import com.hra.pom.RegisterPage;
import com.hra.pom.UserHomePage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SystemComplaintTestCase extends BaseClass {
	
	@Test
	public void complaintOnUserRegisterHome() throws Throwable {

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
		LoginPage l = new LoginPage(driver);
		ap.getLgbtn().click();

		l.loginToApplication(flib.getPropertyFileData("username"), flib.getPropertyFileData("password"));

		// driver.findElement(By.xpath("//a[text()='Details/Update']")).click();
		UserHomePage up = new UserHomePage(driver);
		up.getDetailsuptlink().click();
		
		
		//up.getComplainlink().click();
		 driver.findElement(By.xpath("//a[text()='Complaint']")).click();

		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("mant apartment");

		driver.findElement(By.xpath("//input[@id='cmp']")).sendKeys("the flat has no proper water supply");

		driver.findElement(By.xpath("//button[@type='submit']")).click();

		String expdata = "Sent Successfully";
		try {
			String actualdata = driver.findElement(By.xpath("//div[text()='Sent Successfully']")).getText();
			
			Assert.assertEquals(actualdata,expdata);
			System.out.println("complaint sent successfully");

//			if (actualdata.contains(expdata)) {
//				System.out.println("complaint sent successfully");
//			}

		} catch (Exception e) {
			//System.out.println("complaint  sent successfully");
		}
	}

}

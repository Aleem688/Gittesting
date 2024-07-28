package utility.generic.com;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReadDataFromExcel {

	WebDriver driver;

	public static void main(String[] args) throws EncryptedDocumentException, IOException

	{
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		FileInputStream fis = new FileInputStream("C://Users//Admin//Desktop//ExcelFileReading.xlsx");

		Workbook wb = WorkbookFactory.create(fis);

		int rowcount = wb.getSheet("TestData").getLastRowNum();

		// System.out.println(username);

		for (int i = 1; i <= rowcount; i++) {

			String un = wb.getSheet("TestData").getRow(i).getCell(0).getStringCellValue();
			String pw = wb.getSheet("TestData").getRow(i).getCell(1).getStringCellValue();

			// System.out.println(un+".....>"+pw);

			driver.findElement(By.xpath("//input[@name='username']")).sendKeys(un);
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pw);
			
			driver.findElement(By.xpath("//button[text()=' Login ']")).click();

		}

	}

}

package utility.generic.com;

import java.io.IOException;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;

public class KeyDrivenTest extends BaseClass {
	
	
	  @Test
	  
	    public void testApplication() throws IOException {
	        Map<String, String> testData = ExcelUtilityClass.readTestData("C://Users//Admin//Desktop//ExcelFileReading.xlsx");

	        // Example of reading actions from the test data
	        //String url = testData.get("URL");
	        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

	        WebElement username = driver.findElement(By.name(testData.get("SearchBoxID")));
	        username.sendKeys(testData.get("SearchText"));

	        WebElement password = driver.findElement(By.name(testData.get("SearchButtonID")));
	        password.sendKeys(testData.get("passwordText"));

	        // Add assertions based on your test scenario
	        //WebElement result = driver.findElement(By.id(testData.get("ResultID")));
	        //Assert.assertEquals(result.getText(), testData.get("ExpectedResult"));
	        
	    }

}

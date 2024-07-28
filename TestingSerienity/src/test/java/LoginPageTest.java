import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Utlity.POM.com.LoginPage;
import utility.generic.com.BaseClass;

public class LoginPageTest extends BaseClass {
	
	LoginPage page;
	
	@Test
	
	public void getLogin()
	{
		
		
		driver.get("https://start.roboform.com/?init=setup-account-new");
		
		page=new LoginPage(driver);
		
		//page.setEmail("arshadayyubbaghwan@gmail.com");
		//page.setEmail1("arshadayyub@gmail.com");
		page.setEmail("arshadayyubbaghwan@gmail.com");
		
		page.setCreatepwdtx("arshad.$12345");
		
		page.setCreatepwdtx("aarshadfcg");
		
		page.setConfpwdtx("arshad.$12345");
		
		page.setFullnametx("arshadayyub");
	}

}

package practiseTestNG;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.hra.GenericUtility.BaseClass;
import com.hra.pom.RegisterPage;

public class PracticeBaseClass extends BaseClass {
	
	@Test
	public void clickOnRegisterLink()
	{

		RegisterPage r = new RegisterPage(driver);
		r.getRegisterlink().click();

	}

}

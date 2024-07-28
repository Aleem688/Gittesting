package Utlity.POM.com;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public WebDriver driver;
	
	//https://start.roboform.com/?init=setup-account-new
	
	@FindBy(xpath="//div[text()='Email']")
		WebElement email;
	
	@FindBy(xpath="//div[text()='Master Password']")
		WebElement createpwdtx;
	
	@FindBy(xpath="//div[text()='Confirm Password']")
		WebElement confpwdtx;
	
	@FindBy(xpath="//div[text()='First and Last Name']")
		WebElement fullnametx;
	
	
public LoginPage(WebDriver driver)
{
	PageFactory.initElements(driver, Duration.ofSeconds(10));
}


public WebDriver getDriver() {
	return driver;
}



public WebElement getEmail() {
	return email;
}


public void setEmail(String  email1) {
	//this.email = email;
	email .sendKeys(email1);
}


public WebElement getCreatepwdtx() {
	return createpwdtx;
}


public void setCreatepwdtx(String createpwdt) {
	//this.createpwdtx = createpwdtx;

	createpwdtx.sendKeys(createpwdt);
}


public WebElement getConfpwdtx() {
	return confpwdtx;
}


public void setConfpwdtx(String confpwtx) {
	//this.confpwdtx = confpwdtx;
confpwdtx.sendKeys(confpwtx);
	
}


public WebElement getFullnametx() {
	return fullnametx;
}


public void setFullnametx(String fullnamtx) {
	//this.fullnametx = fullnametx;
	fullnametx.sendKeys(fullnamtx);
	
}







}

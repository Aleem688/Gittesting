package com.hra.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	//declaration
@FindBy(xpath="//input[@name='username']")
private WebElement untbx;

@FindBy(xpath="//input[@name='password']")
private WebElement pwtbx;

@FindBy(xpath="//button[text()='Submit']")
private WebElement lgbtn;
// initialization
public LoginPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}


//utilization
//public WebElement getUntbx() {
//	return untbx;
//}
//
//
//
//public WebElement getPwtbx() {
//	return pwtbx;
//}
//
//
//
//public WebElement getLgbtn() {
//	return lgbtn;
//}


//business library
public void loginToApplication(String USERNAME, String PASSWORD)
{
	untbx.sendKeys(USERNAME);
	pwtbx.sendKeys(PASSWORD);
	lgbtn.click();
}


}

package com.hra.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ApplicationHomePage {
	//declaration
	@FindBy(xpath="//a[text()='Logo/Home']")
     private WebElement logobtn;
	
	
	@FindBy(xpath="//a[@href='#search']")
	private WebElement searchbtn;
	
	@FindBy(xpath="//a[text()='Login']")
    private WebElement lgbtn;
	
	@FindBy(xpath="//a[text()='Register']")
	private WebElement registerbtn;
	
	public WebElement getLogobtn() {
		return logobtn;
	}

	public WebElement getSearchbtn() {
		return searchbtn;
	}

	public WebElement getLgbtn() {
		return lgbtn;
	}

	public WebElement getRegisterbtn() {
		return registerbtn;
	}
	
	//Initilization
	public ApplicationHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//Utilization

	
public void homeSetButton()
{
	registerbtn.click();
	logobtn.click();
	searchbtn.click();
	lgbtn.click();
}
	
	

}


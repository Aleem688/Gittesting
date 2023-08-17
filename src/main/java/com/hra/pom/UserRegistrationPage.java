package com.hra.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserRegistrationPage {
	//Declaration
	@FindBy(xpath="//a[text()='Register']")
	private WebElement regbtn;
	
	@FindBy(xpath="//input[@id='fullname']")
	private WebElement fullnametbx;
	
	@FindBy(xpath="//input[@id='username']")
	private WebElement untbx;
	
	@FindBy(xpath="//input[@id='email']")
	private WebElement emailtbx;
	
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement passwordtbx;
	
	@FindBy(xpath="//button[text()='Submit']")
	private WebElement submitbtn;
	
	
	
	
	
	public WebElement getRegbtn() {
		return regbtn;
	}



	public WebElement getFullnametbx() {
		return fullnametbx;
	}



	public WebElement getUntbx() {
		return untbx;
	}



	public WebElement getEmailtbx() {
		return emailtbx;
	}



	public WebElement getPasswordtbx() {
		return passwordtbx;
	}



	public WebElement getSubmitbtn() {
		return submitbtn;
	}

	//initilization

	public UserRegistrationPage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}

package com.hra.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	
	@FindBy(xpath="//a[text()='Register']")
	private WebElement registerlink;
	
	@FindBy(xpath="//a[text()='Individual Home Registration']")
	private WebElement individualreglink;
	
	@FindBy(xpath="//input[@id='fullname']")
	private WebElement fullnametbx;
	
	
	@FindBy(xpath="(//input[@id='mobile'])[1]")
	private WebElement mobiletbx;
	
	@FindBy(xpath="(//input[@id='alternat_mobile'])[1]")
	private WebElement alternatemobiletbx;
	
	@FindBy(xpath="(//input[@id='email'])[1]")
	private WebElement emailtbx;
	
	@FindBy(xpath="(//input[@id='plot_number'])[1]")
	private WebElement plottbx;
	
	
	@FindBy(xpath="(//input[@id='rooms'])[1]")
	private WebElement availableromtbx;
	
	@FindBy(xpath="(//input[@id='country'])[1]")
	private WebElement countrytbx;
	
	@FindBy(xpath="(//input[@id='state'])[1]")
	private WebElement statetbx;
	
	
	@FindBy(xpath="(//input[@id='city'])[1]")
	private WebElement citytbx;
	
	@FindBy(xpath="(//input[@id='rent'])[1]")
	private WebElement renttbx;
	
	@FindBy(xpath="(//input[@id='deposit'])[1]")
	private WebElement depositetbx;
	
	@FindBy(xpath="(//input[@id='address'])[1]")
	private WebElement addresstbx;
	
	
	@FindBy(xpath="//select[@id='vacant']")
	private WebElement dropdown;
	
	@FindBy(xpath="(//input[@id='image'])[1]")
	private WebElement imageupload;
	
	@FindBy(xpath="(//button[@type='submit'])[1]")
	private WebElement submitbtn;
	
	
	
	public WebElement getRegisterlink() {
		return registerlink;
	}



	public WebElement getIndividualreglink() {
		return individualreglink;
	}



	public WebElement getFullnametbx() {
		return fullnametbx;
	}



	public WebElement getMobiletbx() {
		return mobiletbx;
	}



	public WebElement getAlternatemobiletbx() {
		return alternatemobiletbx;
	}



	public WebElement getEmailtbx() {
		return emailtbx;
	}



	public WebElement getPlottbx() {
		return plottbx;
	}



	public WebElement getAvailableromtbx() {
		return availableromtbx;
	}



	public WebElement getCountrytbx() {
		return countrytbx;
	}



	public WebElement getStatetbx() {
		return statetbx;
	}



	public WebElement getCitytbx() {
		return citytbx;
	}



	public WebElement getRenttbx() {
		return renttbx;
	}



	public WebElement getDepositetbx() {
		return depositetbx;
	}



	public WebElement getAddresstbx() {
		return addresstbx;
	}



	public WebElement getDropdown() {
		return dropdown;
	}



	public WebElement getImageupload() {
		return imageupload;
	}



	public WebElement getSubmitbtn() {
		return submitbtn;
	}



	public RegisterPage(WebDriver driver)
	
	{
		PageFactory.initElements(driver, this);
	}
	
	//business logic
	public void getRegisterLink() {
		registerlink.click();
	}
	
	public void getMultipleDataFromExcel()
	{
		
	}
	
	
}

package com.hra.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IndividualRegistrationPage {
	
	//Declaration
	@FindBy(xpath="//div[@class='tab-pane active']//input[@id='fullname']")
	private WebElement fullnametxtbx;
	
	
	@FindBy(xpath="//div[@class='tab-pane active']//input[@id='mobile']")
	private WebElement mobiletxtbx;
	
	@FindBy(xpath="//div[@class='tab-pane active']//input[@id='alternat_mobile']")
	private WebElement alternatemobiletxtbx;
	
	@FindBy(xpath="//div[@class='tab-pane active']//input[@id='email']")
	private WebElement emailtxtbx;
	
	@FindBy(xpath="//div[@class='tab-pane active']//input[@id='plot_number']")
	private WebElement plotnotxtbx;
	
	@FindBy(xpath="//div[@class='tab-pane active']//input[@id='rooms']")
	private WebElement roomstxtbx;
	
	@FindBy(xpath="//div[@class='tab-pane active']//input[@id='country']")
	private WebElement countrytxtbx;
	
	@FindBy(xpath="//div[@class='tab-pane active']//input[@id='state']")
	private WebElement statetxtbx;
	
	@FindBy(xpath="//div[@class='tab-pane active']//input[@id='city']")
	private WebElement citytxtbx;
	
	@FindBy(xpath="//div[@class='tab-pane active']//input[@id='rent']")
	private WebElement renttxtbx;
	
	@FindBy(xpath="//div[@class='tab-pane active']//input[@id='sale']")
	private WebElement saletxtbx;
	
	@FindBy(xpath="//div[@class='tab-pane active']//input[@id='deposit']")
	private WebElement depositetxtbx;
	
	@FindBy(xpath="//div[@class='tab-pane active']//input[@id='accommodation']")
	private WebElement facilitytxtbx;
	
	@FindBy(xpath="//div[@class='tab-pane active']//input[@id='description']")
	private WebElement descriptiontxtbx;
	
	@FindBy(xpath="//div[@class='tab-pane active']//input[@id='landmark']")
	private WebElement landmarktxtbx;
	
	
	@FindBy(xpath="//div[@class='tab-pane active']//input[@id='address']")
	private WebElement addresstxtbx;
	
	@FindBy(xpath="//div[@class='tab-pane active']//select[@id='vacant']")
	private WebElement vacantdd;
	
	@FindBy(xpath="//div[@class='tab-pane']//input[@id='mobile']/parent::div//input[@id='mobile']")
	private WebElement imagelink;
	
	
	@FindBy(xpath="(//button[@type='submit'])[1]")
	private WebElement submitbutton;
	
	

	public WebElement getFullnametxtbx() {
		return fullnametxtbx;
	}

	public WebElement getMobiletxtbx() {
		return mobiletxtbx;
	}




	public WebElement getAlternatemobiletxtbx() {
		return alternatemobiletxtbx;
	}




	public WebElement getEmailtxtbx() {
		return emailtxtbx;
	}




	public WebElement getPlotnotxtbx() {
		return plotnotxtbx;
	}




	public WebElement getRoomstxtbx() {
		return roomstxtbx;
	}




	public WebElement getCountrytxtbx() {
		return countrytxtbx;
	}




	public WebElement getStatetxtbx() {
		return statetxtbx;
	}




	public WebElement getCitytxtbx() {
		return citytxtbx;
	}




	public WebElement getRenttxtbx() {
		return renttxtbx;
	}




	public WebElement getSaletxtbx() {
		return saletxtbx;
	}




	public WebElement getDepositetxtbx() {
		return depositetxtbx;
	}




	public WebElement getFacilitytxtbx() {
		return facilitytxtbx;
	}




	public WebElement getDescriptiontxtbx() {
		return descriptiontxtbx;
	}




	public WebElement getLandmarktxtbx() {
		return landmarktxtbx;
	}




	public WebElement getAddresstxtbx() {
		return addresstxtbx;
	}




	public WebElement getVacantdd() {
		return vacantdd;
	}




	public WebElement getImagelink() {
		return imagelink;
	}
	

	


	public WebElement getSubmitbutton() {
		return submitbutton;
	}

	
//Initilization
	
	public IndividualRegistrationPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	
}

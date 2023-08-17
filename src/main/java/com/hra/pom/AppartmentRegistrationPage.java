package com.hra.pom;

import java.util.HashMap;
import java.util.Map.Entry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AppartmentRegistrationPage {
	
	@FindBy(xpath="//a[text()='Apartment Registration']")
	private WebElement appartmentreglink;
	
	@FindBy(xpath="//input[@id='apartment_name']")
	private WebElement appartnametxtbx;
	
	@FindBy(xpath="(//input[@id='mobile'])[2]")
	private WebElement mobiletxtbx;
	
	@FindBy(xpath="(//input[@id='alternat_mobile'])[2]")
	private WebElement alternatemobiletxtbx;
	
	@FindBy(xpath="(//input[@id='email'])[2]")
	private WebElement emailtxtbx;
	
	@FindBy(xpath="(//input[@id='plot_number'])[2]")
	private WebElement plotnotxtbx;
	
	@FindBy(xpath="(//input[@id='country'])[2]")
	private WebElement countrytxtbx;
	
	@FindBy(xpath="(//input[@id='state'])[2]")
	private WebElement statetxtbx;
	
	@FindBy(xpath="(//input[@id='city'])[2]")
	private WebElement citytxtbx;
	
	@FindBy(xpath="(//input[@id='landmark'])[2]")
	private WebElement landmarktxtbx;
	
	@FindBy(xpath="(//input[@id='address'])[2]")
	private WebElement addresstxtbx;
	
    @FindBy(xpath="(//input[@id='image'])[2]")
    private WebElement imagetxtbx;
    
    @FindBy(xpath="//a[text()='Add More(Plat Number/Description)']")
    private WebElement addmorebuttonlink;
    
    @FindBy(xpath="(//input[@id='fullname'])[2]")
    private WebElement fullnametxtbx;
    
    @FindBy(xpath="(//input[@id='Flat Number'])[2]")
    private WebElement flatnotxtbx;
    
    @FindBy(xpath="(//input[@id='rooms'])[2]")
    private WebElement roomstxtbx;
    
    @FindBy(xpath="(//input[@id='area'])[2]")
    private WebElement areatxtbx;
    
    @FindBy(xpath="//select[@id='purpose']")
    private WebElement ddtxtbx;
    
    @FindBy(xpath="//select[@id='floor']")
    private WebElement ddtxtbx2;
    
    @FindBy(xpath="//select[@id='ownership']")
    private WebElement ddtxtbx3;
    
    @FindBy(xpath="(//input[@id='rent'])[2]")
    private WebElement renttxtbx;
    
    @FindBy(xpath="(//input[@id='deposit'])[2]")
    private WebElement depositetxtbx;
    
    @FindBy(xpath="(//input[@id='accommodation'])[2]")
    private WebElement facilitytxtbx;
    
    @FindBy(xpath="(//input[@id='description'])[2]")
    private WebElement descriptiontxtbx;
    
 
    @FindBy(xpath="(//select[@id='vacant'])[2]")
    private WebElement ddtxtbx4;
    
    
	@FindBy(xpath="(//button[text()='Submit'])[2]")
	private WebElement submitbtn;
	
	
	
	public WebElement getAppartmentreglink() {
		return appartmentreglink;
	}



	public WebElement getAppartnametxtbx() {
		return appartnametxtbx;
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



	public WebElement getCountrytxtbx() {
		return countrytxtbx;
	}



	public WebElement getStatetxtbx() {
		return statetxtbx;
	}



	public WebElement getCitytxtbx() {
		return citytxtbx;
	}



	public WebElement getLandmarktxtbx() {
		return landmarktxtbx;
	}



	public WebElement getAddresstxtbx() {
		return addresstxtbx;
	}



	public WebElement getImagetxtbx() {
		return imagetxtbx;
	}



	public WebElement getAddmorebuttonlink() {
		return addmorebuttonlink;
	}



	public WebElement getFullnametxtbx() {
		return fullnametxtbx;
	}



	public WebElement getFlatnotxtbx() {
		return flatnotxtbx;
	}



	public WebElement getRoomstxtbx() {
		return roomstxtbx;
	}



	public WebElement getAreatxtbx() {
		return areatxtbx;
	}



	public WebElement getDdtxtbx() {
		return ddtxtbx;
	}



	public WebElement getDdtxtbx2() {
		return ddtxtbx2;
	}



	public WebElement getDdtxtbx3() {
		return ddtxtbx3;
	}



	public WebElement getRenttxtbx() {
		return renttxtbx;
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



	public WebElement getDdtxtbx4() {
		return ddtxtbx4;
	}



	public WebElement getSubmitbtn() {
		return submitbtn;
	}



	public AppartmentRegistrationPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
    
    //Business logic
	public void getAppartmentRegisterLink()
	{
		appartmentreglink.click();
		submitbtn.click();
	}
//	public void getAppartmentFeilds(String appartment String mobile)
//	{
//		appartnametxtbx.sendKeys(appartment);
//		mobiletxtbx.sendKeys(mobile);
//		
//	}
//
//	}
	public void appartmentReg(HashMap<String, String> map,WebDriver driver,String expdata)
	{
		addmorebuttonlink.click();
		for(Entry<String, String> set:map.entrySet())
		{
			if(set.getKey().contains(expdata))
			{
				driver.findElement(By.xpath(set.getKey())).sendKeys(set.getValue());
			}
			else {
				driver.findElement(By.xpath(set.getKey())).sendKeys(set.getValue());
				
			}
		}
	}
}

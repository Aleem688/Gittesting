package com.hra.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserHomePage {
	//Declaration
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement logoutbtn;
	
	@FindBy(xpath="//a[text()='Home']")
	private WebElement homelink;
	
	@FindBy(xpath="//a[text()='Register']")
	private WebElement registerlink;
	
	@FindBy(xpath="//a[text()='Details/Update']")
	private WebElement detailsuptlink;
	
	@FindBy(xpath="//a[text()='Send SMS']")
	private WebElement sendsmslink;
	
	@FindBy(xpath="//a[text()='Complaint List']")
	private WebElement complainlink;
	
	@FindBy(xpath="//b[text()='Registered Users: ']")
	private WebElement reguserslink;
	@FindBy(xpath="//b[text()='Rooms for Rent: ']")
	private WebElement roomsforrentlink;
	
	
	public WebElement getLogoutbtn() {
		return logoutbtn;
	}


	public WebElement getHomelink() {
		return homelink;
	}


	public WebElement getRegisterlink() {
		return registerlink;
	}


	public WebElement getDetailsuptlink() {
		return detailsuptlink;
	}


	public WebElement getSendsmslink() {
		return sendsmslink;
	}


	public WebElement getComplainlink() {
		return complainlink;
	}


	public WebElement getReguserslink() {
		return reguserslink;
	}


	public WebElement getRoomsforrentlink() {
		return roomsforrentlink;
	}


	public UserHomePage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	

}

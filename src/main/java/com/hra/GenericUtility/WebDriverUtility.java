package com.hra.GenericUtility;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class WebDriverUtility {
	public void maximizeWindow(WebDriver driver)
	{
		driver.manage().window().maximize();
	}
	
	public void waitForPageLoad(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	
	public void waitUntilElementLocated(WebDriver driver,WebElement element)
	{
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public void select(WebElement element,int index)
	{
		Select s=new Select(element);
		s.selectByIndex(index);
	}
	public void select(String text,WebElement element)
	{
		Select s=new Select(element);
		s.selectByVisibleText(text);
	}
	
	public void mouseHover(WebDriver driver ,WebElement element)
	{
		Actions a=new Actions(driver);
		a.moveToElement(element).perform();
	}
	
	public void contextClick(WebDriver driver, WebElement element)
	{
		Actions a=new Actions(driver);
		a.contextClick(element).perform();
	}
	
	public void dragAndDrop(WebDriver driver, WebElement src, WebElement dest)
	{
		Actions a=new Actions(driver);
		a.dragAndDrop(src, dest).perform();
	}
	
	public void doubleClick(WebDriver driver,WebElement element)
	{
		Actions a=new Actions(driver);
		a.doubleClick(element).perform();
	}
	
	/**
	 * This method will press enter key
	 * @param driver
	 * @throws AWTException 
	 */
	
	
	public void enterKeyPress(WebDriver driver) throws AWTException
	{
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
	}
	
	

	/**
	 * this method is used to release the key
	 * @param driver
	 * @throws AWTException 
	 */
	public void enterRelease(WebDriver driver) throws AWTException
	{
		Robot r=new Robot();
		r.keyRelease(KeyEvent.VK_ENTER);
	}
	/**
	 * This method is used to switch to frame based on index
	 * @param driver
	 * @param index
	 */
	public void switchToFrame(WebDriver driver, int index)
	{
		driver.switchTo().frame(index);
	}
	
	/**
	 * This method is used to switch the frame on nameId
	 * @param driver
	 * @param nameorId
	 */
	public void switchToFrame(WebDriver driver, String  nameOrId)
	{
		driver.switchTo().frame(nameOrId);
		
	}
	
	/**
	 * this method is used to switch the frame based on address
	 * @param driver
	 * @param address
	 */
	
	public void switchToFrame(WebDriver driver, WebElement  address)
	{
		driver.switchTo().frame(address);
		
	}
	
	/**
	 * this method is used to accept alert popup
	 * @param driver
	 */
	public void acceptAlertPopup(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
	
	/**
	 * this method is used to cancel the alert
	 * @param driver
	 */
	public void cancelAlertPopup(WebDriver driver)
	{
		driver.switchTo().alert().dismiss();
	}
	
	/**
	 * this method will switch between windows
	 * @param driver
	 */
	
	public void switchToWindow(WebDriver driver,String partialTitle)
	{
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		while(it.hasNext())
		{
			String winid = it.next();
			String currentwintitle = driver.switchTo().window(winid).getTitle();
			if(currentwintitle.contains(partialTitle))
			{
				break;
			}
		}
	}
	/**
	 * this method is used to take screenshot and store it into screen shot folder
	 * @param screenShotName
	 * @return
	 * @throws Throwable 
	 */
       public static String getScreenShot(WebDriver driver,String screenShotName) throws Throwable
       {
    	   TakesScreenshot ts=(TakesScreenshot)driver;
    	  File src = ts.getScreenshotAs(OutputType.FILE);
    	String path = ".\\screenshot\\"+screenShotName+".png";
    	File dest = new File(path);
    	FileUtils.copyFile(src, dest);
    	return path;
    	
       }
       
       public void scrollBarAction(WebDriver driver)
       {
    	   JavascriptExecutor js=(JavascriptExecutor)driver;
    	   js.executeScript("window.scrollBy(0,3000)", "");
       }
       
       public void scrollAction(WebDriver driver,WebElement element)
       {
    	   JavascriptExecutor js=(JavascriptExecutor)driver;
    	 int y = element.getLocation().getY();
    	 js.executeScript("window.scrollBy(0,"+y+")", element);
       }
	
	


}

package com.hra.GenericUtility;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class JavaUtility {
	public int getRandomNumber(){
		Random ran=new Random();
		int random=ran.nextInt(500);
		return random;
	}
	public String getSystemData()
	{
		Date d=new Date();
		String date=d.toString();
		return date;
	}
	/**
	 * This method is used to get system date in format
	 * @author 
	 * @return
	 */
	
	public String getSystemDateFormate()
	{
		SimpleDateFormat dateformate=new SimpleDateFormat("dd/mm/yyyy hh-MM-ss");
		Date date=new Date();
		String systemdateformate=dateformate.format(date);
		return systemdateformate;
	}

}

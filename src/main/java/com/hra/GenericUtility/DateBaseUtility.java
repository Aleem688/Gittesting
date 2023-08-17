package com.hra.GenericUtility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class DateBaseUtility {
	Connection con=null;

public void connectionToDataBase() throws SQLException
	{
		Driver driver=new Driver();
		DriverManager.registerDriver(driver);
		 Connection con = DriverManager.getConnection(IPathConstants.URLdb, IPathConstants.UsernameDb, IPathConstants.Passworddb);
		
	}
	public String executeQueryAndGetData(String query,int col,String expdata) throws SQLException
	{
		 ResultSet result = con.createStatement().executeQuery(query);
		boolean flag=false;
		while(result.next())
		{
		     String data = result.getString(col);
		     
		if(data.equalsIgnoreCase(expdata))
		{
			flag=true;
			break;
		}
		}
		
		if(flag=true)
		{
			System.out.println("data is verified");
			return expdata;
		}
		else {
			System.out.println("data is not created");
		return "";	
		}
		
	}
	
	public void closeDb()throws SQLException
	{
		con.close();
	}

}



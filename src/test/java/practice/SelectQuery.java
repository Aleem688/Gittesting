package practice;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectQuery {

	
	
	public static void main(String[] args) throws SQLException {
		
	
     //Register to the data base
		Connection con = null;
		try {
		Driver driver=new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(driver);
		
		 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sdet50", "root", "root");
		
		Statement state = con.createStatement();
		String query = "select * from student;";
	ResultSet result = state.executeQuery(query);
		while(result.next())
		{
	System.out.println(result.getString(1)+" "+result.getString(2)+" "+result.getString(3)+" "+result.getString(4));
		}
		
	}
	catch (Exception e)
	{
		
	}
		finally {
		con.close();
		
		}
}
}

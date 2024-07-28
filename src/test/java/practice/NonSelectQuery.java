package practice;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.protocol.Resultset;

public class NonSelectQuery {

	public static void main(String[] args) throws SQLException {
		int result=0;
		Connection con=null;
	
		try {
Driver driver=new com.mysql.cj.jdbc.Driver();
DriverManager.registerDriver(driver);
  con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sdet50", "root", "root");
 Statement state = con.createStatement();
 String query = "insert into student values(05,'ahmed','phy','lecture');";
 result = state.executeUpdate(query);

		}
		catch(Exception e)
		{

	}
		finally {
		if(result>0)
		{
			System.out.println("data updated successfully");
		}
		else {
			System.out.println("data is not updated successfully");
		}
		con.close();
		}
}
}

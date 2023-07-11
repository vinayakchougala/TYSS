package practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class FetchdatafromDB 
{
	public static void main(String[] args) throws SQLException 
	{
		Connection conn = null;
		try 
		{
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			conn = DriverManager.getConnection("jdbc:mysql://rmgtestingserver:3333/projects", "root@%", "root");
			Statement state = conn.createStatement();
			String Query = "select * from project";
			ResultSet result = state.executeQuery(Query);
			while (result.next())
			{

				String value = result.getString(1) + "\t " + result.getString(2) + "\t" + result.getString(3) + "\t"
						+ result.getString(4) + "\t" + result.getString(5);
				System.out.println(value);
			}

		}
		finally 
		{
			conn.close();
		}

	}

}

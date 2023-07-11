package practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class CreatedataintoDB 
{
	public static void main(String[] args) throws SQLException 
	{
		Connection conn=null;
		try
		{
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			 conn = DriverManager.getConnection("jdbc:mysql://rmgtestingserver:3333/projects","root@%","root");
			Statement statment = conn.createStatement();
			String Query = "insert into project values('TY_PROJ_1500','Vinu','29/06/2023','Tyss','Completed','10')";
			int result = statment.executeUpdate(Query);
			if(result==1)
			{
				System.out.println("data is created");
			}
			else
			{
				System.out.println("data is not created");
			}
		}
		finally
		{
			conn.close();
		}
	}

}

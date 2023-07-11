package practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class CheckProjectiscreatedinDB 
{
	public static void main(String[] args) throws SQLException
	{   	      
		Connection conn=null;
		String Project_Name = "Myntra";
		try
		{   
			String url = "jdbc:mysql://rmgtestingserver:3333/projects";
			String usn="root@%";
			String pwd="root";
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
		    conn = DriverManager.getConnection(url,usn,pwd);
			Statement state= conn.createStatement();
			String Query = "select  * from project";
			ResultSet result = state.executeQuery(Query);
			boolean flag = false;
			while(result.next())
			{				
				String value = result.getString(4);
				if(value.equalsIgnoreCase(Project_Name))
				{ 
					System.out.println("project is created");
					flag=true;
					break;					
				}
			}
				if(!flag)
				{
					System.out.println("project is not created");
				}		
		}
		finally
		{
			conn.close();
		}		
	}	
}
	
	  	
	     
			    	 
	    

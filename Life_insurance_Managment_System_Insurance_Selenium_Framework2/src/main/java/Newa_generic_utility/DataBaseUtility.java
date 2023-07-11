package Newa_generic_utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

/**
 * used to connect to Db & perform DB specific Operations
 * @author Vinayak
 *
 */
public class DataBaseUtility
{
	Driver driver;
	 Connection connection;
	 ResultSet result;
    FileUtlity fLib = new FileUtlity();
    String URL;
    String USERNAME;
    String PASSWORD;
    
	 public DataBaseUtility()  
		 {
			String filepath = null;
			try 
			{
				filepath = fLib.getFilePathFromPropertiesFile("databaseConfigFilePath");
				URL = fLib.getDataFromProperties(filepath, "url");
				USERNAME = fLib.getDataFromProperties(filepath, "username");
				PASSWORD = fLib.getDataFromProperties(filepath, "password");
			} 
			catch (Throwable e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	 }
		
	 	
	/**
	 * This method will perform the mysql database connection
	 * @throws SQLException 
	 */
	public void connectDB() throws SQLException
	{
		try
		{
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			connection=DriverManager.getConnection(URL, USERNAME, PASSWORD);
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * This method will close the mysql database
	 * @throws SQLException
	 */
	public void closeDB()  
	{
		try 
		{
		  connection.close();
		}
		catch (Exception e) 
		{
			
		}
	}
	
	/**
	 * This method will execute the querry
	 * @param query
	 * @return
	 * @throws Throwable
	 */
	public ResultSet execyteQuery(String query) 
	{	
			try 
			{
				result = connection.createStatement().executeQuery(query);
			}
			catch (SQLException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return result;		
	}
	
	/**
	 * This method will execute the querry
	 * @param query
	 * @return
	 * @throws Throwable
	 */
	public int execyteUpdate(String query) 
	{		
			int result = 0;
			try 
			{
				result = connection.createStatement().executeUpdate(query);
			} 
			catch (SQLException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		return result;
	}
	
	/**
	 * This method will execute querry based on querry and it will verify the data. 
	 * @param querry
	 * @param columnName
	 * @param expectedData
	 * @return
	 * @throws Throwable
	 */
	public boolean executeQuerryAndVerify(String querry,int cloumnIndex,String expectedData)
	{
		boolean flag=false;
		try {
			result=connection.createStatement().executeQuery(querry);
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try 
		{
			while(result.next()) 
			{
				try
				{
					if(result.getString(cloumnIndex).equals(expectedData)) 
					{
						flag=true;
						break;
					}
				}
				catch (SQLException e)
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(flag) 
		{
			System.out.println(expectedData+"==>Data is verified in the data base table");
			return flag;
		}
		else
		{
			System.out.println(expectedData+"==>data is not verified in the database");
			return flag;
		}
         
	}
}

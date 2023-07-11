package Newa_generic_utility;

import java.sql.SQLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import Newa_LIMS_Object_Repository.HomePage;
import Newa_LIMS_Object_Repository.LoginPage;

public class Baseclass 
{  
	public static WebDriver sdriver;
	public WebDriver driver ;
	public FileUtlity fLib = new FileUtlity();
	public ExcelUtlity elib = new ExcelUtlity();
	public WebActionUtility wlib = new WebActionUtility();
	public DataBaseUtility dlib = new DataBaseUtility();
	public String ENV_FILE_PATH;
	public String TEST_SCRIPT_EXCEL_FILE_PATH;

	/**
	 * connecting to My SQL Data Base
	 * 
	 * @throws SQLException
	 */

	@BeforeSuite(groups= {"SmokeTest","RegreTest"})
	public void connectToDB()
	{
		try 
		{
			dlib.connectDB();
			System.out.println("database is connected");
		} 
		catch (Exception e)
		{
			// TODO: handle exception
		}

	}

	/**
	 * Launching the browser
	 * @param BROWSER 
	 * 
	 * @throws Throwable
	 */
 // @Parameters("BROWSER")
	@BeforeClass(groups= {"SmokeTest","RegreTest"})
	public void launchTheBrowser() throws Throwable
	{
		String ENV_FILE_PATH = fLib.getFilePathFromPropertiesFile("projectConfigDataFilePath");
		String BROWSER = fLib.getDataFromProperties(ENV_FILE_PATH, "browser");
		String URL = fLib.getDataFromProperties(ENV_FILE_PATH, "url");
		switch (BROWSER) 
		{
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
		default:
			driver = new ChromeDriver();
		}
		wlib.maximisebrowser(driver);
		driver.get(URL);
		wlib.waitForElementInDOM(driver);
		sdriver=driver;
		System.out.println("Browser is launched");
	}

	/**
	 * Login to application
	 * 
	 * @throws Throwable
	 */
	@BeforeMethod(groups= {"SmokeTest","RegreTest"})
	public void loginToApplication() throws Throwable
	{
		String ENV_FILE_PATH = fLib.getFilePathFromPropertiesFile("projectConfigDataFilePath");
		String USERNAME = fLib.getDataFromProperties(ENV_FILE_PATH, "username");
		String PASSWORD = fLib.getDataFromProperties(ENV_FILE_PATH, "password");
		LoginPage lp = new LoginPage(driver);
		lp.loginToApp(USERNAME, PASSWORD);
		System.out.println("Successfully logged into application");
	}

	/**
	 * Logout from the application
	 */
	@AfterMethod(groups= {"SmokeTest","RegreTest"})
	public void logoutFromApplication() 
	{
		HomePage hp = new HomePage(driver);
		hp.Logout();
	}

	/**
	 * close the browser
	 */
	@AfterClass(groups= {"SmokeTest","RegreTest"})
	public void closeTheBrowser() 
	{
		driver.quit();
		System.out.println("Browser is Closed");
	}

	/**
	 * Close the database connection
	 * 
	 * @throws SQLException
	 */
	@AfterSuite(groups= {"SmokeTest","RegreTest"})
	public void closeDatabase() 
	{
		try
		{
			dlib.closeDB();
			System.out.println("database connection is closed");
		} 
		catch (Exception e) 
		{
			// TODO: handle exception
		}
	}
}

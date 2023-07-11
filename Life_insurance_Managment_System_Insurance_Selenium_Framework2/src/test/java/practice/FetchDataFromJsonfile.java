package practice;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class FetchDataFromJsonfile {

	public static void main(String[] args) throws InterruptedException, IOException, Throwable {
		JSONParser jp = new JSONParser();
		Object ob = jp.parse(new FileReader("./jsondata/lims.json"));
		JSONObject map = (JSONObject) ob;

		String BROWSER = (String) (map.get("browser"));
		System.out.println(BROWSER);
		String URL = (String) (map.get("url"));
		System.out.println(URL);
		String USERNAME = (String) map.get("username");
		System.out.println(USERNAME);
		String PASSWORD = (String) map.get("password");
		System.out.println(PASSWORD);

		/*
		 * FileInputStream fis = new
		 * FileInputStream("D:\\vinayak\\Test Yantra\\Selenium\\LIMS.PROPERTIES");
		 * Properties p = new Properties(); p.load(fis); String BROWSER =
		 * System.getProperty("browser",p.getProperty("browser")); String URL =
		 * System.getProperty("url",p.getProperty("url")); String USERNAME =
		 * System.getProperty("username",p.getProperty("username")); String PASSWORD =
		 * System.getProperty("password",p.getProperty("password"));
		 */
		String Exp_msg = "New Nominee ADDED";

		// open browser
		WebDriver driver;
		if (BROWSER.equals("firefox")) {
			driver = new FirefoxDriver();
		} else if (BROWSER.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (BROWSER.equals("ie")) {
			driver = new InternetExplorerDriver();
		} else {
			driver = new ChromeDriver();
		}

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// Maximize the window
		driver.manage().window().maximize();
		// enter LIMS Project url
		driver.get(URL);
		// Enter Agent Credential (username, Password)
		driver.findElement(By.name("username")).sendKeys(USERNAME);
		driver.findElement(By.name("password")).sendKeys(PASSWORD);
		driver.findElement(By.xpath("//button[.='login']")).click();

		// Create Nominee enter all the valid data
		driver.findElement(By.xpath("//a[@href='nominee.php']")).click();

		driver.findElement(By.xpath("//a[@href='addNominee.php']")).click();
		driver.findElement(By.name("client_id")).sendKeys("1687954867");
		driver.findElement(By.name("name")).sendKeys("varun");
		driver.findElement(By.name("sex")).sendKeys("male");
		driver.findElement(By.name("birth_date")).sendKeys("20/07/2000");
		driver.findElement(By.name("nid")).sendKeys("india");
		driver.findElement(By.name("relationship")).sendKeys("son");
		driver.findElement(By.name("priority")).sendKeys("first");
		driver.findElement(By.name("phone")).sendKeys("8605764303");
		driver.findElement(By.xpath("//input[@type='submit']")).click();

		// varify Nominee added

		WebElement ele = driver.findElement(By.xpath("//div[@class='col-md-12']"));

		String Act_msg = ele.getText();
		System.out.println(Act_msg);

		if (Act_msg.contains(Exp_msg)) {
			System.out.println("Nominee is added Successfully-----Pass");
		} else {
			System.out.println("Nominee is not  added Successfully-----fail");
		}
		Thread.sleep(3000);

		// Logout from Application

		driver.findElement(By.xpath("//a[@title='Logout']")).click();

		Thread.sleep(2000);

		// Close The application

		driver.close();

	}

}

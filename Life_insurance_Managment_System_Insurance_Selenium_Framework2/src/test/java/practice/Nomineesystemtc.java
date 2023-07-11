package practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nomineesystemtc
{ 
	public static void main(String[] args) throws IOException 
	{
		FileInputStream fis = new FileInputStream("D:\\vinayak\\Test Yantra\\Selenium\\LIMS.PROPERTIES");
		Properties p = new Properties();
		p.load(fis);
		String BROWSER = p.getProperty("browser");
		String URL = p.getProperty("url");
		String USERNAME = p.getProperty("username");
		String PASSWORD = p.getProperty("password");
		
	
		// open chrome browser
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// Maximize the window
		driver.manage().window().maximize();
		// enter LIMS Project url
		driver.get(URL);
		// Enter agent user name
		driver.findElement(By.name("username")).sendKeys(USERNAME);
		// Enter agent password
		driver.findElement(By.name("password")).sendKeys(PASSWORD);
		// click on login button
		driver.findElement(By.xpath("//button[.='login']")).click();
		// Click on Agent Button
		driver.findElement(By.xpath("//a[@href='nominee.php']")).click();
		driver.findElement(By.xpath("//a[.='Add Nominee']")).click();
		driver.findElement(By.name("client_id")).sendKeys(" 1511986023 ");
		driver.findElement(By.name("name")).sendKeys(" 1511986023 ");
		driver.findElement(By.name("sex")).sendKeys(" 1511986023 ");
		driver.findElement(By.name("client_id")).sendKeys(" 1511986023 ");
		driver.findElement(By.name("client_id")).sendKeys(" 1511986023 ");
		driver.findElement(By.name("client_id")).sendKeys(" 1511986023 ");
		driver.findElement(By.name("client_id")).sendKeys(" 1511986023 ");
		
	}

}

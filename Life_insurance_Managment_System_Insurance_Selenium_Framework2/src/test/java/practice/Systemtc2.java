package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Systemtc2 
{
	public static void main(String[] args) {
		// open chrome browser
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// Maximize the window
		driver.manage().window().maximize();
		// enter LIMS Project url
		driver.get("http://rmgtestingserver/domain/Life_Insurance_Management_System/");
		// Enter agent user name
		driver.findElement(By.name("username")).sendKeys("555");
		// Enter agent password
		driver.findElement(By.name("password")).sendKeys("666");
		// click on login button
		driver.findElement(By.xpath("//button[.='login']")).click();
		// Click on Agent Button
		driver.findElement(By.xpath("//a[@href='agent.php']")).click();
		// Click on Policy Button
		driver.findElement(By.xpath("//a[@href='policy.php']")).click();
		// Click on Nominee Button
		driver.findElement(By.xpath("//a[@href='nominee.php']")).click();
		// click on Payment Button
		driver.findElement(By.xpath("//a[@href='payment.php']")).click();
		// click on add Payment Button
		driver.findElement(By.xpath("//a[@href='addPayment.php']")).click();
		// Enter valid data into all the fields
		driver.findElement(By.name("client_id")).sendKeys(" 1511986023 ");
		driver.findElement(By.name("month")).sendKeys("June");
		driver.findElement(By.name("amount")).sendKeys("6500");
		driver.findElement(By.name("due")).sendKeys("0");
		driver.findElement(By.name("fine")).sendKeys("0");

		// Click on Submit Button
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		// Logout from the application
		driver.findElement(By.xpath("//a[@title='Logout']")).click();
		// Close the Application
		driver.close();

	}

}

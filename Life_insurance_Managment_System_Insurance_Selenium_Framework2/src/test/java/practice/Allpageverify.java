package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Allpageverify 
{ 
	public static void main(String[] args) 
	{
		   WebDriver driver = new ChromeDriver();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		   driver.manage().window().maximize();
		   driver.get(" http://rmgtestingserver/domain/Life_Insurance_Management_System/");
		   driver.findElement(By.name("username")).sendKeys("555");
		   
		   
			// Enter agent password
			driver.findElement(By.name("password")).sendKeys("666");
			// click on login button
			driver.findElement(By.xpath("//button[.='login']")).click();
		
			// click on Payment Button
			driver.findElement(By.xpath("//a[@href='payment.php']")).click();
			String acttext5= driver.findElement(By.xpath("//h1[@class='page-head-line']")).getText();
			System.out.println(acttext5);
			
		
		   
	}

}

package practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mobilenameandprice 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("apple mobiles");
		Thread.sleep(2000);
		driver.findElement(By.id("nav-search-submit-button")).click();
		List<WebElement> names = driver.findElements(By.xpath("//span[contains(text(),'Apple iPhone')]"));
		List<WebElement> price = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']/../../../..//span[@class='a-price']"));
		
		for (int i = 0; i<names.size(); i++)
		{
			System.out.println(names.get(i).getText()+" "+price.get(i).getText());
			
		}
		
		
	}

}

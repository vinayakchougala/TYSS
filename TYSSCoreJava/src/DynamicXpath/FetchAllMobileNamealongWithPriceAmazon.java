package DynamicXpath;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FetchAllMobileNamealongWithPriceAmazon 
{
    @Test
    public void Mobilenameprice()
    {
    	
    	WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("apple mobiles");		
		driver.findElement(By.id("nav-search-submit-button")).click();
		List<WebElement> all_names = driver.findElements(By.xpath("//span[contains(text(),'Apple iPhone')]"));
		List<WebElement> all_price = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']/../../../..//span[@class='a-price']"));
	
		int count1=all_names.size();
		for (int i = 0; i <count1; i++) 
		{
			 String name = all_names.get(i).getText()+" "+all_price.get(i).getText();
			 System.out.println(name);
		}
    }
		
}

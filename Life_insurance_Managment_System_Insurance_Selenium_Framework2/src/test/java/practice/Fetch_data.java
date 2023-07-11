package practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fetch_data
{
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
		driver.manage().window().maximize();
		driver.get("https://www.icc-cricket.com/rankings/womens/team-rankings/odi");
		List<WebElement> countrys = driver.findElements(By.xpath("//tbody/tr/td[2]/span[2]"));
		List<WebElement> matches = driver.findElements(By.xpath("//tbody/tr/td[3]"));
		
		for (int i = 0; i < countrys.size(); i++)
		{  
			System.out.println(countrys.get(i).getText()+" "+matches.get(i).getText());
			
		}

	}
}

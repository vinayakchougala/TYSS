package DynamicXpath;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FetchallLinksAndWriteintoXcelsheetAmzon
{
      @Test
      public void FetchLink() throws EncryptedDocumentException, IOException
    {
    	  FileInputStream fis =new FileInputStream("./data/testdata.xlsx");
    	 Workbook wb = WorkbookFactory.create(fis);
    	 Sheet sh = wb.getSheet("Sheet1");
    	 
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		List<WebElement> all_links = driver.findElements(By.xpath("//a"));
		int count = all_links.size();
		
		for (int i = 0; i < count; i++)
		{
			Row ro = sh.createRow(i);
			Cell co = ro.createCell(0);
			String value = all_links.get(i).getAttribute("href");
			co.setCellValue(value);
		}
		FileOutputStream fos = new FileOutputStream("./data/testdata.xlsx");
		wb.write(fos);
		wb.close();
	}
}

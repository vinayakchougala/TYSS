package DynamicXpath;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;
     

public class FetchDataFromxcelUsingMapTest 
{
	@Test
	public void fetchdata() throws EncryptedDocumentException, IOException
	{
	  FileInputStream fis =new FileInputStream("./data/testdata.xlsx");
 	 Workbook wb = WorkbookFactory.create(fis);
 	 Sheet sh = wb.getSheet("Sheet2");
 	 int count = sh.getLastRowNum();
 	 
 	LinkedHashMap<String, String>map=new LinkedHashMap<String,String>();
 	for (int i = 0; i < count; i++) 
 	{
		String key = sh.getRow(i).getCell(0).toString();
	    String value = sh.getRow(i).getCell(1).toString();
	    map.put(key, value);			
		}
 	for (Entry<String, String> m: map.entrySet()) 
 	{
	   System.out.println(m.getKey()+" "+m.getValue());		
	} 	
	}	
}


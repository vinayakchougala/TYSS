package practice;

import org.testng.annotations.Test;

public class DataProvider 
{
	@Test(dataProvider = "bookTicket")
	public void getBookDetails(String src, String dst, String price) throws Throwable
	{
		System.out.println(src + " " + dst + " " + price);
		System.out.println(src);
		System.out.println(dst);
		System.out.println(price);
	}
	@org.testng.annotations.DataProvider
	public Object[][] bookTicket() throws Throwable 
	{
		Object[][] obj = new Object[3][3];
		
		obj[0][0] = "Mumbai";
		obj[0][1] = "Bangalore";
		obj[0][2] = "2000";

		obj[1][0] = "Hydrabad";
		obj[1][1] = "Chennai";
		obj[1][2] = "3000";
		
		obj[2][0] = "Pune";
		obj[2][1] = "Hydrabad";
		obj[2][2] = "4000";
		return obj;
	}
}

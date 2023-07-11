package practice;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Dateformatconversion
{
	public static void main(String[] args) 
	{
		Date d = new Date();
		System.out.println(d);
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd");
		String fdate = sdf.format(d);
		System.out.println(fdate);		 
	}
}

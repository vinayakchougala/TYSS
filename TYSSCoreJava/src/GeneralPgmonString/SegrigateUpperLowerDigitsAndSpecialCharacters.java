package GeneralPgmonString;

import java.util.Iterator;

public class SegrigateUpperLowerDigitsAndSpecialCharacters 
{
   public static void main(String[] args) 
   {
	String s = "Test@%123YaNtra";
	String uc=" ";
	String lc=" ";
	String d=" ";
	String sc=" ";
	
	for (int i = 0; i < s.length(); i++) 
	{
		char ch = s.charAt(i);
		if(Character.isUpperCase(ch))
		{
			uc=uc+ch;
		}
		else if (Character.isLowerCase(ch))
		{
			lc=lc+ch;
		}
		else if (Character.isDigit(ch)) 
		{
			d=d+ch;
		}
		else
		{
			sc=sc+ch;
		}
	}
	System.out.println(uc+ " "+lc+" "+d+" "+sc);
	
}
}

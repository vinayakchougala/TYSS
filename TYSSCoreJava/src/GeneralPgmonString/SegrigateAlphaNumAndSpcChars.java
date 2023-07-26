package GeneralPgmonString;

public class SegrigateAlphaNumAndSpcChars
{
   public static void main(String[] args) 
   {
	   String s = "1a2%a3(t,&cd";
	   String alpha="   ";
	   String num="   ";
	   String spc="   ";
	
	 
	   for (int i = 0; i <s.length(); i++)
	   {
		   if(s.charAt(i) >= '0'  &&    s.charAt(i) <= '9')
		   {
			   num=num+s.charAt(i);
		   }		   
		   else if (s.charAt(i)>='A' &&  s.charAt(i)<='Z' || s.charAt(i)>='a' &&  s.charAt(i)<='z') 
		   {
			  alpha=alpha+s.charAt(i);
		  }		   
		   else
		   {
			   spc=spc+s.charAt(i);
		   }			   
	   }
	   System.out.println(num+alpha+spc);
}
}

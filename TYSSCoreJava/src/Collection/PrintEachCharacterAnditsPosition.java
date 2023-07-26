package Collection;

public class PrintEachCharacterAnditsPosition 
{
   public static void main(String[] args)
   {
	   String s = "kannad";
	   for (int i = 0; i < s.length(); i++)
	   {
		System.out.println(s.charAt(i) +" "+(i+1));
	}
   }
}

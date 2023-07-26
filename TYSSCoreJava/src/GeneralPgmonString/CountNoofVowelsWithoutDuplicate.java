package GeneralPgmonString;

import java.util.LinkedHashSet;

public class CountNoofVowelsWithoutDuplicate
{
  public static void main(String[] args) 
  {
	      String s1 ="India";
	      String s2= s1.toLowerCase();	
	      int count =0;
	      
		 LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		  for (int i = 0; i < s2.length(); i++) 
		 {
			 set.add(s2.charAt(i));
		 }
		  for (Character ch: set) // foreach loop for set
		  {
			  if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			  {
				  count++;
				  System.out.print(ch);
			  }
		}
		  System.out.println(count);
   }
}

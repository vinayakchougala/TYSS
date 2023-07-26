package StringPrograms;

import java.util.LinkedHashSet;

public class PrintpositionofEachCharacterwithoutDuplicateCount 
{
    public static void main(String[] args) 
    {
		   String  s = "kannada";
		   LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		   
		   for(int i=0; i<s.length(); i++)
		   {
			   set.add(s.charAt(i));
		   }
		   for (Character ch: set) 
		   {
			  for (int i = 0; i < s.length(); i++) 
			  {
				if(ch == s.charAt(i))
				{
					System.out.println(s.charAt(i)+" is in "+(i+1)+" position ");
					break;
				}
			}
		}
	}
}

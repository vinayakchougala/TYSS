package Collection;

import java.util.LinkedHashSet;

public class RemoveDuplicatesUsgCollection 
{
  public static void main(String[] args)
  {
	 String s = "kannada";  //LinkedHashset remove duplicates and follow order of insertion
	 LinkedHashSet< Character>set = new LinkedHashSet<Character>();
	 
	 for (int i = 0; i < s.length(); i++)
	 {
		 set.add(s.charAt(i));		 
	}
	 for (Character ch: set) 
	 {
		System.out.print(ch);
	}
}
}

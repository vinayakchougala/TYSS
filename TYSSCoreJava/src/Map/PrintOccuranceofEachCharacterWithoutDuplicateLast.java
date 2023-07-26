package Map;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class PrintOccuranceofEachCharacterWithoutDuplicateLast 
{
     public static void main(String[] args)
     {
		String s = "kannada";
		LinkedHashMap<Character, Object> map = new LinkedHashMap<>();
		
		for (int i = 0; i < s.length(); i++) 
		{
			map.put(s.charAt(i), i);
		}
		for(Entry<Character, Object> m: map.entrySet())
		{
			for(int i=s.length()-1; i>=0; i--)
			{
				if(m.getKey()==s.charAt(i))
				{
					System.out.println(s.charAt(i)+" "+(i+1));
					break;
				}
			}
		    }
	    }
}

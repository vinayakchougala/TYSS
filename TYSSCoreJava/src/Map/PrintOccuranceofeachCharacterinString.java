package Map;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class PrintOccuranceofeachCharacterinString
{
    public static void main(String[] args)
    {
		 String s ="kannada";
		 LinkedHashMap<Character, Object> map = new LinkedHashMap<Character, Object>();
		 
		 for (int i = 0; i <s.length(); i++) 
		 {
			map.put(s.charAt(i),i);
		}
		 for (Entry<Character, Object> m:map.entrySet())
		 {
			int count=0;
			for (int i = 0; i <s.length(); i++) 
			{
				if(m.getKey() == s.charAt(i))
				{
					count++;
				}				
			}
			System.out.println(m.getKey()+" is repeating "+ count + " Times");
		}
	}
}

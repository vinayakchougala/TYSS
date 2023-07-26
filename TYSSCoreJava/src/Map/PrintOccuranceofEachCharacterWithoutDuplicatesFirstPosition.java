package Map;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class PrintOccuranceofEachCharacterWithoutDuplicatesFirstPosition 
{
   public static void main(String[] args)
   {
	   String s1 = "KaNnAdDa";
	   String s2 = s1.toUpperCase();	   
	   LinkedHashMap<Character, Object> map = new LinkedHashMap<Character,Object>();
	   
	   for (int i = 0; i < s2.length(); i++) 
	   {
		  map.put(s2.charAt(i),i);
	   }
	   for(Entry<Character, Object> m:map.entrySet())
	   {		  
		   for(int i=0; i<s2.length(); i++)
			   {
		           if(m.getKey() == s2.charAt(i))
		           {
		        	   System.out.println(s2.charAt(i)+" "+ (i+1));
		        	   break;
		           }
			   }
		   }
	   }
   }

	   
	 

package Map;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class RemoveDuplicatesUsingMap 
{
	public static void main(String[] args)
	{
      String s1 = "kaNnAda";
      String s2 = s1.toLowerCase();
      LinkedHashMap<Character, Object> map = new LinkedHashMap<Character,Object>();
 
  for (int i = 0; i <s2.length(); i++) 
  {
	  map.put(s2.charAt(i), i);	
  }
  for (Entry<Character, Object> m:map.entrySet())
  {
     System.out.println(m.getKey()+" ");
  }
	}
}



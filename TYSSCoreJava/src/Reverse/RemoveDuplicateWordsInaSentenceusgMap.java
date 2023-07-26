package Reverse;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class RemoveDuplicateWordsInaSentenceusgMap
{
	// Print order of occurance of each Word 
    public static void main(String[] args)
    {
		 String str ="I am a am a sdet engineer";
		 String[] arr = str.split(" ");
		 LinkedHashMap<String, Object> map = new LinkedHashMap<String,Object>();
		 
		/* for (int i = 0; i < s.length; i++) 
		 {
			map.put(arr[i],i);
		}
		 for (Entry<String,Object> m: map.entrySet())
		 {
			 int count =0;
		     for (int i = 0; i < arr.length; i++) 
		     {
		    	 if(m.getKey().equals(arr[i]))
		    	 {
		    		 count++;
		    	 }
		     }
		     System.out.println(m.getKey()+"  "+count);
		 }*/
		 
		 //Remove duplicate words from given sentence
		 
		/* for (int i = 0; i < arr.length; i++)
		 {
			 map.put(arr[i],i);
		}
		 for (Entry<String, Object> m : map.entrySet())
		 {
			System.out.print(m.getKey()+" ");			
		}	*/
		 
		 //Print each word and its Position
		 
		/* for (int i = 0; i < arr.length; i++) 
		 {
		    System.out.println(arr[i]+" "+(i+1));
		}*/
		 
		 //Print Duplicate word and its count
		 
	        /*for (int i = 0; i < arr.length; i++)
	        {				
				map.put(arr[i],i);
			}
	        for (Entry<String,Object> m : map.entrySet()) 
	        {
				int count =0;
				for (int i = 0; i < arr.length; i++) 
				{
				   if(m.getKey().equals(arr[i]))
				   {
					count++;
				}
			}
				if(count>1)
				{
					System.out.println(m.getKey()+" "+count);
				}
		}*/
		 
		 //Print order of occurance without using duplicate from first position
		 
		 for (int i= 0; i < arr.length; i++)
		 {
			map.put(arr[i],i);
		}
		 for(Entry<String, Object> m: map.entrySet())
		 {
			 for (int i = 0; i < arr.length; i++) 
			 {
			   if(m.getKey().equals(arr[i]))
			   {
				   System.out.println(arr[i]+" "+(i+1));
				   break;
			   }
			}
		 }
		 
		 //Print order of occurance of Each word without using duplicate from Last Position
		 
		/* for (int i= 0; i < arr.length; i++)
		 {
			map.put(arr[i],i);
		}
		 for(Entry<String, Object> m: map.entrySet())
		 {
			 for (int  i =arr.length-1;i>=0;  i--) 
			 {
			   if(m.getKey().equals(s[i]))
			   {
				   System.out.println(arr[i]+" "+(i+1));
				   break;
			   }
			}
		 }	*/	 
    }
}
	


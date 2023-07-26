package TYSSAssignment;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class RemoveDuplicateNumberfromgivenIntegerArrayUsingMap
{
   public static void main(String[] args) 
   {
	   // Print order of occurance of each number 
	   
	  /*int[] arr = {5,3,1,1,2,5,6};
	  LinkedHashMap<Integer,Object> map = new LinkedHashMap<Integer,Object>();
	  for (int i = 0; i < arr.length; i++) 
	  {
		  map.put(arr[i],i);
	  }
	  for (Entry<Integer, Object> m : map.entrySet()) 
	  {
		 int count =0;
		 for (int i = 0; i < arr.length; i++) 
		 {
			  if(m.getKey() == arr[i])
			  {
				  count++;
			  }
		}
		 System.out.println(m.getKey()+" "+count);
	  }*/
	   
	   //Remove duplicate numbers
	   
	  /*  int[] arr = {5,3,1,1,2,5,6};
	    LinkedHashMap<Integer, Object> map = new LinkedHashMap<Integer, Object>();
	    for (int i = 0; i < arr.length; i++)
	    {
			 map.put(arr[i],i);			 
		}
	    for (Entry<Integer, Object> m: map.entrySet()) 
	    {
		     System.out.print(m.getKey()+" ");			
		}	*/
	   
	   // Print duplicate Number and its count
	   
	  /* int[] arr= {5,3,1,1,2,5,6};
	   LinkedHashMap<Integer,Object> map = new LinkedHashMap<Integer,Object>();
	   for (int i = 0; i < arr.length; i++)
	   {
		  map.put(arr[i],i);
	   }
	   for (Entry<Integer,Object> m:map.entrySet()) 
	   {
		int count =0;
		for (int i = 0; i < arr.length; i++)
		{
			if(m.getKey() == arr[i])
			{
				count++;
			}
		}
		if(count>1)
		{
			System.out.println(m.getKey()+" "+count);
		}
	  }*/
	   
	   // Print order of occurance of each number without Duplicate First Position
	   
	   /*int[] arr = {5,3,1,1,2,5,6};
	   LinkedHashMap<Integer, Object> map = new LinkedHashMap<Integer, Object>();
	   for (int i = 0; i < arr.length; i++) 
	   {
		  map.put(arr[i], i);
	  }
	   for (Entry<Integer, Object> m : map.entrySet()) 
	   {
	            for (int i = 0; i < arr.length; i++)
	            {
					 if(m.getKey()==arr[i])
					 {
						 System.out.println(arr[i]+" "+(i+1));
						 break;
					 }
				}
	   }	*/
	   
	   // Print order of occurance of each number without Duplicate Last Position
	   
	   int[] arr = {5,3,1,1,2,5,6};
	   LinkedHashMap<Integer, Object> map = new LinkedHashMap<Integer, Object>();
	   for (int i = 0; i < arr.length; i++) 
	   {
		  map.put(arr[i], i);
	  }
	   for (Entry<Integer, Object> m : map.entrySet()) 
	   {
	            for (int i =arr.length-1; i>=0; i--)
	            {
					 if(m.getKey()==arr[i])
					 {
						 System.out.println(arr[i]+" "+(i+1));
						 break;
					 }
				}
	   }	
    }
}

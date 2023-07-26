package TYSSAssignment;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class RemoveDuplicatesFromGivenIntegerArrayUsingCollection
{
   public static void main(String[] args)
   {
	   // Order of occurance of each number
	   
	  /*  int[]arr= {5,3,1,1,2,5,6};
	    LinkedHashSet<Integer> set = new LinkedHashSet<>();
	    
	    for (int i = 0; i < arr.length; i++)
	    {
			set.add(arr[i]);
		}
	    for (Integer in : set) 
	    {
			int count = 0;
			for (int i = 0; i < arr.length; i++)
			{
				if(in==arr[i])
				{
					count++;
				}
			}
			 System.out.println(in+" "+count+" Times Repeating ");
		}*/
	   
	   // Remove Duplicate numbers
	   
	   /*int arr[] = {5,3,1,1,2,5,6};
	   LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
	   for (int i = 0; i < arr.length; i++) 
	   {
		set.add(arr[i]);
	  }
	   for (Integer in : set) 
	   {
		   System.out.print(in);
	   }*/
	   
	   // Print Position of each number
	   
	  /* int arr[] = {5,3,1,1,2,5,6};
	   LinkedHashSet<Integer>set = new LinkedHashSet<Integer>();
	   for (int i = 0; i < arr.length; i++)
	   {
		   System.out.println(arr[i]+" "+(i+1));
	  }	 */
	   
	   // Print Duplicate Number and its count	
	   
	  /* int arr[] = {5,3,1,1,2,5,6};
	   LinkedHashSet<Integer>set = new LinkedHashSet<Integer>();
	    for (int i = 0; i < arr.length; i++)
	    {
			set.add(arr[i]);
		}
	    for (Integer in : set) 
	    {
			int count = 0;
			for (int i = 0; i < arr.length; i++)
			{
					if(in==arr[i])
					{
						count++;
					}
				}				
			if(count>1)
			{			 
			System.out.println(in+" "+count);
		  }
	    }*/
	   
	   //Print order of occurance of each number without using duplicate
	   
	   int arr[] = {5,3,1,1,2,5,6};
	   LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
	   for (int i = 0; i < arr.length; i++) 
	   {
		   set.add(arr[i]);
	  }
	   for (Integer in: set) 
	   {
		  for (int i = 0; i < arr.length; i++) 
		  {
			if(in ==arr[i])
			{
				System.out.println(arr[i]+" "+(i+1));
				break;
			}
		 }
	   } 
	   	   
	   //Print order of occurance of each number without using duplicate Last
	   
	   /*int arr[] = {5,3,1,1,2,5,6};
	   LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
	   for (int i = 0; i < arr.length; i++) 
	   {
		   set.add(arr[i]);
	  }
	   for (Integer in: set) 
	   {
		  for (int i=arr.length-1; i>=0; i--) 
		  {
			if(in ==arr[i])
			{
				System.out.println(arr[i]+" "+(i+1));
				break;
			}
		 }
	   } */	   
	  }
   }

   


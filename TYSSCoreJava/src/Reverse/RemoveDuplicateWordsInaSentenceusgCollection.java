package Reverse;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class RemoveDuplicateWordsInaSentenceusgCollection
{
	 
    public static void main(String[] args)
    {
		 String s ="I am a am a sdet engineer";
		 String[] arr= s.split(" ");
		 LinkedHashSet<String> set = new LinkedHashSet<String>();
		 
		 /*for (int i = 0; i < arr.length; i++) 
		 {			
			 set.add(arr[i]);			 
		 }
		 for (String st : set) 
		 {
			int count=0;
			for (int i = 0; i < arr.length; i++) 
			{
				if(st.equals( arr[i]))
				{
					count++;
				}				
			}
			System.out.println(st + " " + count);
		}	*/	 
		 
	// Remove duplicate words
		 
		/* for (int i = 0; i < arr.length; i++) 
		 {
			  set.add(arr[i]);
		}
		 for (String str : set) 
		 {
			System.out.println(str);
		}*/
		 
		 // Print duplicate word & its count
		 
		/* for (int i = 0; i < arr.length; i++)
		 {
			set.add(arr[i]);
		}
		 for (String str : set) 
		 {
			int count=0;
			for (int i = 0; i < arr.length; i++) 
			{
				if(str.equals(arr[i]))
				{
					count++;
				}				
			}
			if(count>1)
			{
				System.out.println(str+" "+count);
			}
		}*/
		 
		 // Print each word and its position
		 
		/* for (int i = 0; i < arr.length; i++) 
		 {
			 System.out.println(arr[i]+ " "+ (i+1));
		}*/
		 
		 //Print each word without duplicate First Position
		 
		/* for (int i = 0; i< arr.length; i++) 
		 {
			set.add(arr[i]);			
		 }
		 for (String str: set) 
		 {
			for (int i = 0; i < arr.length; i++) 
			{				
				if(str.equals(arr[i]))
				{
					System.out.println(arr[i]+" "+(i+1));
					break;
				}				
			}	
		 }*/
		 
		 //Print position of each word without duplicate Last position
		 
		 for (int i = 0; i< arr.length; i++) 
		 {
			set.add(arr[i]);			
		 }
		 for (String str: set) 
		 {
			for (int i=arr.length-1;i>=0; i--) 
			{				
				if(str.equals(arr[i]))
				{
					System.out.println(arr[i]+" "+(i+1));
					break;
				}				
			}	
		 }
    }
}

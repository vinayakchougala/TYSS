package Reverse;

import java.util.Iterator;

public class RemoveSpaceBetweenTheString 
{
   public static void main(String[] args)
  {
	  String s ="I am a sdet engineer";
	  String[] arr =s.split(" ");
	  for (int i = 0; i < arr.length; i++)
	  {		
		System.out.print(arr[i]);		
	}	
  }
}

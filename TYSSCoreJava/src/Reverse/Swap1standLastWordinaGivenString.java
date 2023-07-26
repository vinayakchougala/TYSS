package Reverse;

import java.util.ArrayList;
import java.util.Collections;

public class Swap1standLastWordinaGivenString 
{
    public static void main(String[] args) 
    {
		 String str = "i am a sdet engineer";
		 String[] arr = str.split(" ");
		 
		String temp =arr[0];
		System.out.println(temp);
		 arr[0]=arr[arr.length-1];                             // a=b
		 arr[arr.length-1]=temp;   
		 	
		 for (int i = 0; i < arr.length; i++) 
		 {
			System.out.print(arr[i]+" ");
		}		
	}
}

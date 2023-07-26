package Reverse;

public class ReverseSentenceBySplitFunction 
{
    public static void main(String[] args) 
    {
		 String s1 =" i am a sdet engineer";
		  String[] arr = s1.split(" ");
		  
		  for (int i = arr.length-1; i >=0; i--) 
		  {
			System.out.print(arr[i]+" ");
		}
	}
}

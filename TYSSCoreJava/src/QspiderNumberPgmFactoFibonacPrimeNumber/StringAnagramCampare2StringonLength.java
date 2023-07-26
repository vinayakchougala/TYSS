package QspiderNumberPgmFactoFibonacPrimeNumber;


import java.util.Arrays;

public class StringAnagramCampare2StringonLength 
{
      public static void main(String[] args) 
      {
		String S1 ="war";
		String S2="rwa";
		
		if(S1.length()==S2.length())
		{
		char[] arr =S1.toCharArray();
		char[] abb =S2.toCharArray();
		
		Arrays.sort(arr);
		Arrays.sort(abb);
		
		String S3 = new String(arr);
		String S4 = new String(abb);
		
		if(S3.equals(S4))
		{
			System.out.println(" Strings are anagram ");
		}
		else
			System.out.println(" Strings are not anagram ");
      }
		else
			System.out.println(" Strings are not anagram ");
	}
}


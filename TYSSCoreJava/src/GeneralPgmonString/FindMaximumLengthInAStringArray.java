package GeneralPgmonString;

public class FindMaximumLengthInAStringArray
{
 public static void main(String[] args)
 {
		String[] arr= {"ab", "abc", "abcde", "abcdef", "abcdefg"};// maximum string length =abcde Length is 7
		String max_Length = arr[0];
		
		for (int i = 0; i < arr.length; i++)
		{
			if(arr[i].length()  >  max_Length.length())   // length function 
			{
				 max_Length=arr[i];
			}
		}
		System.out.print(max_Length);
		}
}

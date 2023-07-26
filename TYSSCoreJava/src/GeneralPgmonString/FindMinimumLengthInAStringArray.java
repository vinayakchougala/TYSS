package GeneralPgmonString;

public class FindMinimumLengthInAStringArray 
{
    public static void main(String[] args) 
    {
		String[] arr= {"ab", "abc", "abc", "abcde", "abcdef"};// minimun string length =ab Length is 2
		String min_Length = arr[0];
		
		for (int i = 0; i < arr.length; i++) 
		{
			 if(arr[i].length()  <  min_Length.length())
			 {
				 min_Length=arr[i];			
			 }			
		}
		 System.out.print(min_Length);
	}
}

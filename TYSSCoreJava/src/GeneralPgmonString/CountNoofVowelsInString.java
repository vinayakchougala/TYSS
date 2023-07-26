package GeneralPgmonString;

public class CountNoofVowelsInString
{
     public static void main(String[] args) 
     {
		/* String s ="india";
		 char[] arr= s.toCharArray(); // cover to character array
		 int count =0;
		 for (int i = 0; i < arr.length; i++) 
		 {			
			if(arr[i] =='a' || arr[i] =='e' || arr[i] =='i' || arr[i] =='o' || arr[i] =='u' )// fetch every character and camparision with ovwels
			{
				count++;		// increament count
				System.out.print(arr[i]); // after matching print
			}	
		}
		 System.out.println(count);// print count */
		 
		 String s ="india";
		 int count =0;
		 for (int i = 0; i <s.length(); i++) 
		 {
			 if(s.charAt(i) =='a' || s.charAt(i)  =='e' || s.charAt(i)  =='i' || s.charAt(i)  =='o' || s.charAt(i)  =='u' )
			 {
				 count++;
				 System.out.print(s.charAt(i));
			 }
		}
		 System.out.println(count);
	}	
}
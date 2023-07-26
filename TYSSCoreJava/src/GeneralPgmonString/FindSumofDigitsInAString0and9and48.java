package GeneralPgmonString;

public class FindSumofDigitsInAString0and9and48 
{
   public static void main(String[] args) 
   {
	      String s = "a2b1d3"; //o/p:6
	      int sum =0;
	      
	      for (int i = 0; i < s.length(); i++) 
	      {
			if(s.charAt(i)>='0'   &&   s.charAt(i)<='9' )
			{
				int n =s.charAt(i)-48;
				sum=sum+n;
			}
		}
	      System.out.println(sum);	      
    }
}


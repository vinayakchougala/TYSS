package QspiderNumberPgmFactoFibonacPrimeNumber;

public class FindPrimeNumbersInaIntegerArray 
{
   public static void main(String[] args) 
   {
	      int[] arr = {1,3,2,4,5,7};
	    
	      for (int i = 0; i < arr.length; i++) 
	      { 	    	  
			 int no = arr[i];
			 int count =0;
			 for (int j = 1; j <= no; j++) 
			 {
				if(no%j==0)
				{
					count++;
				}
			}
			 if(count==2)
			 {
				 System.out.println(no +" it is Prime no");
			 }
			 else
			 {
				 System.out.println(no +" it is not a Prime no");
			 }
		}
    }
}

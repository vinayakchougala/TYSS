package QspiderNumberPgmFactoFibonacPrimeNumber;

public class NumberPalindrome 
{
   public static void main(String[] args) 
   {
	    int no = 121;
	    int sum = 0;
	    int copy = no;	    
	    while(no!=0)
	    {
	    	int rem =no%10;
	    	sum=(sum*10)+rem;
	    	no=no/10;
	    }
	    if(copy==sum)
	    {
	    	System.out.println(copy+" it is Number Polindrome");
	    }
	    else
	    {
	    	System.out.println(copy+" it is not a Number Polindrome");
	    }	    
    }
}

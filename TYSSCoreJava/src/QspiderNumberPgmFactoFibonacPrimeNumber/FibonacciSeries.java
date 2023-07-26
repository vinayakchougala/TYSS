package QspiderNumberPgmFactoFibonacPrimeNumber;

public class FibonacciSeries
{
   public static void main(String[] args) 
   {
	    int fib1=0;
	    int fib2=1;                                                          //  0 1 1 2 3 5
	    System.out.println(fib1); 
	    System.out.println(fib2); 
	    
	    for (int i = 1; i <=10; i++)                 
	    {  
	    	int fib3=fib1+fib2;
			fib1=fib2;
			fib2=fib3;
			System.out.println(fib3);
		}
   }
}

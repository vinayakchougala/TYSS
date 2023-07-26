package QspiderNumberPgmFactoFibonacPrimeNumber;

import org.testng.annotations.Test;

public class Swap2Numberswithusing3rdVariable
{
    @Test
	public void swapnumbers()  
    {
		int a = 60;
		int b = 90;
		
        int temp = a;
		a=b;
		b=temp;
		System.out.println(a);
		System.out.println(b);
	}
}

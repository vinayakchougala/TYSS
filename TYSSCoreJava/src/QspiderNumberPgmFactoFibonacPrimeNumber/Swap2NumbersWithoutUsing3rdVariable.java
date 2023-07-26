package QspiderNumberPgmFactoFibonacPrimeNumber;

import org.testng.annotations.Test;

public class Swap2NumbersWithoutUsing3rdVariable 
{
    @Test
    public void swapwithout3rdvariable()
    {
    	int a =90;
    	int b=60;
    	a = a+b; //90+60=150
    	 b =a-b; //150-60=90
    	 a=a-b; //150-90=60
    	System.out.println(a);
    	System.out.println(b);
    }
}

package QspiderNumberPgmFactoFibonacPrimeNumber;

import org.testng.annotations.Test;

public class StrongNumberSumofFactorialofEachNumber 
{
    public static void main(String[] args)
    {
		 int no = 145;
		 int sum =0;
		 int copy =no;
		 
		 while(no!=0)
		 {
			 int rem = no%10;
			 int fact =1;
			 for (int i = rem; i>=1; i--)
			 {
				fact=fact*i;
			}
			 sum=sum+fact;
			 no=no/10;
		 }
		 if(copy==sum)
		 {
			 System.out.println(copy  +"  it is strong number  ");
		 }
		 else
		 {
			 System.out.println(copy  +"  it is not strong number  ");
		 }
	}
}

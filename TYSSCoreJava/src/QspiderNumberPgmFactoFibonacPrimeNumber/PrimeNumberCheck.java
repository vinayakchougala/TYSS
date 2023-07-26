package QspiderNumberPgmFactoFibonacPrimeNumber;

public class PrimeNumberCheck
{
    public static void main(String[] args)
    {
		 int no = 7;
		 int count = 0;
		 
		 for (int i = 1; i <=7; i++) 
		 {
			if(no%i==0)
			{
				count++;
			}
		 }
			if(count ==2)
			{
				System.out.println(no+" it is Prime Number");
			}
			else
			{
				System.out.println(no+" it is not a Prime Number");
			}
		}
	}


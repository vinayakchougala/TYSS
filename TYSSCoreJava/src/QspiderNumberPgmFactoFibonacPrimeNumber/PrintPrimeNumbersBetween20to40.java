package QspiderNumberPgmFactoFibonacPrimeNumber;

public class PrintPrimeNumbersBetween20to40
{
    public static void main(String[] args) 
    {
		for (int i = 20; i <=40; i++)
		{   
			int no = i;
			int count=0;
			for (int j = 1; j <=no; j++)
			{
				if(no%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.println(no + " it is a Prime Number ");
			}
			else
			{
				System.out.println(no + " it is not a Prime Number ");
			}
		}
	}
}

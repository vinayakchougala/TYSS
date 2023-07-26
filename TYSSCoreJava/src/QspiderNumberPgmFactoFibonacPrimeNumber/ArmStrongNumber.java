package QspiderNumberPgmFactoFibonacPrimeNumber;

public class ArmStrongNumber 
{
           public static void main(String[] args) //153 
           {
			     int no = 153;
			     int sum = 0;
			     int copy = no;
			     
			     while(no!=0)
			     {
			    	 int rem=no%10;
			    	 sum=sum+(rem*rem*rem);
			    	 no=no/10;
			     }
			     if(copy==sum)
			     {
			    	 System.out.println(copy+" it is arm Strong number");
			     }
			     else
			     {
			    	 System.out.println(copy+" it is not a arm Strong number");
			     }
			     
		   }
}

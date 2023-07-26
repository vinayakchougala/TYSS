package QspiderNumberPgmFactoFibonacPrimeNumber;

public class Swap2StringWithoutUsing3rdVariable
{
   public static void main(String[] args)
   {
	String a ="Hello";
	String b ="World";
	
	a=a+b;  //HelloWorld
	b=a.substring(0,a.length()-b.length()); // 0,10-5=0,5(World)
	a=a.substring(b.length()); // 0,5(Hello)
	
	System.out.println(a);
	System.out.println(b);
	
}
}

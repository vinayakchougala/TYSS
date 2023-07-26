package QspiderNumberPgmFactoFibonacPrimeNumber;

public class CovertLowerCaseToUpperCase97and122 
{
    public static void main(String[] args) 
    {
    	char ch;
		String s1 = "TESTyantraSOFTWAREsolutionPVTltd";
		String s2="";
		
		
	for (int i = 0; i <s1.length(); i++) 
	{
		 ch = s1.charAt(i);
		
		if(ch>97   &&  ch<122 )
		{
			s2=s2 + (char)(ch-32);
		}
		else
		{
			s2=s2 + (char)(ch+32);
		}
		}
	       System.out.println(s2);
	}
}

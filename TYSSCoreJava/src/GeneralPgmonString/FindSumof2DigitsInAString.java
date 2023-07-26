package GeneralPgmonString;

public class FindSumof2DigitsInAString 
{
    public static void main(String[] args)
    {
		String s ="a11b12c3";   //op: 11+12+3=26
		int sum=0;   // 0 11 23
		int tsum=0;  // 0 1 11 0 1 12 0 3
		
		for (int i = 0; i < s.length(); i++) 
		{
			// i=1   1<8t    s.chrAt(i) = 1
			// i=2   2<8t                       = 1
			// i=3   3<8t                        = b
			// i=4   4<8t                        = 1
			// i=5    5<8t                       = 2
			// i=6    6<8t                       = c
			// i=7    7<8t                       = 3
			// i=8     8<8f    
			
			if( s.charAt(i)>='0'   &&   s.charAt(i)<='9' )
			{                                                                                                 // ascii value of 0 is 48 
				int n = s.charAt(i)-48;  //n=51-48=3                          //  ascii value of 1 = 49 n=49-48 
				tsum=tsum*10+n;       //tsum=0*10+3=3               //  ascii value of 2 = 50 n=50-48 
			}
			else
			{
				sum=sum+tsum; //sum=11+12=23
				tsum=0; //0 0
			}
		}
		sum=sum+tsum;
		System.out.println(sum);
	}
}

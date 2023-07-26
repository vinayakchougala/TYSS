package TYSSAssignment;

public class FindSumofFirst3MinimumNoINArrayWithoutusingBST 
{
	static void print(int[] arr)
	{
		int Fm = Integer.MAX_VALUE;
		int Sm = Integer.MAX_VALUE;
		int Tm = Integer.MAX_VALUE;
		int sum =0;
		
		for (int i = 0; i < arr.length; i++) 
		{
			if(arr[i]<Fm)
			{
				Tm=Sm;
			    Sm=Fm;
			    Fm=arr[i];    
			}
			else if (arr[i]<Sm) 
			{
				Tm=Sm;
				Sm=arr[i];
			}
			else if (arr[i]<Sm) 
			{
				Tm=Sm;
				Sm=arr[i];
			}
			else if (arr[i]<Tm) 
			{
				Tm=arr[i];
			}
		}
		sum = sum+Fm+Sm+Tm;
		System.out.println(sum);
	}	
	public static void main(String[] args)
	{
		 int []arr= {1,3,5,7,8};
		 print(arr);
		 
	}
}

package ArrayProgrammes;

public class PrintCombinationofNumbers 
{
	public static void main(String[] args)
	{
    int[] arr = {9,7,8,5,2,4,3,6};// combination of 2 nos summation  output is 11
    for (int i = 0; i < arr.length; i++)
    {
		for (int j = 0; j < arr.length; j++) 
		{
			if(arr[i]+arr[j]==11)
			{
				System.out.println(arr[i]+" "+arr[j]);
			}
		}
	}
  }
}

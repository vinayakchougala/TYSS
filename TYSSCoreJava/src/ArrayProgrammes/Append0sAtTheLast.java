package ArrayProgrammes;

public class Append0sAtTheLast
{
  public static void main(String[] args) 
  {
	int [] arr = {0,4,0,6,0,1};
	int [] abb = new int[arr.length];
	int m=0;
	int n=arr.length-1; //5
	for (int i = 0; i < arr.length; i++) 
	{
		if(arr[i]!=0)//                                                 arr[0]!=0
		{                                                                         // 0!=0
			abb[m]=arr[i];
			m++;
		}
		else
		{
			abb[n]=arr[i];
			n--;
		}
	}
	for (int i = 0; i < abb.length; i++)
	{
		System.out.println(abb[i]+" ");
	}
} 
}

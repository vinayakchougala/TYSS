package ArrayProgrammes;

public class SumofFirst3MaximumNO 
{
	 public static void main(String[] args)
	  {
		  int[] arr = {5,2,1,0,4};
		  for(int i=0; i<arr.length-1; i++)
		  {
			  for(int j=0; j<arr.length-1; j++)
			  {
		   	  if(arr[j]<arr[j+1])
		  {
			  int temp = arr[j];
			  arr[j]=arr[j+1];
			  arr[j+1]=temp;
		  }					
			  }
		  }
		int sum = 0;
		for(int k=0; k<3; k++)
		{
			sum=sum+arr[k];
		}
		System.out.println(sum);
	  }
}

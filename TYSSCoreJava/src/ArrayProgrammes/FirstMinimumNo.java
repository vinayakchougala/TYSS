package ArrayProgrammes;

public class FirstMinimumNo 
{

	  public static void main(String[] args)
	  {
		  int[] arr = {5,2,1,0,4};
		  for(int i=0; i<arr.length-1; i++)
		  {
			  for(int j=0; j<arr.length-1; j++)
			  {
		   	  if(arr[j]>arr[j+1])
		  {
			  int temp = arr[j];
			  arr[j]=arr[j+1];
			  arr[j+1]=temp;
		  }				
			  }
		  }
		  System.out.println(arr[0]);		 
	  }
}
		  
	  


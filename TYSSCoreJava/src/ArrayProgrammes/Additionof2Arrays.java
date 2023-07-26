package ArrayProgrammes;

public class Additionof2Arrays 
{

public static void main(String[] args) 
  {
	  int[] arr = {4,2,5,1,3,4,5};
	  int[] abb = {3,1,6,4,3}; //out put 7 3 11 5 3
	  int length = arr.length;
	  if(arr.length<abb.length)
	  {
		  length = abb.length;
	  }
	  for (int i = 0; i <length; i++)
	  {
		try
		{
			System.out.println(arr[i]+abb[i]+" ");
		}
		catch(Exception e)
		{
		 if(arr.length<abb.length)
		 {
			 System.out.println(abb[i]);
		 }
			 else
			 {
				 System.out.println(arr[i]);
			 }
		 }		
	}
}
}

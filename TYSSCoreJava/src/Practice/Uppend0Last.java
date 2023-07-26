package Practice;

public class Uppend0Last
{
	public static void main(String[] args) 
	{
  /*int[]arr = {0,4,0,1,0,6};
  int[]abb=new int[arr.length];
  int m=0;
  int n=arr.length-1;
  for (int i = 0; i < arr.length; i++)
  {
	 if(arr[i]!=0)
	 {
		 abb[m]=arr[i];
		 m++;
	 }
	 else
	 {
		 abb[m]=arr[i];
		 n--;
	 }
}
  for (int i = 0; i < abb.length; i++) 
  {
	  System.out.println(abb[i]+" ");
}*/
		
		/*int[]arr= {0,4,0,1,0,6};
		int[]abb=new int[arr.length];
		int m=0;
		int n=arr.length-1;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]!=0)
			{
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
		}*/
		
		int[]arr= {0,4,0,1,0,6};
		int[]abb=new int[arr.length];
		int m=0;
		int n=arr.length-1;
		for (int i = 0; i < arr.length; i++)
		{
			if(arr[i]!=0)
			{
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

				
	


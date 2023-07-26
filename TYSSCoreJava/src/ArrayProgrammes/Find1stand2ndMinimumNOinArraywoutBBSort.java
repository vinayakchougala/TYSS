package ArrayProgrammes;

import java.util.Iterator;

import org.testng.annotations.Test;

public class Find1stand2ndMinimumNOinArraywoutBBSort 
{
   
    static void print(  int arr[]   )
   {	
	   int FM = Integer.MAX_VALUE;
	   int SM =Integer.MAX_VALUE;
	   int TM =Integer.MAX_VALUE;
	   	   
	   for (int i = 0; i < arr.length; i++) 
	   {
		   if(arr[i]<FM)
		   {
			   TM=SM;
			   SM=FM;
			   FM=arr[i];
		   }
		   else if (arr[i]<SM) 
		   {
			   TM=SM;
			   SM=arr[i];
		   }
		   else if(arr[i]<TM)
		   {
			   TM=arr[i];
		   }
	   }
	   System.out.println(FM);
	   System.out.println(SM);
	   System.out.println(TM);	   
   }
   public static void main(String[] args)
   {
	   int[]arr= {10,3,8,0,1};
	   print(arr);	   
   }
}
			  
	
	   
   


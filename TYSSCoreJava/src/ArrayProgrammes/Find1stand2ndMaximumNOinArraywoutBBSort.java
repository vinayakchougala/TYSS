package ArrayProgrammes;

public class Find1stand2ndMaximumNOinArraywoutBBSort
{
	   public static void main(String[] args)
	  {	
		   int[]arr= {4,3,8,2,1};
		   int FL = 0;
		   int SL =0;
		   int TL =0;
		   
		   for (int i = 0; i < arr.length; i++) 
		   {
			   if(arr[i]>FL)
			   {
				   TL=SL;
				   SL=FL;
				   FL=arr[i];
			   }
			   else if (arr[i]>SL) 
			   {
				   TL=SL;
				   SL=arr[i];
			   }
			   else if(arr[i]>TL)
			   {
				   TL=arr[i];
			   }
		   }
		   System.out.println(FL);
		   System.out.println(SL);
		   System.out.println(TL);		   
}
}

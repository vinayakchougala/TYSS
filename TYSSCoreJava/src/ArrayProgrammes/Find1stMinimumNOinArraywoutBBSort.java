package ArrayProgrammes;
public class Find1stMinimumNOinArraywoutBBSort 
{
    static void print(int [] arr)
   {
	 int FM = Integer.MAX_VALUE;
	 int SM = Integer.MAX_VALUE;
	 for(int i=0; i<arr.length;i++)
	 {
		 if(arr[i]<FM)
		 {
			 SM=FM;
			 FM=arr[i];
		 }
	 }
	 System.out.println(FM);
}
    public static void main(String[] args)
    {
   	    int[]arr= {1,8,5,2,3};
   	    print(arr);
	}
}

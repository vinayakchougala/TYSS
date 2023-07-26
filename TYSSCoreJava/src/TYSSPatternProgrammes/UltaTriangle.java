package TYSSPatternProgrammes;

public class UltaTriangle 
{
   public static void main(String[] args)
   {
	 //         * * * * *
      //          * * * *
       //          * * *
        //          * *
       //             *
	   
	   int space=0;
	   int star=5;
	   for (int i = 0; i <=5; i++) // for 5 nos row printing
	   {
		  for (int j=0; j<=space; j++) 
		  {
			System.out.print(" ");
	   	}
		  for (int k=1; k<=star; k++)// for 5 nos column printing
		  {
			System.out.print("*");
		}
		  System.out.println();
		  space++;
		  star=star-1;
	   }	   
   }
}
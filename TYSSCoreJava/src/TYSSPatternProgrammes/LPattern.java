package TYSSPatternProgrammes;

public class LPattern
{
   public static void main(String[] args) 
   {
/*  *  
	   *    *  
	   *    *    *  
	   *    *    *    *  
	   *    *    *    *    *    */

	   
	   
	   /*int n=5;
	   for (int i = 1; i <=n; i++)                // for rowise printing
		 {
			 //i=1 i<=5t 
		   //i=2 i<=5t 
		   //i=3 i<=5t 
		   //i=4 i<=5t 
		   //i=5 i<=5t 
		   //i=6 i<=5t terminate
		 
			for(int j=1; j<=i; j++)                  // for columnwise printing
			{
				System.out.print("*  ");         // row printing
			}
			System.out.println();                  // column printing
		}	*/	 
	 
	   int star =1;
	   int space=3;
	   for (int i = 0; i <=4; i++) 
	   {
		  for (int j=1; j<=star; j++)
		  {
			System.out.print("  *  "); 
		  }
		  for (int k=1; k<=space; k++)
		  {
			System.out.print("    ");
		  }
		  System.out.println();
		  star++;
		  space--;
	  }
     }
    }

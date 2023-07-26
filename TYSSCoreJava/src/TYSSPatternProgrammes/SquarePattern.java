package TYSSPatternProgrammes;

public class SquarePattern
{
	//pattern output
	//* * * * *
	//* * * * *
	//* * * * *
	//* * * * *
	//* * * * *
     public static void main(String[] args)
     {		 
		 for (int i = 1; i <=5; i++)                // for rowise printing
		 {
			 // i=1 i<=5t 
			for(int j=1; j<=5; j++)                  // for columnwise printing
			{
				System.out.print("*  ");         // row printing
			}
			System.out.println();                  // column printing
		}		 
	 }
}

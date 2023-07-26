package TYSSPatternProgrammes;

public class Pattern1 
{
   public static void main(String[] args) 
   {
	  int star=1;
	  int space=4;
	  
	  for (int i=1; i<=5; i++)
	  {
		char ch='A';
		for (int j=1; j<=star; j++)
		{		
			System.out.print(ch++ +" ");
		}
		for (int k=1; k<=space; k++) 
		{
			System.out.print("");
		}
		System.out.println();
		star++;
		space--;
	}
  }
}

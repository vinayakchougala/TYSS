package Collection;

public class ReverseSentence 
{
         public static void main(String[] args) 
         {
			 String s1 =" i am a sdet engineer";
			  String[] s2 = s1.split(" ");
			  
			  for (int i = s2.length-1; i >=0; i--) 
			  {
				System.out.print(s2[i]+" ");
			}
		}
}

package TYSSAssignment;

public class ReverseSentence 
{
    public static void main(String[] args)
    {
		 String s = "i am a sdet engineer";
		 String []arr=s.split(" ");
		 for (int i = arr.length-1; i>=0;i--)
		 {
			String s1=arr[i];
			for (int j =s1.length()-1; j>=0; j--)
			{
				System.out.print(s1.charAt(j));
			}		
		}		 
	}
}

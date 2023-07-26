package Reverse;

public class ReverseEachWordInASentence
{
    public static void main(String[] args) 
    {
		 String s = "I am a sdet engineer";
		 String[] arr = s.split(" "); // split
		 
		 for(int i=0; i<arr.length; i++)
		 {
			 String s1= arr[i];		// remove space	 
			 for (int  j =s1.length()-1; j>=0; j--) // reverse
			 {
				System.out.print(s1.charAt(j));
			}
			System.out.print(" "); // add space
		 }
	}
}

package StringPrograms;

public class RverseStringusgtochararray 
{
  public static void main(String[] args) 
  {
	 String s = "java";
	 char[] arr = s.toCharArray();
	 for(int i=arr.length-1; i>=0; i--)
	 {
		System.out.print(arr[i]);
	}
}
}

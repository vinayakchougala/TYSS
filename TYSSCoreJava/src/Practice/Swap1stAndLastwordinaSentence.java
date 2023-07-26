package Practice;

public class Swap1stAndLastwordinaSentence
{
   public static void main(String[] args) 
   {
	  /*String s ="my name is vinayak";
	 String[] arr = s.split(" ");
	 String temp = arr[0];
	 arr[0]=arr[arr.length-1];
	 arr[arr.length-1]=temp;
	 
	 for (int i = 0; i < arr.length; i++)
	 {
		System.out.println(arr[i]+" ");
	}*/
	   
	   /*String s ="my name is ashok";
	   String[] arr=s.split(" ");
	   
	   String temp = arr[0];
	   arr[0]=arr[arr.length-1];
	   arr[arr.length-1]=temp;
	   
	   for (int i = 0; i < arr.length; i++) 
	   {
		 System.out.println(arr[i]+" ");
	}*/
	   
	   String s ="my name is vinayak";
	   String arr[]=s.split(" ");
	   
	   String temp =arr[0];
	   arr[0]=arr[arr.length-1];
	   arr[arr.length-1]=temp;
	   
	   for (int i = 0; i < arr.length; i++)
	   {
		 System.out.println(arr[i]+" ");
	}
	   
	 
}
}

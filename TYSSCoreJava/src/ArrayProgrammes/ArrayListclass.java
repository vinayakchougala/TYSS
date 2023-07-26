package ArrayProgrammes;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListclass 
{
	public static void main(String[] args) 
	{
		  ArrayList<Object> List = new ArrayList<Object>();
		  List.add(10);
		  List.add(30);
		  List.add(null);
		  List.add("hi");
		  List.add(10);
		  List.add('A');
		  List.add(null);
		  System.out.println(List);
		  
		 ArrayList<Integer> List1 = new ArrayList<Integer>();
		 List1.add(10);
		 List1.add(60);
		 List1.add(30);
		 List1.add(5);
		 List1.add(80);
		 List1.add(40);
		 Collections.sort(List1);
		 System.out.println(List1);
		  
		  
	}

} 

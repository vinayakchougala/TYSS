package ArrayProgrammes;

import java.util.ArrayList;
import java.util.LinkedList;


public class LinkedListclass 
{
	
	public static void main(String[] args) 
	{		
		LinkedList<Object> List = new LinkedList<Object>();
		List.add(10);
		List.add(20);
		List.add(null);
		List.add(20);
		List.add("hi");
		System.out.println(List);
		
		System.out.println(List.getFirst());
		System.out.println(List.getLast());
		List.addLast('A');
		List.removeFirst();
		List.removeLast();
		System.out.println(List);
		
	}
}

  
	


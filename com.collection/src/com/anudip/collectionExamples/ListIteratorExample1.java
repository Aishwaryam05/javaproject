package com.anudip.collectionExamples;

import java.util.ArrayList;
 import java.util.ListIterator;

public class ListIteratorExample1 {

	public static void main(String[] args) 
	{
		ArrayList<String> names = new ArrayList<>();
		names.add("learn");
		names.add("from");
		names.add("GeeksForGeeks");
		
		ListIterator<String> l = names.listIterator();
		System.out.println("In forward direction iteration is :");
		while(l.hasNext())
		{
			System.out.println(l.next());
		}
		System.out.println("In Backwarddirection iterator :");
		while(l.hasPrevious())
		{
			System.out.println(l.previous());
		}
		
		

	}

}

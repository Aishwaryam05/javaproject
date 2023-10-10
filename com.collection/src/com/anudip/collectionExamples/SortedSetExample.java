package com.anudip.collectionExamples;

import java.util.TreeSet;

public class SortedSetExample {

	public static void main(String[] args) 
	{
		TreeSet s = new TreeSet();
		s.add(40);
		s.add(12);
		s.add(7);
		s.add(80);
		System.out.println(s);
		System.out.println(s.first());
		System.out.println(s.last());
		System.out.println(s.subSet(12, 80));
		System.out.println(s.headSet(40));
		System.out.println(s.tailSet(12));
		

	}

}
//objectFirst()
//objectLast()
//
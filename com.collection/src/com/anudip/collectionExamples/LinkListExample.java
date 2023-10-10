package com.anudip.collectionExamples;

import java.util.LinkedList;

public class LinkListExample {

	public static void main(String[] args) 
	{
		LinkedList l = new LinkedList();
		l.add("A");
		l.add("B");
		l.add("C");
		l.add(12);
		l.add(21);
		l.add(21);
		System.out.println(l);
		l.set(1, "D");
		System.out.println(l);
		l.addFirst(27);
		l.addLast(40);
		System.out.println(l);
		System.out.println(l.getFirst());
		System.out.println(l.getLast());
		l.removeFirst();
		l.removeLast();
		System.out.println(l);
		System.out.println(l.get(2 ));




		
				



	}

}

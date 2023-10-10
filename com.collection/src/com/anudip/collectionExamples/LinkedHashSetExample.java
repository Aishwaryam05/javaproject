package com.anudip.collectionExamples;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetExample {

	public static void main(String[] args)
	{
		LinkedHashSet hs = new LinkedHashSet();
		hs.add(12);
		hs.add(30);
		hs.add("A");
		hs.add(64);
		hs.add(64);
		System.out.println(hs);
		
		HashSet h = new HashSet();
		h.add(12);
		h.add(30);
		h.add("A");
		h.add(64);
		h.add(64);
		System.out.println(h);
		
		

	}

}

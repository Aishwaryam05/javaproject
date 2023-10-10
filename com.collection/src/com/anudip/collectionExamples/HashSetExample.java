package com.anudip.collectionExamples;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetExample {

	public static void main(String[] args)
	{
		HashSet hs = new HashSet();
		hs.add(62);
		hs.add("B");
		hs.add("c");
		hs.add(12);
		hs.add(24);
		hs.add(null);
		hs.add(null);
		System.out.println(hs);
		
		
		ArrayList ar = new ArrayList();
		ar.add(62);
		ar.add("B");
		ar.add("c");
		ar.add(12);
		ar.add(24);
		ar.add(null);
		ar.add(null);
		System.out.println(ar);
		
	}

}

package com.anudip.collectionExamples;

import java.util.HashSet;

public class HashSetExample2 
{
	public static void main(String args[])
	{
		HashSet h1 = new HashSet();
		h1.add("Akshay");
		h1.add("Sahil");
		h1.add("Nisha");
		h1.add("Prajkta");
		h1.add("Sujal");
		h1.add(null);
		System.out.println(h1);
		h1.remove("Nisha");
		System.out.println(h1);
		System.out.println(h1.remove(null));
		
		
	
	}
	
	
//  3rd remove
//  replace
}

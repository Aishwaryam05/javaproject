package com.anudip.collectionExamples;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorExample {

	public static void main(String[] args) 
	{
		ArrayList l = new ArrayList();
		l.add("Neha");
		l.add("Sakshi");
		l.add("Sumit");
		l.add("Raj");
		l.add("Vikas");
		System.out.println(l);
		ListIterator itr = l.listIterator(); //creating list iterator
        while(itr.hasNext())
        	
        {
        	String s = (String)itr.next();
        	if(s.equals("Neha"))
        	{
        		itr.remove();
        	}
        	else if(s.equals("Sumit"))
        	{
        		itr.add("Amit");
        	}
        	else if(s.equals("Raj"))
        	{
        		itr.set("Kumar");
        	}
        }
    	System.out.println(l);

    	
	}

}

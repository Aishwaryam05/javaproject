package com.anudip.collectionExamples;

import java.util.Enumeration;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) 
	{
	//	Vector v = new Vector();
//		v.add(1);
//		v.add("A");
//		v.add("C");
//		System.out.println(v);
//		v.remove(1);
//		v.get(0);
//		v.elementAt(0);
//		v.firstElement();
//		v.lastElement();
//		v.size(); //total data it has
//		v.capacity(); //holding capacity
		
		Vector v = new Vector();
		v.add(12);
		v.add(13);
		v.add(14);
		v.add(15);
		System.out.println(v);
		//enumeration to fetch each object individually
		Enumeration e=v.elements();
		while(e.hasMoreElements())
		{
			Integer i =(Integer)e.nextElement();
			if(i%2==0)
			{
				System.out.println(i);
			}
			
		}


	}

}

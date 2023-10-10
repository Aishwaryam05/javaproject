package com.anudip.collectionExamples;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {

	public static void main(String[] args) 
	{
		ArrayList l = new ArrayList();
		l.add(10);
		l.add(11);
		l.add(12);
		l.add(13);
		l.add(14);
		System.out.println(l);
		
		Iterator itr = l.iterator();
		while(itr.hasNext()) //checking if the list still has more data in it
		{
			Integer i =(Integer)itr.next();//geting the next data from the list
			if(i%2==0)
			{
				System.out.println(i); //print the even numbers
			}
			else
			{
				itr.remove(); //removing the odd numbers
			}
		}
		System.out.println("The remaining data");
		System.out.println(l);

	}

}

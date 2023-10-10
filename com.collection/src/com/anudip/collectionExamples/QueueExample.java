package com.anudip.collectionExamples;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args)
	{
		Queue q = new LinkedList();
		q.add("Ajay");
		q.add("Vijay");
		q.add("Reshma");
		System.out.println(q);
		System.out.println(q.remove());
		q.add("Laxaman");
		System.out.println(q);
		System.out.println(q.peek());
		System.out.println(q);
		q.offer("Hemma");
		System.out.println(q);
		

	}

}

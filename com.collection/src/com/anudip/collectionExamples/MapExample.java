package com.anudip.collectionExamples;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample {

	public static void main(String[] args)
	{
		Map map = new HashMap();
		map.put(101, "Arun");
		map.put(102, "Rekha");
		map.put(103, "Rohan");
		System.out.println(map);
		map.put(112, "Rekha");
		System.out.println(map);
		
		Set set = map.entrySet();
		Iterator itr = set.iterator();
		while(itr.hasNext())
		{
			Map.Entry m =(Map.Entry)itr.next();
			System.out.println("key"+m.getKey()+"  value" +m.getValue());
		}
		
		
		

	}

}

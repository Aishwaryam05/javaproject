package com.anudip.StringExample;

public class StringBufferExample {

	public static void main(String[] args)
	{
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		sb.append("Ajay");
		//System.out.println(sb.reverse());
		
		System.out.println(sb.charAt(3));
		System.out.println(sb.getClass());
		System.out.println(sb.indexOf("2"));
				
		

	}

}

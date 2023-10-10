package com.anudip.StringExample;

public class StringComapareexample {

	public static void main(String[] args)
	{
		
		String s1="Amit";
		String s2="Amit";
		String s3="amit";
		System.out.println(s1.equals(s2));//false
		System.out.println(s1.equals(s3));//false as case are differnt
		System.out.println(s1.equalsIgnoreCase(s3)); //true

	
	}

}

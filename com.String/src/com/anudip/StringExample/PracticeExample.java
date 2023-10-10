package com.anudip.StringExample;

public class PracticeExample {

	public static void main(String[] args) 
	{
		String s1 ="Good MOrning"; //string literal  --constant pool
		String str1= new String("Amit"); //by using new keyword --non pool/heap memory
		str1=str1.concat("Tandon");
		System.out.println(s1);
		System.out.println(str1);
		
	}

}

package com.anudip.StringExample;

public class StringBuilderExample {

	public static void main(String[] args) 
	{
		StringBuilder stb = new StringBuilder("Aishwarya");
		stb.append(" More"); //using append method
		System.out.println(stb);
		stb.replace(2, 4, "cat"); //replace method
		System.out.println(stb);
		StringBuilder s1 = stb.reverse(); //reversing the string
		System.out.println(s1);
		
		StringBuilder stb2 = new StringBuilder(); //constuctor with no argument-->16
		System.out.println(stb2.capacity());
		stb2.append("123456781234567812345678123456781234567812345678123456789");
		System.out.println(stb2.capacity()); //(16*2)+2
		System.out.println(stb2);
		
		StringBuilder stb3 = new StringBuilder(25);
		System.out.println(stb3.capacity());
		stb3.append("1234567891234567891234567891234");
		System.out.println(stb3.capacity()); //(old capacity * 2)+2
		
		StringBuilder stb4 = new StringBuilder("12345678   nbui.+  ");
		System.out.println(stb4.capacity());
		System.out.println(stb4.length());



		
		

	}

}

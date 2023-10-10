 package com.anudip.StringExample;

public class StringConcateExample {

	public static void main(String[] args)
	{
		//+ and .cocat()
		//String s ="Amit" + "Tandon";
		//System.out.println("Hello how are you"+s);
		
		String s1="Amit";
		String s2="Tandon";
		System.out.println(s1.concat(s2));

	//System.out.println("Hello how are you"+20+s+10);
		
		String str= 50+20+"Amit"+40+10;
		System.out.println(str);
		
		System.out.println(50+30+"Amit"+40+10);//addition
		
		System.out.println("Amit"+50+30); //concatination

	}

}

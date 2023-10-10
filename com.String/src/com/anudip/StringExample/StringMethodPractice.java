package com.anudip.StringExample;

public class StringMethodPractice {

	public static void main(String[] args)
	{/*
		//charAt(int)-->fires stringIndexOutOfBound exception
		String str1="vanisha";
		char ch=str1.charAt(2);
		System.out.println(ch); //n
	*/	

	/*
		//contains(String)
		String str2="Hello how are you?";
		System.out.println(str2.contains("howwwwwwwww")); //false
		System.out.println(str2.contains("how")); //true
   */
   
   /*	
      //endswith(char)   
      String str3="It is Wednesday";
      System.out.println(str3.endsWith("day"));
  */
	 
 /*    indexOf(ch)
	  //String str4="Hello";
	    String str4="Good Morning";
	 //System.out.println(str4.indexOf("e"));
	  System.out.println(str4.indexOf("o",5));
	  System.out.println(str4.lastIndexOf("n",7));   //-1 print

   */
		//touppercase tolowercase
		String s = "     Shruti";
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.trim());
		System.out.println(s.length());
		System.out.println(s.trim().length());
		
		//replace
		System.out.println(s.replace(" "," *"));
		

	  	
	}

}

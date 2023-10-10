package com.staticKeyword;

public class StaticBlockExample4
{
  public static void main(String args[])
  {
	  System.out.println("I am the main method");;
  }
  
  static {System.out.println("i am a static block");
    } //static block
}


//static block is use to initialixe the static variable
//it always executed before the main method
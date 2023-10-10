
package com.anudip.inheritance;
class Animall2
{
	final int i =20;
	 final void eat()
	{
		System.out.println("animal is eating"+i);
	}
}
class  Catt2 extends Animall2
{
	
  // void eat() //overriding
	{
		System.out.println("catt is eating"+i);
	}
}


public class FinalKeywordExamp {
	public static void main(String args[])
	{
		Catt2 a = new Catt2();
		//a.i=20;
		System.out.println("value of a : "+a.i);
	}

}

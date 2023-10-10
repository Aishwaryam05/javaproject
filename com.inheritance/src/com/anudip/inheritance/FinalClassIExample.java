package com.anudip.inheritance;
final class Animall3
{
	final int i =20;
	 final void eat()
	{
		System.out.println("animal is eating"+i);
	}
}
//class  Catt2 extends Animall2
//{
	
  // void eat() //overriding
	//{
	//	System.out.println("catt is eating"+i);
	//}
//}


public class FinalClassIExample {
	public static void main(String args[])
	{
		Animall3 a = new Animall3();
		//a.i=20;
		System.out.println("value of a : "+a.i);
	}
}

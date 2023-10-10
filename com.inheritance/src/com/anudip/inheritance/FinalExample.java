//final keyword:the value of final keyword can not be chnge though out the program
//variable method,class ke age use krte hai
//fixed values can not chnge during execution
//2.method--.we can not inherited  ..can we extend
//3.class .. the class can not inherited or extend

package com.anudip.inheritance;
class Animall
{
	final int i =20;
	 void eat()
	{
		System.out.println("animal is eating"+i);
	}
}

public class FinalExample {
	public static void main(String args[])
	{
		Animall a = new Animall();
		//a.i=20;
		System.out.println("value of a : "+a.i);
	}

}



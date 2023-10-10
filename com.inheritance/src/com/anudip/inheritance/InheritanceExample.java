//program for overriding

package com.anudip.inheritance;
class Animal
{
	void eat()
	{
		System.out.println("The animal is eating");
	}
	void sleep()
	{
		System.out.println("The animal is sleeping");
	}
}
class Cat extends Animal
{
	void eat()
	{
		System.out.println("The cat is drinking milk");
	}
	void crying()
	{
		System.out.println("The cat is meowing");
	}
}
public class InheritanceExample
{
	public static void main(String args[])
	{
		Animal a=new Animal();
		a.eat();
		Cat c = new Cat();
		c.eat();
		c.crying();
		c.sleep();
	}

}

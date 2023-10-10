package com.staticKeyword;


class Calculation
{
	static int i=10;	//static variable
	static void square( ) //static method
	{
       int area = i * i;
       System.out.println("The square is:"+area);
	}	
}

public class NewStaticKey {
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		/* Calculation c = new Calculation();
		c.square();*/
		
		Calculation.square();   //classname.method name too print
	}

}

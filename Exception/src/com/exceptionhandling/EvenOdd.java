package com.exceptionhandling;

import java.util.Scanner;

class Number     //class
{
   void check() //method 
   {
	 Scanner sc = new Scanner(System.in); //scanner class
	 System.out.println("Enter the number : "); //get user input
	 int n = sc.nextInt();
	 if(n%2==1) //check the number is even 
	  {
		//throws arithmetic exception
		throw new ArithmeticException("The number is odd"); //it print if number isodd
	  } 
	 else
 	  {
		System.out.println("The number is even"); //print the even number
	  }
	 sc.close();
	 
  }

}

public class EvenOdd //main class
{

	public static void main(String[] args)  //main method
	{
		Number n = new Number(); //creting object
		n.check(); //calling method
		
	}

}

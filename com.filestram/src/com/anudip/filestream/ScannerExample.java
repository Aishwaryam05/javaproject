package com.anudip.filestream;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your roll no :");
		int rno=sc.nextInt();
		System.out.println("Enter your name :");
		String n1 = sc.next();
		System.out.println("Enter marks:");
		float m = sc.nextFloat();
	//	System.out.println("Enter your address");
	//	String add = sc.nextLine();
		System.out.println("Hello "+n1+"your roll number is"+rno+"and the marks is"+m);
	//	System.out.println("your address is "+add);
		sc.close();
		
		
		

	}

}

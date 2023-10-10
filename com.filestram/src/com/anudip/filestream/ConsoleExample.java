package com.anudip.filestream;

import java.io.Console;

public class ConsoleExample {

	public static void main(String[] args)
	{
		Console c = System.console();
		String uname=c.readLine("Enter UserName");
		char pwd[]=c.readPassword("Enter Password :");
		String upwd=new String(pwd);
		
		if(uname.equals("Yash")&&upwd.equals("1234"))
		{
			System.out.println("Login succesfully");
		}
		else
		{
			System.out.println("wrong username or password");
		}

	}

}

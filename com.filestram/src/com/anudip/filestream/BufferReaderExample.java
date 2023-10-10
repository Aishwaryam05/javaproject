package com.anudip.filestream;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BufferReaderExample {

	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please enter your name");;
        String n1=br.readLine();//it print the whole line 
        //read() readLine()
        System.out.println("please enter your name again:");
        int n2=br.read(); //single character read that is in integer type
        System.out.println("The data you entered first is : "+n1);
        System.out.println("The data you entered second is : "+(char)n2);
	}

}

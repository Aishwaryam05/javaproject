package com.anudip.filestream;

import java.io.FileOutputStream;

public class FileOutputStreamExample {

	public static void main(String[] args)
	{
		try
		{
		  //creating a file output stream object to send
		  //the data to file from java application
		  FileOutputStream fout = new FileOutputStream("f:\\Testout.txt");
		  String s = "I am Fine Thank you";
		  byte b[]=s.getBytes(); //converting the string to byte array
		  fout.write(b); //writing the byte to the stream
		  fout.close();  //closing the stream
		  System.out.println("File Writing is done");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
		

}

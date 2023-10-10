package com.anudip.filestream;

import java.io.FileInputStream;

public class FileInputStreamExample 
{
    //reading the data from the file and printing it in the console
	public static void main(String[] args)
	{
	 try
	 {
		FileInputStream fis = new FileInputStream("f:\\tstout.txt");
		int i=0;
		
		while((i=fis.read())!=-1)//reading the data and storing it in i till end 
		{
			System.out.print((char)i);
			//System.out.println((char)i);

		}
		fis.close();
	 }
	 catch (Exception e) //closing the stream object
	 {
		 //e.printStackTrace();
		 System.out.println(e);
	 }
  }

}

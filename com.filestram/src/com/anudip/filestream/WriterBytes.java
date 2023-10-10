package com.anudip.filestream;

import java.io.FileOutputStream;
import java.io.IOException;

public class WriterBytes {

	public static void main(String[] args) 
	{
		byte cities []= {'D','e','l','h','i','\n','p','u','n','e'}; //byte array
		FileOutputStream FOS = null; //object of file output stream to write data to file
		try
		{
			FOS = new FileOutputStream("f:\\City.txt");
			FOS.write(cities); //writing data to the stream
			FOS.close();
		}
		catch(IOException e)
		{
			System.out.println(e);
		}

	}

}

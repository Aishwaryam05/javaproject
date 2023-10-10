package com.anudip.filestream;

import java.io.*;

public class CopyFileExamle {

	public static void main(String[] args) throws IOException
	{
		File IF = new File("f:\\City.txt");
		File OF = new File("f:\\City.txt");
		FileReader FR = null;
		FileWriter FW = null;
		try
		{
			FR = new FileReader(IF);
			FW = new FileWriter(OF,true);
			int ch;
			
			while((ch = FR.read()) != -1)
			{
				FW.write(ch);
				
			}
		}
			catch(IOException e)
			{
				System.out.println(e);
			}
			finally
			{
				FR.close();
				FW.close();
			}
		}

		

	}



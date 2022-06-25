package com.sgtesting.tests;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class CreateHTMLFileDemo {
	public static void main(String[] args) {
		createFile();

	}
	
	private static void createFile()
	{
		BufferedWriter bw=null;
		try
		{
			bw=new BufferedWriter(new FileWriter("F:\\EXAMPLE\\Test.html"));
			bw.write("<html>");
			bw.write("<head><title>Test Web Page</title></head>");
			bw.write("<body>");
			bw.write("<h1 align=center>Sample Web Page</h1>");
			bw.write("<p>Java is a Programming language,It is used for development</p>");
			bw.write("<p>C# is a Programming language,It is used for development</p>");
			bw.write("<p></p>");
			bw.write("</body>");
			bw.write("</html>");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				bw.flush();
				bw.close();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}

}

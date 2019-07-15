package filee;

import java.io.*;

public class FileReaderEx 
{
	public static void main(String[] args)throws IOException
	{
		File f=new File("capge.txt");
		FileReader fr=new FileReader(f);
		char[] ch=new char[(int) f.length()];
		fr.read(ch);
		for(char ch1:ch)
		{
			System.out.println(ch1);
		}
		fr.close();
		System.out.println("*******");
		
		FileReader fr1=new FileReader("fileadd.txt");
		int i=fr1.read();
		while(i != -1)
		{
			System.out.println((char)i);
			i=fr1.read();
		}
		fr1.close();
		
		System.out.println("$$$$$");
		
		FileReader fr2=new FileReader("printadd.txt");
		int i1=fr2.read();
		for(;i1!=-1;)
		{
			System.out.println((char)i1);
			i1=fr2.read();
		}
		fr2.close();
		
	}

}

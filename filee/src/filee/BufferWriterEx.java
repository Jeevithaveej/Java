package filee;


import java.io.*;

public class BufferWriterEx
{
	public static void main(String[] args)throws IOException
	{
		
		FileWriter f=new FileWriter("Bufferadd.txt");
		BufferedWriter b=new BufferedWriter(f);
		b.write("jeevi");
		b.newLine();
		b.write(100);
		b.newLine();
		b.write("Ravichandran");
		b.newLine();
		char [] ch1= {'a','b'};
		b.write(ch1);
		b.close();
		f.close();
		
	}

}

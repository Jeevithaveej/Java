package filee;


import java.io.*;

public class Fllewrite
{
	public static void main(String[] args)throws IOException
	{
		
		FileWriter f=new FileWriter("bufferedadd.txt");
		f.write("jeevitha");
		f.write("\n");
		f.write("Ravichandran");
		char [] ch1= {'a','b'};
		f.write(ch1);
		f.close();
		
	}


	
}

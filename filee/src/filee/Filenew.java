package filee;

import java.io.File;
import java.io.IOException;

public class Filenew 
{
	public static void main(String[] args) throws IOException 
	{
	File f=new File("capge.txt");
	f.createNewFile();
	System.out.println("new file created");
			
	
	
	}

}

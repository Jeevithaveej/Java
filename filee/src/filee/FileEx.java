package filee;

import java.io.File;


public class FileEx 
{
	public static void main(String[] args) 
	{
		
	
	File f=new File("capge.txt");
		System.out.println(f.exists());
	System.out.println(f.mkdir());
	System.out.println(f.exists());
	System.out.println(f.isDirectory());
	System.out.println(f.isFile());
	}
	
}

package filee;

import java.util.Scanner;

public class Exceptionn 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("number 1=");
		int firstnum=sc.nextInt();
		
		System.out.println("number 2=");
		int Secnum=sc.nextInt();
		try
		{
		int division=firstnum/Secnum;
		System.out.println("DIVIDED VALUE IS  :"+division);
		}
		catch(Exception e)
		{
			System.out.println("dont use 0 as dinominator");
		}
		System.out.println("DIVISION");
		
		
	
		
	}

}

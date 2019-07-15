package taskEmployee;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationEx 
{
		public static void main(String[] args)
		{
			
		Vector days=new Vector();
		days.add("je");
		days.add("bb");
		days.add("cc");
		days.add("nn");
		days.add("mm");
		System.out.println(days);
		
		Enumeration e= days.elements();
		while(e.hasMoreElements());
		{
			System.out.println(e.nextElement());
		}
		}

}

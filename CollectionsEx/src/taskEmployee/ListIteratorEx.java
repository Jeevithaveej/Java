package taskEmployee;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Vector;

public class ListIteratorEx
{
	public static void main(String[] args)
	{
		ArrayList<String> ar = new ArrayList <String>()	;
		ar.add("ab");
		
		System.out.println(ar);
		
		ListIterator litr = ar.listIterator();
		
		while(litr.hasNext())
		{
			System.out.println(litr.next()+ " ");
		}
		while(litr.hasPrevious())
			{
			String val=(String) litr.previous();
			if(val.equals("ab"))
			{
				litr.set("capgemini");
				System.out.println(litr.next());
				litr.previous();
			}else
			{
				System.out.println(val);
			}
					
				}
				
	
	
	}
}

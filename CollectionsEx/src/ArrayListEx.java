import java.util.ArrayList;


public class ArrayListEx
{
	public static void main(String[] args)
	{
		
		ArrayList a1=new ArrayList();
		a1.add("jeevitha");
		a1.add('e');
		a1.add(123);
		a1.add(true);
		//System.out.println(a1);
		
		ArrayList a2=new ArrayList();
		a2.add("Ravi");
		a2.add('a');
		a2.add(236);
		a2.addAll(a1);
		//ystem.out.println(a2);
		
		ArrayList a3=new ArrayList();
		a3.add("Jeev");
		a3.add('b');
		a3.add(26);
		a3.add(false);
		a3.addAll(a2);//add all the data of a2
		a3.removeAll(a1);//remove all the data of a1
		a3.addAll(2, a2);
		System.out.println(a3);
		
		
	}

}

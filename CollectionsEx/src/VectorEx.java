import java.util.Vector;

public class VectorEx 
{
	public static void main(String[] args)
	{
		
	Vector<Integer> v1=new Vector<Integer>();
	v1.add(10);
	v1.add(1);
	v1.add(123);
	v1.add(50);
	v1.add(15);
	//System.out.println(v1.size());//count the element 
	
	Vector<Integer> v2=new Vector<Integer>();
	v2.add(10);
	v2.add(1);
	v2.add(123);
	v2.add(50);
	v2.add(10);
	v2.addElement(15);
	System.out.println(v2.addAll(v1));
	
	//System.out.println(v2.containsAll(v1));//check whether all the element is contain in that particular obj
	//System.out.println(v2.removeAllElements());//remove elements in the obj where declared
	//System.out.println(v2.elementAt(4));//find the element by array index value
	//System.out.println(v2.contains(15));//check whether the element is contain in that particular obj
	}

	
}

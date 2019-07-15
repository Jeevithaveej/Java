import java.util.LinkedList;

public class LinkedListEx 
{
	public static void main(String[] args)
	{
		
		LinkedList l1=new LinkedList();
		l1.add("jeevitha");
		l1.add('e');
		l1.add(123);
		l1.add(true);
		l1.add('e');
		//l1.removeFirst();//remove first element jeevitha
		//System.out.println(l1);
		
		LinkedList l2=new LinkedList();
		l2.add("Ravi");
		l2.add('r');
		l2.add(321);
		l2.add(false);
		l2.add('a');
		l2.addAll(l1);
		l2.removeLast();//remove last element according to obj added
		//l2.removeAll(l2);//remove all elements in l2
		System.out.println(l2);
	}
		
}

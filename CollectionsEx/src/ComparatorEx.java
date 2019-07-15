import java.util.Comparator;
import java.util.TreeSet;




public class ComparatorEx
{
	public static void main(String[] args) 
	{
		TreeSet t=new TreeSet (new A());
		t.add("ad");
		t.add("bvg");
		t.add("bcg");
		t.add("gdh");
		System.out.println(t);
		
	}
}

	class A implements Comparator
	{
		public int compare(Object o1,Object o2)
		{
			String s1=(String)o1;
			String s2=(String)o2;
			
			return s1.compareTo(s2);
		}
	}
	


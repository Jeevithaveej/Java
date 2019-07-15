import java.util.Comparator;
import java.util.NavigableMap;
import java.util.TreeSet;

class Employee implements Comparable
{
	String name;
	int eid;
	Employee(String name,int eid)
	{
		this.name=name;
		this.eid=eid;
	}
	public String toString()
	{
		return name+"--"+eid;
	}
	public int compareTo(Object obj1)
	{
		int eid1=this.eid;
		Employee e=(Employee)obj1;
		int eid2=e.eid;
		if(eid1<eid2)
		{
			return -1;
		}
		if(eid1>eid2)
		{
			return 1;
		}else
		return 0;
				
	}

}
public class ComparatorEmployee 
{
	public static void main(String[] args) 
	{
		Employee e1=new Employee("ramesh",10);
		Employee e2=new Employee("suresh",5);
		Employee e3=new Employee("pranesh",30);
		
		TreeSet t=new TreeSet();
		t.add(e1);
		t.add(e2);
		t.add(e3);
		
		System.out.println(t);
		
		TreeSet t1=new TreeSet(new Comp ());
		t1.add(e1);
		t1.add(e2);
		t1.add(e3);
		System.out.println(t1);
	}

}

class Comp implements Comparator
{
	public int compare(Object obj1,Object obj2)
	{
		Employee e1 =(Employee)obj1;
		Employee e2 =(Employee)obj2;
		String s1=e1.name;
		String s2=e2.name;
		return s1.compareTo(s2);
		
	}
}

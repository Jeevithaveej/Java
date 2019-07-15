import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapEx
{
	public static void main(String[] args) 
	{
		TreeMap tm=new TreeMap();//sorting usin TreeMap
		
		tm.put("jeev",100);
		tm.put("Ravi",300);
		tm.put("Arul",60);
		tm.put("Dhiwin",600);
		//System.out.println(tm.firstKey());//dislay first lowest key

		
		TreeMap tm1=new TreeMap();//sorting usin TreeMap
		
		tm1.put("jj",1);
		tm1.put("aa",700);
		tm1.put("bb",60);
		tm1.put("cc",6);
		
		Set s= tm1.entrySet();
		Iterator itrs=s.iterator();
		while(itrs.hasNext());
		{
			Entry e=(Entry) itrs.next();
			System.out.println(e.getKey()+" "+e.getValue());
		}
		
		
		Set s1= tm1.keySet();
		Iterator itr=s1.iterator();
		while(itr.hasNext());
		{
			
			System.out.println(itr.next());
		}
		//tm1.size();
		//tm1.keySet(); //sort by key
		//System.out.println(tm1);
		//tm1.putAll(tm);//add all objects mentioned
		//tm1.containsValue(tm1);//values
		//tm1.remove("jj", 10);//remove particular value & key
		//System.out.println(tm1.lastKey());

}
}

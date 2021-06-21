package pack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class Collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		ArrayList v = new ArrayList();
//		v.add("velocity");
//		v.add(123);
//		v.add('@');
//		v.add(67.77);
//		
//		int size=v.size();
//		
//		for(int i=0; i<size;i++)
//		{
//			System.out.println(v.get(i));
//		}
//		ArrayList<String> c = new ArrayList<String> ();
//		c.add("velocity");
//		c.add(123);
//		c.add('@');
//		c.add(67.77);
		
		
//		HashSet<String> hasset =new HashSet<String>();
//		hasset.add("smita");
//		hasset.add("bodhare");
//		hasset.add("p");
//		hasset.add("x");
//		hasset.add("sanjana");
//		
//		Iterator<String> i=hasset.iterator();
//		
//		for(String s:hasset) {
//			System.out.println(i.next());
//		}
//		System.out.println("______________________");
//		
//		while (i.hasNext())
//		{
//			System.out.println(i.next());
//		}
		
//		HashMap<Integer,String> hasMap=new HashMap<Integer,String>();
//		hasMap.put(20, null);
//		hasMap.put(null, "Smita");
//		hasMap.put(40, "Feb");
//		hasMap.put(25, null);
//		hasMap.put(20, "Batch");
//		
//		for(Map.Entry<Integer, String> e :hasMap.entrySet())
//		{
//			System.out.println(e.getKey()+" "+e.getValue());
//		}

		
		Hashtable<Integer,String> hasTable=new Hashtable<Integer,String>();
		hasTable.put(20, "userid");
		hasTable.put(45, "Smita");
		hasTable.put(40, "Feb");
		hasTable.put(25, "dfect");
		hasTable.put(31, "Batch");
		
		for(Map.Entry<Integer, String> e :hasTable.entrySet())
		{
			System.out.println(e.getKey()+" "+e.getValue());
		}
	}

}

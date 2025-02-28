package SimpleJavaproblems;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		
		//key should be unique
		//Values can be duplicated
		
		//HashMap m = new HashMap();  //Hetreogeneous data  , here not specifying types, so by default all values will assues as Object
		
		HashMap<Integer,String> m = new HashMap<Integer,String>();  //Homogeneous data
		
		m.put(101, "Kani");
		m.put(102, "Loga");
		m.put(103, "Nivi");
		m.put(104, "Kayal");
		m.put(105, "Sumi");
		m.put(103, "Nivetha");  //It will replace Nivi
		m.put(106, "Loga");
		
		
		System.out.println(m);
		
		System.out.println(m.get(104));
		
		m.remove(106);
		
		System.out.println(m);
		
		System.out.println(m.containsKey(104));  //return true,false
		System.out.println(m.containsKey(106));
		
		System.out.println(m.containsValue("Kani"));  //True
		System.out.println(m.containsValue("kani"));  //False
		
		System.out.println(m.isEmpty());  //False
		
		System.out.println(m.keySet());  //return all the keys as set(set object doesn't contain duplicates)
		System.out.println(m.values());  //return all the values as a Collection
		
		System.out.println(m.entrySet());  //return all entries as set
		
		//retrieve all key as individual object
		
		for(Object obj :m.keySet()) {
			System.out.println(obj);
		}
		
		//retrieve all values as individual object
		
		for(Object obj :m.values()) {
			System.out.println(obj);
		}
		
		//retrieve all key+value as individual object
		
		for(Object obj :m.keySet()) {
			System.out.println( obj +"   " + m.get(obj));
		}
		
		//Entry specific methods
		
		System.out.println("Using Entry");
		
		for(Map.Entry entry :m.entrySet()) {  //This method allow us to have specific data types
			System.out.println(entry.getKey()+"    "+entry.getValue());
		}
		
		//Iterator method		
		System.out.println("Iterator Method");
		
		Set s = m.entrySet();
		
		Iterator it = s.iterator();
		
		while(it.hasNext()) {
			Map.Entry entry = (Entry) it.next();
			
			System.out.println(entry.getKey() + "    " + entry.getValue());
		}

	}

}

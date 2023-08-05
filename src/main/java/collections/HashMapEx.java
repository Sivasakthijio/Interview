package collections;

import java.util.HashMap;
import java.util.TreeMap;

public class HashMapEx {

	public static void main(String[] args) {
		//doesn't support Duplicate key,Insertion order, duplicate null key
		//duplicate key values replace the last key values
		//support null key,
		
		//HashMap h=new HashMap();
		TreeMap h=new TreeMap();
		System.out.println(h.isEmpty());
		
		
		
		h.put(1, "sivasakthi");
		h.put(2, "Pavithra");
		h.put(3, "pechiyammal");
		h.put(4, "sivasakthi");
		h.put(1, "siva");
		//h.put(null, "sangu");  //Duplicate null key is not support will replace with last key values
		//h.put(null, "suresh");
		//h.put(6, null);//Duplicate null values support
		//h.put(7, null);
		
		
		System.out.println(h);
		System.out.println(h.containsKey(2));
		System.out.println(h.containsValue("siva"));
		
		System.out.println("h.firstEntry(): "+h.firstEntry());
		
		System.out.println("h.firstKey(): "+h.firstKey());
		
		System.out.println("h.lastKey(): "+h.lastKey());
		
		System.out.println("h.lastEntry(): "+h.lastEntry());
		
		System.out.println("h.size(): "+h.size());
		
		System.out.println("h.descendingKeySet()"+h.descendingKeySet());
		
		System.out.println("h.remove(1): "+h.remove(1));
		
		System.out.println(h);
		
		
		
		
		//Will pass the index to remove the element
		//h.remove(2);
		//System.out.println(h);
		
		

	}

}

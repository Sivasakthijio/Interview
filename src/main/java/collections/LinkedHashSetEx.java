package collections;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetEx {

	public static void main(String[] args) {
		
		//Doesn,t support Duplicate values, Duplicate Null Values
		//Support Insertion Order, null values
		
		LinkedHashSet L=new LinkedHashSet();
		L.add("siva");
		L.add("siva");
		L.add("pavi");
		L.add("phone");
		L.add(7);
		L.add(null);
		L.add(null);
		L.add(3);
		
		System.out.println("Linkedhashset element added: "+L);
		System.out.println(L.contains("siva"));
		System.out.println(L.equals(L));
		System.out.println(L.size());
		System.out.println(L.remove("siva"));
		
		Iterator it = L.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}	

	}

}

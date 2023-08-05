package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class HashsetEx {

	public static void main(String[] args) {
		// Doesn,t support Insertion Order,Duplicate values, Duplicate Null Values
		// Support null values

		HashSet h = new HashSet();
		h.add("siva");
		h.add('a');
		h.add('a');
		h.add(6);
		h.add(4);
		h.add(3);
		h.add(5);
		h.add(3);

		System.out.println("Hashset: " + h); // Hashset: [null, a, 3, siva, 4, 5, 6]
		System.out.println("Contains(): " + h.contains("siva"));
		//System.out.println("HashSet size(): " + h.size());
		// h.clear();

		//System.out.println("Hashset Clear(): " + h);// []
		System.out.println("HashSet size(): " + h.size());
		System.out.println("Hashset: " + h); 
		System.out.println(h.remove("siva"));
		System.out.println(h);
		
	

	}

}
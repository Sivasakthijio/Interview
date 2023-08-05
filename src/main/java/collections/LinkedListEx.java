package collections;

import java.util.LinkedList;

public class LinkedListEx {

	public static void main(String[] args) {
		//Supports insertion order,null values,duplicate values, dup null values
		LinkedList l=new LinkedList();
		l.add("spave");
		l.add(null);
		l.add("siva");
		l.add("siva");
		l.add(null);
		l.add('x');
		l.add(2.0);
		l.add(2);
		
		System.out.println(l);
		//count of an object ans is 6
		System.out.println(l.size());
		
		//Retrieve the data based on index---->siva
		System.out.println(l.get(1));
		
		//getFirst method will return the 1st element
		System.out.println(l.getFirst());
		
		//add object whereever you want
		l.add(1, "pavi");
		System.out.println(l);
		
		//Checking the element is present or not
		System.out.println("Checking Element is present "+l.contains("siva"));
		
		//Remove the element from list
		l.remove(2);
		System.out.println(l);
		System.out.println(l.element());
		System.out.println(l.lastIndexOf('2'));
		System.out.println(l.offer(l));
		System.out.println(l.offerFirst("pavi"));
		
		
		
		
		
		
	}

}

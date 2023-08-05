package collections;

import java.util.PriorityQueue;

public class PriorityQueue1 {

	public static void main(String[] args) {
		//Doesn;t support insertion order
		//Priority Queue doesn't support null values it will throw NullPointerException
		//
		PriorityQueue p= new PriorityQueue();
		p.add(1);
		p.add(3);
		p.add(4);
		p.add(2);
		p.add(5);
		
		//p.comparator();
		System.out.println(p);//------------------------------------------------>[1, 2, 4, 3, 5]
		
		//Poll() removes the 1st element from the collection
		System.out.println("Poll method: "+p.poll());//------------------------->1
		System.out.println(p);//------------------------------------------------>[2, 3, 4, 5]
		
		//peek() retrieves the 1st element from the collection
		System.out.println("Peek() method: "+p.peek());//----------------------->2
		System.out.println("After Peek(): "+p);//------------------------------->[2, 3, 4, 5]
		
		//Remove () removes the 1st element as like Poll()
		System.out.println("Remove(): "+p.remove());//-------------------------->2
		System.out.println(p);//------------------------------------------------>[3, 5, 4]
		System.out.println("p.element(): "+p.element());
		
		/*
		 * PriorityQueue k= new PriorityQueue(); k.add(2); k.add(5); k.add(7); k.add(8);
		 * 
		 * //Priority Queue doesn't support null values it will throw
		 * NullPointerException //k.add(null); //k.add(null); k.add(2);
		 * 
		 * 
		 * System.out.println(k);
		 */
	}

}

package collections;

import java.util.ArrayList;

public class ArrayListEx {
//Supports insertion order,duplicate values,null values, duplicate null values
	
	public static void main(String[] args) {
		
		ArrayList a= new ArrayList();
		a.add(1);
		a.add(null);
		a.add("sivasakthi");
		a.add(1);
		a.add(null);
		
		System.out.println("After adding the element to the arraylist----->"+a);
		a.add(0, "siva");
		
		System.out.println("After adding the element to the arraylist 0th Index------>"+a);
		
		//it will return boolean value element present in list
		System.out.println(a.contains("siva"));
		
		//Returns the element of an index
		System.out.println("0th index of arraylist----->"+a.get(0));
		
		//Return the index of an element
		System.out.println(a.indexOf("sivasakthi"));
		
		System.out.println("size of an array: "+a.size());
		
		System.out.println(a);
		
		a.remove(5);
		System.out.println("Remove funtions: "+a);
		a.remove("siva");
		System.out.println("Remove siva element: "+a);
		
		
		
		
	}

}

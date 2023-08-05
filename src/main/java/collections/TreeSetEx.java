package collections;

import java.util.TreeSet;

public class TreeSetEx {

	public static void main(String[] args) {
		//Doesn't support null values, duplicate values, insertion order
		//Acsending order will return values
		
		TreeSet t=new TreeSet();
		t.add(2);
		t.add(1);
		t.add(3);
		t.add(6);
		t.add(3);
		//t.add(null);
		//t.add(null);
		//t.add("siva");
		//t.add('d');
		
		System.out.println(t);
		System.out.println("");
		
		//first,last() retrive the data from 1st and last
		System.out.println("First(): "+t.first());
		System.out.println("Last(): "+t.last());
		System.out.println("");
		
		//pollFirst() will remove 1st element from the array
		System.out.println("POllfist(): "+t.pollFirst());
		System.out.println("After Pollfirst: "+t);
		System.out.println("");
		
		//pollLast() will remove the last element from the array
		System.out.println("PollLast(): "+t.pollLast());
		System.out.println("After PollLast: "+t);
		System.out.println("");
	}

}

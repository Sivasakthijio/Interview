package arrayTopic;

import java.util.Arrays;

public class ArraySorting {

	public static void main(String[] args) {
		
		int a[] = { 60, 40, 70, 50, 10, 30 };
		
		System.out.println("Length of an array "+a.length);
		
		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < a.length; j++) {
				
				if (a[i] < a[j]) {
					
					int temp = a[i]; 
					a[i] = a[j];
					a[j] = temp;
					
					//a[0]----->70,40,60,50,10,30
					//a[1]----->40,70,60,50,10,30
					//a[2]----->40,60,70,50,10,30
					//a[3]50--->40,50,70,60,10,30-->40,50,60,70,10,30
					//a[4]----->10,50,60,70,40,30-->10,40,60,70,50,30-->10,40,50,60,70,30
					//a[5]----->10,30,50,60,70,40-->
				}
			}
		}
		//System.out.println(Arrays.toString(a));
		for (int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		//System.out.println(a[a.length-3]);
	}

}

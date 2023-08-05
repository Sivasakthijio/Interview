package arrayTopic;

import java.util.Scanner;

public class InputFromUser {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array:");
		int count=sc.nextInt();
		
		int[] a=new int[count];
		
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		
		for(int number:a) {
			System.out.println(number);
		}
	}

}

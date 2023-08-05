package chatGPT;

import java.util.Scanner;

public class CountTheWord {

	public static void main(String[] args) {
		
		int count=0;
		System.out.println("Enter the string:");
		Scanner sc=new Scanner(System.in);
		String str = sc.nextLine();
		
		String[] words = str.split(" ");
		
		for(String word:words) {
			count++;
		}
		
		System.out.println("No of words in the string "+count);

	}

}

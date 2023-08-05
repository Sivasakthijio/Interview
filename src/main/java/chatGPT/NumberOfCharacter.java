package chatGPT;

import java.util.Scanner;

public class NumberOfCharacter {

	public static void main(String[] args) {
		
		int count=0;
		System.out.println("Enter the string:");
		Scanner sc=new Scanner(System.in);
		String str = sc.nextLine();
		
		String[] words = str.split(" ");
		
		for(String word:words) {
			
			for(int i=0;i<=word.length()-1;i++) {
				count++;
			}
		}
		System.out.println("No of character in the string"+count);
	}

}

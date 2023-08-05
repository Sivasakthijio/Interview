package chatGPT;

import java.util.Scanner;

public class CountAWordInString {

	public static void main(String[] args) {
		int count=0;
		System.out.println("Enter the string :");
		Scanner sc= new Scanner(System.in);
		String s = sc.nextLine();
		String[] words = s.split(" ");
		for(String w:words) {
			//for(int i=w.length()-1;i>=0;i--) {
				count++;
			//}
		}
	System.out.println(count);	
		
		
	}

}

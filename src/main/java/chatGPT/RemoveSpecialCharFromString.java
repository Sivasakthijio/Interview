package chatGPT;

import java.util.Scanner;

public class RemoveSpecialCharFromString {

	public static void main(String[] args) {
		
		System.out.println("Enter the string: ");
		Scanner sc =new Scanner(System.in);
		String str = sc.nextLine();
		
		String s = str.replaceAll("[^A-Za-z]", "");
		System.out.println(s);

	}

}

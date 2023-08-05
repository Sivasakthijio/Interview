package chatGPT;

import java.util.Scanner;

public class TotalNoOfSingleChar {

	public static void main(String[] args) {
		System.out.println("Enter the string: ");
		Scanner sc =new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(str.length());
		String str1 = str.replaceAll("a","");
		System.out.println(str1.length());
		
		int count= str.length()-str1.length();
		System.out.println(count);
	}

}

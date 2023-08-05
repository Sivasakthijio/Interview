package chatGPT;

import java.util.Scanner;

public class Reversecharacter {

	public static void main(String[] args) {
		System.out.println("Enter the string:");
		Scanner sc= new Scanner(System.in);
		String s = sc.nextLine();
		char[] c = s.toCharArray();
		
		int i=0;
		int j=s.length()-1;
		System.out.println(j);
		
		while(i<j) {
			if (!Character.isLetter(c[i])) {
				i++;
			}
			else if(!Character.isLetter(c[j])) {
				j--;
			}
			else {
				char temp=c[i];
				c[i]=c[j];
				c[j]=temp;
				i++;
				j--;
			}
			
		}
		String s1=new String(c);
		System.out.println("Output"+s1);
	}

}

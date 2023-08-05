package chatGPT;

import java.util.Scanner;

public class FirstCharCapital {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the string: ");
		String s=sc.nextLine();
		
		//String s="welcome to java";
		String rw1="";
		String rs="";
		String[] words=s.split("\\s+");
		
		for(String w:words) {
			
		char[] w1 = w.toCharArray();
		for(int i=0;i<=w1.length-1;i++) {
			w1[0]=(char) (w1[0]-32);
			
			rw1=rw1+w1[i];
			}
		    rs=rs+rw1+" ";
		    rw1="";
	}
	System.out.println(rs);
	}
}

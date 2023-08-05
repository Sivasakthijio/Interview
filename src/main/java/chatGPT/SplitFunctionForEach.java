package chatGPT;

import java.util.Scanner;

public class SplitFunctionForEach {

	public static void main(String[] args) {
		
		//Scanner sc= new Scanner(System.in);
		Scanner sc= new Scanner(System.in);
		String s = sc.nextLine();
		String rw = "";
		String rs = "";
		//String s = "welcome to java";
		String[] words = s.split(" ");
		for(String word:words) {
			char[] c = word.toCharArray();
			for(int i=0;i<c.length;i++) {
			c[0]=(char) (c[0]-32);
			rw=rw+c[i];
		}
			rs=rs+rw+" ";
			rw="";
			}
System.out.println(rs.trim());
	}

}

package stringProgram;

import java.util.TreeSet;

public class CountNumberOfEachChar {

	public static void main(String[] args) {
		String str="sivasakthis";
		//int position;
		char[] ch = str.toCharArray();
		TreeSet<Character> hs= new TreeSet<Character>();
		for(int i=ch.length-1;i>=0;i--) {
			hs.add(ch[i]);
		}
		for(char c:hs) {
			int count=0;
			for(int i=ch.length-1;i>=0;i--) {
				if(c==ch[i]) {
				count++;
			}
			}
			if(count==1) {
				
				System.out.println(c+"------"+count);
			}
			
		}

	}

}


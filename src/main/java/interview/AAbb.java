package interview;

import java.util.TreeSet;

public class AAbb {

	public static void main(String[] args) {
		String s="aabbbcdddd";
		char[] ch = s.toCharArray();
		TreeSet<Character> t=new TreeSet<Character>();
		for(int i=0;i<s.length();i++) {
			t.add(ch[i]);	
		}
		
		
		for(Object t1:t) {
			String t2 = t1.toString();
			int count=0;
		for(int i=0;i<ch.length;i++) {
		
			if(t1.equals(ch[i])) {
				count++;
			}
		}
		if(count>=1) {
			System.out.print(t2+count);
		}
		}

	}

}

package interview;

import java.util.TreeSet;

public class KnowledgeCheck {

	public static void main(String[] args) {
		String s="sivasakthi";
		char[] ch=s.toCharArray();
		TreeSet<Character> t=new TreeSet<Character>();
		for(int i=0;i<s.length();i++) {
			t.add(ch[i]);
		}
		
		for(char t1:t) {
			int count=0;
			for(int i=0;i<ch.length;i++) {
				if(t1==(ch[i])) {
					count++;
				}
			}
			if(count>=1) {
				System.out.print(t1+count);
			}
		}
		
	}

}

package chatGPT;

public class Palindrome {

	public static void main(String[] args) {
		String s="siva";
		String s1 = "";
		int count = s.length();
		System.out.println(count);

		char[] ch = s.toCharArray();
		for(int i=0;i<ch.length;i++) {
			s1=ch[i]+s1;
		}
		System.out.println(s1);
	}

}

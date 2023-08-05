package arrayTopic;

import java.util.Arrays;

public class RemoveDuplicatesFromString {

	public static void main(String[] args) {
		
		String s="geeksforgeeks";

		char[] ch = s.toCharArray();
		
		int index=0;
		
		for(int i=0;i<s.length()-1;i++) {
			int j;
			for(j=0;j<s.length()-1;j++) {
				if(ch[i]==ch[j]) {
					break;
				}
			}
			if(j==i) {
				ch[index++]=ch[i];
			}
			}
		System.out.println(String.valueOf(Arrays.copyOf(ch, index)));
		
		
	}
}

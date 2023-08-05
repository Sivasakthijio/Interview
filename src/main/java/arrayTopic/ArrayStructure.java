package arrayTopic;

import org.apache.poi.util.SystemOutLogger;

public class ArrayStructure {

	public static void main(String[] args) {
		/*
		 * int a[]= {1,2,4,5,64,3};
		 * 
		 * for(int i=a.length-1;i>=0;i--) { System.out.println(a[i]); }
		 * 
		 * 
		 * 
		 * 
		 * System.out.println(a.length);
		 */		
		
		
		
		
		String s= "siva";
		
		char[] ch = s.toCharArray();
		
		for(int i=0;i<s.length();i++) {
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='0'||ch[i]=='u'){
				System.out.println(ch[i]);
			}
		}
	}

}

package stringProgram;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class CountDuplicateCharFromString {

	public static void main(String[] args) {

		String s="java programming";
		String s1 = s.replace(" ","");
		
		Map<Character, Integer> m=new HashMap<Character, Integer>();
		char[] ch=s1.toCharArray();
		
		for(char keys:ch) {
			if(m.containsKey(keys)) {
				m.put(keys, m.get(keys)+1);
			}else {
				m.put(keys, 1);
			}
			
		}
		//System.out.println(m);
		for(Entry<Character, Integer> map:m.entrySet()) {
			if(map.getValue()>1) {
				System.out.println(map.getKey()+"->"+map.getValue());
			}
		}
			
		}
	}

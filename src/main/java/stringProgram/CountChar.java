package stringProgram;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class CountChar {

	public static void main(String[] args) {
		String s="sivasakthi";
		char[] ch=s.toCharArray();
		Map<Character,Integer> m=new HashMap<Character,Integer>();
		
		for(char keys:ch) {
			if(m.containsKey(keys)) {
				m.put(keys, m.get(keys)+1);
			}else {
				m.put(keys, 1);
			}
		}
		
		for(Entry<Character, Integer> ES:m.entrySet()) {
			if(ES.getValue()==1) {
			System.out.println(ES.getKey()+" "+ES.getValue());
		}
			}

	}

}

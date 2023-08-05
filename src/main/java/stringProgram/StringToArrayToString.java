package stringProgram;
import java.util.*;

public class StringToArrayToString {

	public static void main(String[] args) {
		String s="good good morning";
		String[] s1=s.split(" ");
		ArrayList<String> a=new ArrayList<String>();
		for(String word:s1) {
			a.add(word);
			}
		a.remove(0);
		a.add("sivasakthi");
		String str=a.toString();
		System.out.println(str);
		String str1=str.replace(",", "");
		System.out.println(str1);
		
	}

}

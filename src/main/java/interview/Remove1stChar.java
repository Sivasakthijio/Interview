package interview;

public class Remove1stChar {

	public static void main(String[] args) {
		
		//Remove 1st character from string
		StringBuffer s=new StringBuffer("sivasakthi");
		System.out.println(s.deleteCharAt(0)); //------>ivasakthi
		
		
		//remove(int start,int end)
		StringBuffer s1=new StringBuffer("pavitra");
		System.out.println(s1.delete(0, 2));//--------------->vitra
		
		//Extract the character 
		StringBuffer s2=new StringBuffer("java");
		System.out.println(s2.charAt(0));//-------->j
		
		//indexof() will return the position of the method
		System.out.println(s2.indexOf("a"));  //------------>1
		
		
		
		
		
		

	}

}

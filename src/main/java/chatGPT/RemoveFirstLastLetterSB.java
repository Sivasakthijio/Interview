package chatGPT;

public class RemoveFirstLastLetterSB {

	public static void main(String[] args) {
		StringBuilder s=new StringBuilder("sivasakthi");
		
		//It will delete index that we want
		//System.out.println(s.indexOf("siva"));
		
		StringBuilder l = s.delete(0, 1).delete(8, 9);
		System.out.println("L------>"+l);
		
		StringBuffer f=new StringBuffer("sivasakthiloves");
		System.out.println(f.length());
		f.delete(0, 1).delete(f.length()-1, f.length());
		System.out.println(f);
		
	}

}

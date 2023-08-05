package chatGPT;

public class ReverseEachWordInString {

	public static void main(String[] args) {
		
		String s= "Welcome to java";
		String[] words = s.split(" ");
		String rw="",rs="";
		
		for(String w:words) {
			
			char[] wc = w.toCharArray();
			System.out.println(w.length());
			for(int i=w.length()-1;i>=0;i--) {
				rw=rw+wc[i];
			}
			rs=rs+rw+" ";
			rw="";
		}
		
      System.out.println(rs);
	}

}

package stringProgram;

public class ReverseOnlyWord {

	public static void main(String[] args) {
		String s="im iron man";
		String rw="",rs="";
		String[] s1=s.split(" ");
		for(String word:s1) {
			for(int i=0;i<word.length();i++) {
				rw=word.charAt(i)+rw;
			}
			rs=rs+rw+" ";
			rw="";
		}
		System.out.println(rs.trim());
	}

}

package stringProgram;

public class FirstCharCaps {

	public static void main(String[] args) {
		String s="you are best";
		String rev="";
		String res="";
		String[] str=s.split(" ");
		for(String word:str) {
			for(int i=0;i<word.length();i++) {
				char[] ch=word.toCharArray();
			if(i==0) {
				ch[0]=(char) (ch[i]-32);
			}
			rev=rev+ch[i];
			}
			res=res+rev+" ";
			rev="";
		}
		System.out.print(res.trim());
	}

}

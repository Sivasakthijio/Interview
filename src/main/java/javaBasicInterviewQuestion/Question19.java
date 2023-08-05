package javaBasicInterviewQuestion;

public class Question19 {

	public static void main(String[] args) {
		
		String s1 = "siva";

		String s2 = "siva";
		
		String s3 =new String("siva");
		
		//"==" it will compare the memory address
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		
		//equals() will compare the content "siva"
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s2));
	}

}

package javaBasicInterviewQuestion;

public class Question16 {

	public static void main(String[] args) {
		
		String s1="siva";
		String s2 = "siva";
		
	boolean result = s1==s2;
	//We cannot use boolean value in switch statement
	switch (result) {
	case true:
		System.out.println("Im safe");
	case false:
		System.out.println("I'm not safe");
	default:
		System.out.println("Im not sure");
		break;
	}

	}

}

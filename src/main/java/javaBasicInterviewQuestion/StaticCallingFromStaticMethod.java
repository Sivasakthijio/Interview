package javaBasicInterviewQuestion;

public class StaticCallingFromStaticMethod {

	public static void main(String[] args) {
		
		System.out.println(xValue());
	}
	
	static int xValue() {
		
	//We cannot mention varibale as static,Access modifier,Abstract and final keyword is only allowed
	//static int x=0;
	int x=0;
	return ++x;
	}
}

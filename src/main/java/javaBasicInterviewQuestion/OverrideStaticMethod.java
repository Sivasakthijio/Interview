package javaBasicInterviewQuestion;

abstract class Parent3{
	//you cannot override static method 
	abstract static void printMessage();
}

class Child3 extends Parent3{
	void printMessage() {
		System.out.println("Try to override static method");
	}
}

public class OverrideStaticMethod {

	public static void main(String[] args) {
		Parent3 p= new Child3();
		p.printMessage();

	}

}

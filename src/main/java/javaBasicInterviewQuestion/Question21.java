package javaBasicInterviewQuestion;


class Parent2{
	
	public void printMessage() {
		System.out.println("pavitra");
	}
	
	public void printDigit() {
		System.out.println("i love you");	
	}
}

class Child2 extends Parent2{
	
	public void printMessage() {
		System.out.println("sivasakthi");
	}
}

public class Question21 {

	public static void main(String[] args) {
		//Upcasting
		Parent2 p=new Child2();
		
		//Downcasting
		Child2 c2= (Child2)p;
		c2.printMessage();
		
		c2.printDigit();

	}

}

package javaBasicInterviewQuestion;


abstract class Parent1{
	public abstract void printMessage();
}

class Child1 extends Parent1{
	public void printMessage() {
		System.out.println("sivasakthi");
	}
}
public class Question20 {

	public static void main(String[] args) {
		
		//We cannot create object of abstract class
		Parent1 p1= new Parent1();
		
		Child1 c1= new Child1();
		Parent1 p11= new Child1();
		
		//We cannot create object of abstract class
		Child1 c11= new Parent1();
		
	}

}

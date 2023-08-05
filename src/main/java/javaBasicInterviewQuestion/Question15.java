package javaBasicInterviewQuestion;


class Parent{
	//If we have abstract method in class that class must be declared as "ABSTRACT"
	public abstract void printName();
	
}

class Child extends Parent{
	
	@Override
	public void printName() {
		System.out.println("Abstract override method");
	}
}

public class Question15 { 

	public static void main(String[] args) {
		Parent p= new Child();
		p.printName();

	}

}

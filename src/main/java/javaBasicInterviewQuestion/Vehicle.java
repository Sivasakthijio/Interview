package javaBasicInterviewQuestion;

public class Vehicle {
	int MaxSpeed = 200;

	public static void drive() {
		System.out.println("Vehicle drive");
	}

	public void race() {
		System.out.println("vehicle race");
	}
}

class Car11 extends Vehicle {

	int MaxSpeed = 100;

	public static void drive() {
		System.out.println("Car drive");
	}

	public void race() {
		System.out.println("Car race");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vehicle v= new Car11();
		
		System.out.println(v.MaxSpeed);
		//Race is an instance it will override will give the car class object
		v.race();
		
		//drive() is static it will not override. we have call as classname.methodname
		//We can run with ref.drive() but it will not override 
		//v.drive();
		
		

	}

}

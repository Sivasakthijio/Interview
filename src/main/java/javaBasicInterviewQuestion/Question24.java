package javaBasicInterviewQuestion;


class Vehicle2 {
	
	int max=200;
	
	Vehicle2(int max) {
		this.max=max;
	}
	
	public void maxSpeed() {
	System.out.println("maximum speed is 2000");	
	}
	}
	
	class Car2 extends Vehicle2 {

		Car2(int max) {
			//super.max=max;
			super(max);
		}
		
		public void maxSpeed() {
			System.out.println("maximum speed is "+max);	
		}
}
public class Question24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle2 v2= new Car2(400);
		v2.maxSpeed();
		

	}

}

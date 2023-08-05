package javaBasicInterviewQuestion;

class Upcasting {
	
	public void drive() {
		System.out.println("Driving from vehicle");
	}
}
	class Car extends Upcasting{
		public void drive() {
			System.out.println("Driving from car");
		}
		
		public void playMusic() {
		
			System.out.println("Play music from car");
		}
	public static void main(String[] args) {
		Upcasting V =new Car();
		V.drive();
		
		//We can not access using paymusic method using parent reference unless it is override
		//V.playMusic();
		

	}
	}

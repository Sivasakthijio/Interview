package JavaBasicProgram;

public class NormalTriangle {
	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {

			for (int s = 1; s <= 5 - i; s++) { 
				System.out.print(" ");
			}

			for (int star = 1; star <= i * 2 - 1; star++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
package JavaBasicProgram;

public class InvertedLeftTriangle {

	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++){
			
			for(int st=1;st<=6-i;st++) {
				System.out.print("*");
			}
			
			for(int sp=1;sp<=i-1;sp++) {
				System.out.print(" ");
				}
			
			System.out.println("");
		}

	}

}
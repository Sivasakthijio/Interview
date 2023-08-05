package JavaBasicProgram;

public class InvertTriangle {
	
	public static void main(String[] args) {
		
	
		for (int i=1;i<=5;i++) {
			
			for(int sp=1;sp<=i-1;sp++) {
				System.out.print(" ");
				}
			
			for(int st=10;i<=st-i;st--) {
				System.out.print("*");
			}
			
			for(int sp=1;sp<=i-1;sp++) {
				System.out.print(" ");
				}
			
			System.out.println("");
		}
	}

}

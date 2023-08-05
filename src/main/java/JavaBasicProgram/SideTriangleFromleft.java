package JavaBasicProgram;

public class SideTriangleFromleft {

	public static void main(String[] args) {
		
		for(int i=9;i>=1;i--) {
			
			for(int sp=5;sp<i;sp++) {
				System.out.print(" ");
			}
			for(int st=5;st<i-4;st--) {
				System.out.print("*");
			}
			System.out.println("");
			}

	}

}

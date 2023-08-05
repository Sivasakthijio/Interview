package javaBasicInterviewQuestion;

public class ExceptionExample {

	public static void main(String[] args) {
		
		int a[]= {10,20,30};
		int i=5, j=0;
		
		try {
		System.out.println(a[3]);
		System.out.println(i/j);
		}
		
		
		catch(ArithmeticException e){
			System.out.println("line2");
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("line1");
		}
		
		catch(Exception e){
			System.out.println("line3");
		}
		
		
	}

}

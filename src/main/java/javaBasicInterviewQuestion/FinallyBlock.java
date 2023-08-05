package javaBasicInterviewQuestion;

public class FinallyBlock {

	public static void main(String[] args) {
		int a[]= {10,20,30};
		
		try {
		System.out.println(a[2]);	
		}
		finally {
			System.out.println("END");
		}
	}

}

package javaBasicInterviewQuestion;

public class Test {

	int count;
	//static int siva;
	
	Test(){
		count++;
		//siva++;
	}
	public void printNumber() {
		System.out.println(count);
		//System.out.println(siva);
	}
	
	public static void main(String[] args) {
		Test t1=new Test();//t1 ref will store the data object
		Test t2=new Test();//t2 ref will store the data object
		Test t3=new Test();//t3 ref will store the data object 
		
		t1.printNumber();
		t2.printNumber();
		t3.printNumber();

	}
}

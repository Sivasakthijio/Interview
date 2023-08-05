package javaBasicInterviewQuestion;

public class StaticMembers {

	public static void main(String[] args) {
		
		System.out.println(myFun());
		}
	//Why myFun will give you error is we cannot call the non static method inside the main method or static method.
	//if you change the next line to --->public static int myFun() {
	//Please remove static keyword from below method then execute
	public static int myFun() {
		return 20;
	}

}

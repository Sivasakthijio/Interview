package javaThis;

public class Thismethodex {
	
	int ival;
	double dval;
	public Thismethodex() {
		System.out.println("ival"+"     "+"dval");
		System.out.println(ival+"     "+dval);
	}
	
	Thismethodex(int ival){
		this(); 
		System.out.println(ival+"     "+dval);
	}
	
	Thismethodex(int ival,double dval){
		this(ival);
		System.out.println(ival+"      "+dval);
	}
	
	public static void main(String[] args) {
		Thismethodex t1=new Thismethodex(3,1.2);
		Thismethodex t2=new Thismethodex(300,1.200);
		Thismethodex t3=new Thismethodex();

	}

}

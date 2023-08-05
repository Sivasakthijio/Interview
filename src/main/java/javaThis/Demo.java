package javaThis;

public class Demo {
	int ivalue=10;
	double dvalue=3.14;
	
	Demo(int ivalue, double dvalue){
		System.out.println("From cons1: "+ivalue+" "+dvalue);
		this.ivalue=ivalue;
		this.dvalue=dvalue;
		System.out.println("From cons2: "+this.ivalue+" "+this.dvalue);
		}
	
	public static void main(String[] args) {
		Demo ref=new Demo(5, 1.9);
		
		System.out.println("Object1: "+ref.ivalue+" "+ref.dvalue);
		
		Demo secref=new Demo(15, 2.9);
		
		System.out.println("Object1: "+secref.ivalue+" "+secref.dvalue);
	}

}

package javaConcept;

//final class Parent{----->We can't able to inherit from parent class to subclass
class Parent{
	final int a=10;
	int b=20;
	public void job() {
		System.out.println("Carpenter");
	}
	}
	class Child extends Parent{
		public void job() {
			System.out.println("Civil engineering");
		}
	}
public class FinalKeyword {

	public static void main(String[] args) {
		Parent p=new Child();
		p.job();
		//p.a=11;---------->We can't re-initialize the value if we declare variable as "final"
		p.b=21;
		

	}

}

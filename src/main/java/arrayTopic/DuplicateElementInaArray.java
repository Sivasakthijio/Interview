package arrayTopic;

public class DuplicateElementInaArray {
	//Need to work on that
	public static void main(String[] args) {
		
		String a[]= {"java","Python","c","c++","c"};
		
		System.out.println(a.length);
		
		for(int i=0;i<a.length-1;i++) {
		
			for(int j=i+1;j<=a.length-1;j++) {
			
				if(a[i]==a[j]) {
					System.out.println("duplicate element "+a[i]);
					break;
				}
				
			}
		}
	}
	}



package arrayTopic;

public class OddValueLeftEvenValueRightINaArray {

	public static void main(String[] args) {
		int a[]= {10,67,54,36,45,87,78,65,65};
		int size=a.length;
		int odd=0;
		int even=a.length-1;
		int[] sort=new int[size];
		
		for(int num:a) {
			
			if(num%2!=0){
				sort[odd]=num;
				odd++;
			}else {
				sort[even]=num;
				even--;
			}
			
		}
		for(int val:sort) {
			System.out.println(val);	
		}
		
	}

}

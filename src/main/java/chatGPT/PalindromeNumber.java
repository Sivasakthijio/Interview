package chatGPT;

public class PalindromeNumber {

	public static void main(String[] args) {
		
	int num=1234;
	int rev_num = 0;
	
	while(num!=0) {
		rev_num=num%10+rev_num*10;
		num=num/10;
	}
	System.out.println("reverse Number is "+rev_num);
	}

}

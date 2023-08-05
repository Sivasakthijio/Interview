package interview;

import java.util.Scanner;

public class ArmStrong {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int num = sc.nextInt();
		int a=num;
		int count=0,rem=0,temp=1,total=0;
		
		while(a>0) {
			a=a/10;
			count++;
		}
		System.out.println(count);
		
		while(num>0) {
			rem=num%10;  //3,5,1
			num=num/10;
			for(int i=0;i<count;i++) {
				temp*=rem;
			}
			
			total=temp+total;
			temp=1;
		}
		
		System.out.println("total"+total);
		
		
	}

}

package arrayTopic;

import java.util.Scanner;

public class ReverseFirstHalfOfElement {

	public static void main(String args[])
	   {
	     int i,j;
	     
			/*
			 * Scanner sc=new Scanner(System.in);
			 * 
			 * System.out.println("Enter The Size Of The Array:"); size=sc.nextInt();
			 */
	     //int a[]=new int[size];

	     int a[]= {10,20,40,43,21,32,12,13};
	     int size=a.length;
	     System.out.println("Enter The Array Elements:");
		
	     
			/*
			 * for(i=0;i<size;i++) { a[i]=sc.nextInt(); }
			 */
			 

	     for(i=0,j=(size/2)-1;i<j;i++,j--)
	       {
	          int temp=a[i];
	          a[i]=a[j];
	          a[j]=temp;
	        }

	    System.out.println("The Output Is:");
	    for(i=0;i<size;i++)
	      {
	        System.out.println(" "+a[i]);
	       }

	   }
}

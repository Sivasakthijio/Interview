package chatGPT;

import java.util.Scanner;

public class ReverseCharOnly {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        char[] chars = input.toCharArray();

        int i = 0;
        int j = chars.length - 1;
        System.out.println(chars.length);

        while (i < j) { 
            
        	if (!Character.isLetter(chars[i])) {
                i++;
                 
            } else if (!Character.isLetter(chars[j])) {
                j--; //j=6,5
                 
            } else {
                char temp = chars[i];
                chars[i] = chars[j];
                chars[j] = temp;
                i++;//i=1,2
                j--;//j=4,3
            }
        	
        }

        String s= new String(chars);
        System.out.print("Output: " + s);


	}

}

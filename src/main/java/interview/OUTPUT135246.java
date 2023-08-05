package interview;

import java.util.ArrayList;
import java.util.List;

public class OUTPUT135246 {
	
	public static int rearrangeNumber(int num) {
        // Convert the number to a string for easier manipulation
        String numberString = Integer.toString(num);
        StringBuilder result = new StringBuilder();

        // Iterate through the digits of the number and rearrange them
        for (int i = 0; i < numberString.length(); i += 2) {
            if (i + 1 < numberString.length()) {
                // Swap the adjacent digits
                result.append(numberString.charAt(i + 1));
                result.append(numberString.charAt(i));
            } else {
                // If the number has an odd number of digits, append the last digit
                result.append(numberString.charAt(i));
            }
        }

        // Convert the rearranged string back to an integer
        return Integer.parseInt(result.toString());
    }

    public static void main(String[] args) {
        int num = 123456;
        int rearrangedNum = rearrangeNumber(num);
        System.out.println("Input num: " + num);
        System.out.println("Output num: " + rearrangedNum);
    }

}

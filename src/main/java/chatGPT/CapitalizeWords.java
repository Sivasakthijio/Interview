package chatGPT;

import java.util.Scanner;

public class CapitalizeWords {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();

        String capitalized = capitalizeWords(input);
        System.out.println("Capitalized: " + capitalized);
    }

    public static String capitalizeWords(String s) {
        String[] words = s.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            if (!word.isEmpty()) {
                sb.append(Character.toUpperCase(word.charAt(0)));
                
                sb.append(word.substring(1));
            }
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}

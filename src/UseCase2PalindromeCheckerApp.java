import java.util.Scanner;

/**
 * ===================================================
 * MAIN CLASS - UseCase3PalindromeCheckerApp
 * ===================================================
 * 
 * Use Case 2: Reverse String Based Palindrome Check
 * 
 * Description:
 * This class checks whether a string is a palindrome 
 * by reversing the string and comparing it with
 * the original value.
 * 
 * At this stage, the application:
 * - Iterates the string in reverse order
 * - Builds a reversed version
 * - Compares original and reversed strings
 * - Displays the validation result
 * 
 * This introduces transformation based validation.
 * 
 * The goal is to establish a clear startup flow.
 * 
 * @author Developer
 * @version 3.0
 */

public class UseCase3PalindromeCheckerApp {
    /**
     * Application entry point for UC3.
     * 
     * @param args Command-line arguments
     */

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input text: ");
        String input = sc.nextLine();
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);  // String concatenation
        }
        if (input.equals(reversed)) {
            System.out.println("Reversed text: " + reversed);
            System.out.println("Is it a Palindrome? : true");
        } else {
            System.out.println("Reversed text: " + reversed);
            System.out.println("Is it a Palindrome? : false");
        }
        sc.close();
    }
}
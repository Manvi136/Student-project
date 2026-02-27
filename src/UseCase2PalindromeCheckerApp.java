import java.util.Scanner;

/**
 * ===================================================
 * MAIN CLASS - UseCase2PalindromeCheckerApp
 * ===================================================
 * 
 * Use Case 2: Hardcoded Palindrome Validation
 * 
 * Description:
 * This class demonstrates basic palindrome validation
 * using a hardcoded string value.
 * 
 * At this stage, the application:
 * - Stores a predefined string
 * - Compares characters from both ends
 * - Determines whether the string is a plaindrome
 * - Displays the result on the console
 * 
 * This use case introduces fundamental comparison logic
 * before using advanced data structures.
 * 
 * The goal is to establish a clear startup flow.
 * 
 * @author Developer
 * @version 2.0
 */

public class UseCase2PalindromeCheckerApp {
    /**
     * Application entry point for UC2.
     * 
     * @param args Command-line arguments
     */

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input text: ");
        String input = sc.nextLine();
        boolean isPalindrome = true;
        for (int i = 0; i < input.length() / 2; i++) {
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println("Is it a Palindrome? : " + isPalindrome);
        sc.close();
    }
}
import java.util.Scanner;
import java.util.Stack;

// PalindromeChecker class - contains palindrome logic
class PalindromeChecker {

    // Method to check if the string is palindrome
    public boolean checkPalindrome(String input) {

        Stack<Character> stack = new Stack<>();
        String processed = input.replaceAll("\\s+", "").toLowerCase();

        // Push characters into stack
        for (int i = 0; i < processed.length(); i++) {
            stack.push(processed.charAt(i));
        }

        // Compare characters
        String reversed = "";
        while (!stack.isEmpty()) {
            reversed += stack.pop();
        }

        return processed.equals(reversed);
    }
}

// Main Application class
public class UseCase11PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        PalindromeChecker checker = new PalindromeChecker();

        System.out.println("=== Palindrome Checker App ===");
        System.out.print("Enter a string: ");

        String input = scanner.nextLine();

        boolean result = checker.checkPalindrome(input);

        if (result) {
            System.out.println("Result: The string is a Palindrome.");
        } else {
            System.out.println("Result: The string is NOT a Palindrome.");
        }

        scanner.close();
    }
}
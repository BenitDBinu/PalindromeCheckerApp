import java.util.Scanner;

public class UseCase9PalindromeCheckerApp {

    // Recursive function to check palindrome
    static boolean isPalindrome(String str, int start, int end) {
        // Base condition: if start >= end, all characters matched
        if (start >= end) {
            return true;
        }

        // Compare current characters
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        // Recursive call for next pair
        return isPalindrome(str, start + 1, end - 1);
    }

    public static void main(String[] args) {

        // Scanner for user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

        // Call recursive function
        if (isPalindrome(word, 0, word.length() - 1)) {
            System.out.println(word + " is a Palindrome.");
        } else {
            System.out.println(word + " is not a Palindrome.");
        }

        scanner.close();
    }
}
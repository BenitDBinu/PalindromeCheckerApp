import java.util.Scanner;

public class UseCase10PalindromeCheckerApp {

    public static void main(String[] args) {

        // Scanner for user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a phrase: ");
        String input = scanner.nextLine();

        // Normalize string: remove spaces and convert to lowercase
        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        // Two-pointer approach
        int start = 0;
        int end = normalized.length() - 1;
        boolean isPalindrome = true;

        while (start < end) {
            if (normalized.charAt(start) != normalized.charAt(end)) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        // Display result
        if (isPalindrome) {
            System.out.println("\"" + input + "\" is a Palindrome.");
        } else {
            System.out.println("\"" + input + "\" is not a Palindrome.");
        }

        scanner.close();
    }
}
import java.util.Scanner;
import java.util.Stack;

public class UseCase13PalindromeCheckerApp {

    // Algorithm 1: Reverse String Method
    public static boolean reverseMethod(String input) {
        String reversed = new StringBuilder(input).reverse().toString();
        return input.equals(reversed);
    }

    // Algorithm 2: Stack Method
    public static boolean stackMethod(String input) {
        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        String reversed = "";

        while (!stack.isEmpty()) {
            reversed += stack.pop();
        }

        return input.equals(reversed);
    }

    // Algorithm 3: Two Pointer Method
    public static boolean twoPointerMethod(String input) {

        int left = 0;
        int right = input.length() - 1;

        while (left < right) {

            if (input.charAt(left) != input.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Palindrome Performance Comparison ===");
        System.out.print("Enter a string: ");

        String input = scanner.nextLine();
        input = input.replaceAll("\\s+", "").toLowerCase();

        // Reverse Method Timing
        long start1 = System.nanoTime();
        boolean result1 = reverseMethod(input);
        long end1 = System.nanoTime();

        // Stack Method Timing
        long start2 = System.nanoTime();
        boolean result2 = stackMethod(input);
        long end2 = System.nanoTime();

        // Two Pointer Method Timing
        long start3 = System.nanoTime();
        boolean result3 = twoPointerMethod(input);
        long end3 = System.nanoTime();

        System.out.println("\nResults:");
        System.out.println("Reverse Method Result: " + result1);
        System.out.println("Execution Time: " + (end1 - start1) + " ns");

        System.out.println("\nStack Method Result: " + result2);
        System.out.println("Execution Time: " + (end2 - start2) + " ns");

        System.out.println("\nTwo Pointer Method Result: " + result3);
        System.out.println("Execution Time: " + (end3 - start3) + " ns");

        scanner.close();
    }
}
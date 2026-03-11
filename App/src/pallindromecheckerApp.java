import java.util.Stack;

/**
 MAIN CLASS UseCase13PalindromeCheckenApp
 Use Case 13: Performance Comparison
 Description:
 This class measures and compares the execution
 * performance of palindrome validation algorithms.
 *At this stage, the application:
 Uses a palindrome strategy implementation
 * Captures execution start and end tine
 Calculates total execution duration
 Displays benchmarking results
 This use case focuses purely on performance
 measurement and algorithm comparison.
 The goal is to introduce benchmarking concepts.
 Author RamyaAnandan
 @version 13.0

 */
class PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "level";

        // Inject strategy at runtime
        PalindromeStrategy strategy = new StackStrategy();

        boolean isPalindrome = strategy.check(input);

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}

/**
 * =========================================================
 * INTERFACE - PalindromeStrategy
 * =========================================================
 *
 * Defines a contract for all palindrome checking algorithms.
 */
interface PalindromeStrategy {

    boolean check(String input);
}

/**
 * =========================================================
 * CLASS - StackStrategy
 * =========================================================
 *
 * Provides a Stack based implementation of
 * the PalindromeStrategy interface.
 *
 * Uses LIFO behavior to reverse characters
 * and compare them with original sequence.
 */
class StackStrategy implements PalindromeStrategy {

    /**
     * Implements palindrome validation using Stack.
     *
     * @param input Input string to validate
     * @return true if palindrome, false otherwise
     */
    public boolean check(String input) {

        // Create a stack to store characters
        Stack<Character> stack = new git branchStack<>();

        // Push each character onto the stack
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Compare characters by popping from stack
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}
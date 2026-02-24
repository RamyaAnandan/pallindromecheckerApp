/**
 MAIN CLASS UseCase PalindromeApp
 Use Case 1: Application Entry & Welcome Message
 Description:
 This class represents the entry point of the
 Palindrome Checker Management System.
 At this stage, the application:
 Starts execution from the main() method
 Displays a welcome message
 Shows application version
 No palindrome logic is implemented yet.
 The goal is to establish a clear startup flow.
 @author Ramya Anandan
 @version 1.0
 **/




import java.util.LinkedList;
import java.util.Queue;
import java .util.Scanner;
import java.util.Stack;

public class pallindromecheckerApp {
    public static void main(String[] args) {
        // Declare and initialize the input string.
        String input = "civic";

// Create a Queue to store characters in FIFO order
        Queue<Character> queue = new LinkedList<>();
// Create a Stack to store characters in LIFO order
        Stack<Character> stack = new Stack<>();

// Insert each character into both queue and stack
        for (char c : input.toCharArray()) {
            queue.add(c);
            stack.push(c);
        }

// Flag to track palindrome status
        boolean isPalindrome = true;

// Compare characters until the queue becomes empty
        while (!queue.isEmpty()) {
            if (queue.remove() != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

// Print the result
        System.out.println("Input: " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}

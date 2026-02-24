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




import java.util.*;

public class pallindromecheckerApp {
    public static void main(String[] args) {
        String input = "refer";

// Create a Deque to store characters
        Deque<Character> deque = new ArrayDeque<>();

// Add each character to the deque
        for (char c : input.toCharArray()) {
            deque.add(c);
        }

// Flag to track palindrome result
        boolean isPalindrome = true;

// Continue comparison while more than one element exists
        while (deque.size() > 1) {
            char first = deque.removeFirst();
            char last = deque.removeLast();
            if (first != last) {
                isPalindrome =false;
                break;
            }
        }

// Print the result (as shown in the image output)
        System.out.println("Input: " + input);
        System.out.println("Is Palindrome? " + isPalindrome);
    }
}
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
        String input = "man a plan a canal Panama";
        String normalized = input.toLowerCase().replaceAll("[^a-z0-9]", "");

        boolean isPalindrome = true;
        for (int i = 0; i < normalized.length() / 2; i++) {
            // Compare symmetric characters
            if (normalized.charAt(i) != normalized.charAt(normalized.length() - 1 - i)) {
                isPalindrome = false;
                break; // Exit the loop as soon as a mismatch is found
            }
        }
        System.out.println("Input: " + input + " " + isPalindrome);
        System.out.println("Is Palindrome? " + isPalindrome);
    }
}
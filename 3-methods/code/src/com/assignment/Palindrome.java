package com.assignment;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        String in = sc.next();

        if (isPalindrome(in)){
            System.out.println("Palindrome.");
            return;
        }
        System.out.println("Not Palindrome.");
    }

    private static boolean isPalindrome(String in) {
        int len = in.length();
        for (int i = 0; i < len / 2; i++) {
            if (in.charAt(i) != in.charAt(len - 1 - i)){
                return false;
            }
        }
        return true;
    }
}

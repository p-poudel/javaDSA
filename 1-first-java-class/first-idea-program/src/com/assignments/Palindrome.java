package com.assignments;

import java.util.Scanner;

public class Palindrome {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter a string: ");
        String input = sc.next();
        int len = input.length();

        for (int i = 0; i < len/2; i++) {
            if (input.charAt(i) != input.charAt(len - 1 - i)) {
                System.out.println(input + " is not palindrome.");
                return;
            }
        }
        System.out.println(input + " is a palindrome.");
    }
}

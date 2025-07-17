package com.prasit;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        char ch = in.next().trim().charAt(0);

        if (ch >= 'A' && ch <= 'Z') {
            System.out.println("Uppercase");
            return;
        }
        if (ch >= 'a' && ch <= 'z') {
            System.out.println("Lowercase");
            return;
        }
        System.out.println("Not an English Alphabet");
    }
}

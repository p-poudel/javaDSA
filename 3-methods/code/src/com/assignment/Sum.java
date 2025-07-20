package com.assignment;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        printsum();
    }
    static void printsum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        float a = sc.nextFloat();
        float b = sc.nextFloat();

        System.out.println("Sum = " + (a + b));
    }
}

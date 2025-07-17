package com.assignments;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        int a = 0;
        int b = 1;
        int count = 0;
        int temp;
        if (n < 1) {
            System.out.println("Invalid n");
            return;
        }

        System.out.println("Fibonacci Series up to "+n+" number(s):");
        while (count < n) {
            System.out.print(a + " ");
            temp = a + b;
            a = b;
            b = temp;
            count++;
        }
    }
}

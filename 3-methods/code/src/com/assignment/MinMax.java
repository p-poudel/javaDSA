package com.assignment;

import java.util.Scanner;

public class MinMax {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Select the function to use:");
        System.out.println("1. Min\n2. Max\n3. Exit");
        System.out.print("\nInput: ");
        int in = sc.nextInt();

        switch (in) {
            case 1 -> min();
            case 2 -> max();
            case 3 -> {
                return;
            }
            default -> System.out.println("Invalid Input!!!");
        }
    }

    private static void min() {
        System.out.println("\nEnter three numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int min = a;
        if (min > b) {
            min = b;
        }
        if (min > c) {
            min = c;
        }
        System.out.println("\nMin = "+min);
    }
    private static void max() {
        System.out.println("\nEnter three numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int max = a;
        if (max < b) {
            max = b;
        }
        if (max < c) {
            max = c;
        }
        System.out.println("\nMax = "+ max);
    }
}

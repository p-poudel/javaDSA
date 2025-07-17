package com.assignment;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        System.out.println("Enter digits to add:");
        while (true) {
            int input = sc.nextInt();
            if (input == 0) {
                break;
            }
            sum += input;
        }
        System.out.println("Sum: " + sum);
    }
}

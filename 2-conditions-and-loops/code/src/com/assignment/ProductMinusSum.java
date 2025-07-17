package com.assignment;

import java.util.Scanner;

public class ProductMinusSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        int prod = 1;
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            prod *= digit;
            sum += digit;
            num /= 10;
        }
        System.out.println("Product - Sum = "+(prod-sum));
    }
}

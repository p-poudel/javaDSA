package com.assignment;

import java.util.Scanner;

import static com.assignment.IsPrime.isPrime;

public class PrimeBetweenNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range:");
        int a = sc.nextInt();
        int b = sc.nextInt();

        printPrimeBetween(a,b);
    }

    private static void printPrimeBetween(int a, int b) {
        System.out.println("\nThe prime numbers between "+a+" and "+b+" are:");
        for (int i = a + 1; i < b; i++) {
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
    }
}

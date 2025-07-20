package com.assignment;

import java.util.Scanner;

public class SumOfNNaturalNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N: ");

        int n = sc.nextInt();
        System.out.println("The sum of first "+ n + " natural numbers is "+ sumUpto(n));
    }

    private static int sumUpto(int n) {
        return ((n + 1) / 2) * n;
    }
}

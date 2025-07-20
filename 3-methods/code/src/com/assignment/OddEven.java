package com.assignment;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        System.out.print("Enter an integer: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (oddEven(num)){
            System.out.println("Even");
            return;
        }
        System.out.println("Odd");
    }

    private static boolean oddEven(int num) {
        return num % 2 == 0;
    }
}

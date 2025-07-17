package com.assignments;

import java.util.Scanner;

public class PrintLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers");
        float a = sc.nextFloat();
        float b = sc.nextFloat();

        System.out.print("Largest among these two numbers is ");

        if (a > b) {
            System.out.println(a);
            return;
        }
        System.out.println(b);
    }
}

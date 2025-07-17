package com.assignment;

import java.util.Scanner;

public class TSASphere {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side length: ");
        double a = sc.nextDouble();
        double tsa = 6 * a * a;

        System.out.println("Total Surface Area: "+ tsa +" square units.");
    }
}

package com.assignment;

import java.util.Scanner;

public class ParallelogramArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of: ");
        System.out.print("Base: ");
        double a = sc.nextDouble();
        System.out.print("Height: ");
        double b = sc.nextDouble();

        double area = a * b;

        System.out.println("Area: "+area+" square units.");
    }
}

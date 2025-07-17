package com.assignment;

import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of sides: ");
        System.out.print("A: ");
        double a = sc.nextDouble();
        System.out.print("B: ");
        double b = sc.nextDouble();
        System.out.print("C: ");
        double c = sc.nextDouble();

        double s = (a + b + c) / 2;
        double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));

        System.out.println("Area: "+area+" square units.");
    }
}

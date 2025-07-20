package com.assignment;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        double radius = sc.nextDouble();

        printCircumference(radius);
        printArea(radius);
    }

    private static void printArea(double radius) {
        double area = Math.PI * radius * radius;
        System.out.println("Area = " + area + " units square.");
    }

    private static void printCircumference(double radius) {
        double circ = 2 * Math.PI * radius;
        System.out.println("Circumference = " + circ + " units.");
    }
}

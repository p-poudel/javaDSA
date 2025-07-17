package com.assignment;

import java.util.Scanner;

public class TrianglePerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of sides: ");
        System.out.print("A: ");
        double a = sc.nextDouble();
        System.out.print("B: ");
        double b = sc.nextDouble();
        System.out.print("C: ");
        double c = sc.nextDouble();

        double s = (a + b + c);

        System.out.println("Perimeter: "+s+" units.");
    }
}

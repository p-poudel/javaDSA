package com.assignment;

import java.util.Scanner;

public class CSACylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of: ");
        System.out.print("Radius: ");
        double radius = sc.nextDouble();
        System.out.print("Height: ");
        double height = sc.nextDouble();
        double csa = 2 * Math.PI * radius * height;

        System.out.println("Curved Surface Area: "+csa+" square units.");
    }
}

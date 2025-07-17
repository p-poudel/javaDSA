package com.assignment;

import java.util.Scanner;

public class RhombusArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of diagonals: ");
        System.out.print("D1: ");
        double a = sc.nextDouble();
        System.out.print("D2: ");
        double b = sc.nextDouble();

        double area = 0.5 * a * b;

        System.out.println("Area: "+area+" square units.");
    }
}

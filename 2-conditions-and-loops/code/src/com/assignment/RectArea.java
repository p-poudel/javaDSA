package com.assignment;

import java.util.Scanner;

public class RectArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of sides: ");
        System.out.print("A: ");
        double a = sc.nextDouble();
        System.out.print("B: ");
        double b = sc.nextDouble();

        double area = a * b;

        System.out.println("Area: "+area+" square units.");
    }
}

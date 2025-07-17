package com.assignment;

import java.util.Scanner;

public class RectPerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of sides: ");
        System.out.print("A: ");
        double a = sc.nextDouble();
        System.out.print("B: ");
        double b = sc.nextDouble();

        double peri = 2 * ( a + b);

        System.out.println("Perimeter: "+ peri +" units.");
    }
}

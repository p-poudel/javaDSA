package com.assignment;

import java.util.Scanner;

public class PrismVolume {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of: ");
        System.out.print("No. of sides in base: ");
        double n = sc.nextDouble();
        System.out.print("Base Length: ");
        double h = sc.nextDouble();
        System.out.print("Side Length: ");
        double s = sc.nextDouble();
        double volume = ((n * h * s * s)/4) * 1/(Math.tan(Math.PI/n));

        System.out.println("Volume: "+volume+" cubic units.");
    }
}

package com.assignment;

import java.util.Scanner;

public class SquarePyramidVolume {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of: ");
        System.out.print("Base Length: ");
        double b = sc.nextDouble();
        System.out.print("Height: ");
        double h = sc.nextDouble();
        double volume = (b * b * h) / 3;

        System.out.println("Volume: "+volume+" cubic units.");
    }
}

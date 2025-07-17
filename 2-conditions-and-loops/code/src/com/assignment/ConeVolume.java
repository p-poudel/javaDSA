package com.assignment;

import java.util.Scanner;

public class ConeVolume {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of: ");
        System.out.print("Radius: ");
        double radius = sc.nextDouble();
        System.out.print("Height: ");
        double height = sc.nextDouble();
        double volume = ( Math.PI * Math.pow(radius, 2) * height) / 3;

        System.out.println("Volume: "+volume+" cubic units.");
    }
}

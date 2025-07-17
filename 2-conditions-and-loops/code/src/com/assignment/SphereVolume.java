package com.assignment;

import java.util.Scanner;

public class SphereVolume {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        double radius = sc.nextDouble();
        double volume = ( 4  * Math.PI * Math.pow(radius, 3)) / 3;

        System.out.println("Volume: "+ volume +" cubic units.");
    }
}

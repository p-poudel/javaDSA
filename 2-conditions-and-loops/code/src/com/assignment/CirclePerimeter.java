package com.assignment;

import java.util.Scanner;

public class CirclePerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        double radius = sc.nextDouble();
        double perimeter = Math.PI * radius * 2;

        System.out.println("Perimeter: "+ perimeter +" units.");
    }
}

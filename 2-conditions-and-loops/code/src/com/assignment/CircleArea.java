package com.assignment;

import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        double radius = sc.nextDouble();
        double area = Math.PI * Math.pow(radius, 2);

        System.out.println("Area: "+area+" square units.");
    }
}

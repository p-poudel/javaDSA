package com.assignment;

import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        float a = sc.nextFloat();
        float b = sc.nextFloat();

        System.out.println("Prdouct = "+ product(a , b));;
    }
    static float product(float a, float b) {
        return a * b;
    }
}

package com.assignment;

import java.util.Scanner;

public class PythagoreanTriplet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter triplets:");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();

        if (isPythagoreanTriplet(a,b,c)){
            System.out.println("These are pythagorean triplets.");
            return;
        }
        System.out.println("These are not pythagorean triplets.");
    }

    private static boolean isPythagoreanTriplet(float a, float b, float c) {
        float max = a;
        float mid = b, min = c;

        if ( max < b) {
            max = b;
            if ( a > c) {
                mid = a;
                min = c;
            }
            mid = c;
            min = a;
        }
        if ( max < c) {
            max = c;
            if ( a > b) {
                mid = a;
                min = b;
            }
            mid = b;
            min = a;
        }

        return  max * max == (mid * mid + min * min);
    }
}

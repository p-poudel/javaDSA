package com.assignment;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0;

        System.out.println("Enter digits:");
        while (true) {
            int input = sc.nextInt();
            if (input == 0) {
                break;
            }
            if (input > max) {
                max = input;
            }
        }
        System.out.println("Largest: " + max);
    }
}

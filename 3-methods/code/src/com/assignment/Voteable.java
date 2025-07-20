package com.assignment;

import java.util.Scanner;

public class Voteable {
    public static void main(String[] args) {
        System.out.println("Enter your age: ");
        Scanner sc = new Scanner(System.in);

        int age = sc.nextByte();
        voteable(age);
    }

    private static void voteable(int age) {
        if (age >= 18){
            System.out.println("Eligible to vote.");
            return;
        }
        System.out.println("Not eligible to vote.");
    }
}

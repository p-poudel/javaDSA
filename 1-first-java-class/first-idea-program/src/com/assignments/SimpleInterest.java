package com.assignments;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter principal: ");
        double principal = input.nextDouble();

        System.out.print("Enter time: ");
        float time =  input.nextFloat();

        System.out.print("Enter rate: ");
        float rate = input.nextFloat();

        System.out.println("Simple Interest = " + (principal * time * rate) / 100);
    }
}

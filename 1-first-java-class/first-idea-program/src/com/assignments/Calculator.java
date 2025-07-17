package com.assignments;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter operation");
        System.out.println("format: a (+,-,*,/) b");
        float a =  input.nextFloat();
        char op = input.next().charAt(0);
        float b = input.nextFloat();

        if (op == '+') {
            System.out.println(a+b);
            return;
        }
        if (op == '-') {
            System.out.println(a-b);
            return;
        }
        if (op == '*') {
            System.out.println(a*b);
            return;
        }
        if (op == '/') {
            System.out.println(a/b);
            return;
        }
        System.out.println("Invalid operation!!!");
    }
}

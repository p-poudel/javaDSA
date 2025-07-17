package com.assignments;

import java.util.Scanner;

public class Greet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");

        System.out.println("Hello, " + input.next()+"!");
    }
}

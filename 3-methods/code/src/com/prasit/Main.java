package com.prasit;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        return_type name (arguments ) {
            //body
            return statement;
            }
         */
        sum();
    }

    static void sum () {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1 = in.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = in.nextInt();

        System.out.println("Sum = " + (num2 + num1));
    }
    static String greet() {
        return "how are you?";
    }

    static String myGreet(String name) {
        return "Hello" + name;
    }
}

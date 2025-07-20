package com.prasit;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a fruit: ");
        String fruit = in.next();

//        if (fruit.equals("mango")) {
//            System.out.println("King of fruits");
//        }

        // no break condition is required on new switch statement
        switch (fruit) {
            case "mango" -> System.out.println("King of fruits");
            case "apple" -> System.out.println("A sweet red fruit");
            case "Orange" -> System.out.println("Round Fruit");
            case "Grapes" -> System.out.println("Small Fruit");
            default -> System.out.println("Please enter a valid fruit");
        }
    }
}

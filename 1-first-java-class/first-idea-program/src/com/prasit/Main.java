package com.prasit;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hey, How are you?");

        Scanner input = new Scanner(System.in);
        String response = input.nextLine();

        System.out.println(response);
    }
}
package com.prasit;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String in = sc.next();

        for (int i = in.length() - 1; i >= 0; i--) {
            System.out.print(in.charAt(i));
        }
    }
}

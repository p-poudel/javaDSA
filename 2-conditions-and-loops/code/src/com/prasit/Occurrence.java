package com.prasit;

import java.util.Scanner;

public class Occurrence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = in.nextInt();
        System.out.print("Enter the digit to count occurrence: ");
        int n = in.nextInt();
        int count = 0;

        while (num > 0) {
            int rem = num % 10;
            if (rem == n) {
                count ++;
            }
            num /= 10;
        }

        System.out.println(n+" occurs "+count+" times");
    }
}

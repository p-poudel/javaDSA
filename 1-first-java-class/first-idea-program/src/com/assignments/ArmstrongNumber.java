package com.assignments;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter the starting number: ");
        int a = sc.nextInt();
        System.out.print("Enter the ending number: ");
        int b = sc.nextInt();

        int num, order;
        for (; a <= b ; a++) {
            num = a;
            order = 1;
            while (num / 10 != 0) {
                order++;
                num = num / 10;
            }
            num = a;
            int sum = 0;
            while (num > 0) {
                sum = (int) (sum + Math.pow(num % 10,order));
                num = num / 10;
            }
            if (sum == a) {
                System.out.print(a + " ");
            }
        }
    }
}

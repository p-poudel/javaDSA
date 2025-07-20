package com.assignment;

import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        if (isPrime(number)){
            System.out.println("Prime.");
            return;
        }
        System.out.println("Not Prime.");

//        for (int i = 1; i < 100; i++){
//           if (isPrime(i)){
//               System.out.println(i);
//           }
//        }
    }

    public static boolean isPrime(int number) {
        if (number == 1) {
            return false;
        }
        for (int i = 2; i * i <= number; i++){
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}

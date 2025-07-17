package com.assignments;

import java.util.Scanner;

public class NPRtoUSD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value in NPR: ");
        double amount = sc.nextDouble();

        amount = amount / 137.30;
        System.out.println("Equivalent USD: "+amount);
    }
}

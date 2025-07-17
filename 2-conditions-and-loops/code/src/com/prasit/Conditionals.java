package com.prasit;

public class Conditionals {
    public static void main(String[] args) {
        /*
            Syntax of if statements:
             if (boolean expression T or F) {
                //statements
             } else {
                //statements
             }
         */
        int salary = 24000;
        if (salary > 10000) {
            salary += 2000;
        } else {
            salary += 1000;
        }
        System.out.println(salary);
    }
}

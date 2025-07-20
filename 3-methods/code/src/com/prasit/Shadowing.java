package com.prasit;

import java.util.Arrays;

public class Shadowing {
    static int x =90;
    public static void main(String[] args) {
        System.out.println(x);
        int x;
        // scope will begin after initialization
        x= 40; // This shadows previous x
        System.out.println(x);
        fun();
        foo(1,2,4,5,7,9);
    }

    private static void foo(int ...nums) {
        // variable length arguments should be used at last (int x1, int x2, String ...varg)
        //(int x1, String ...varg, int x2) is invalid
        System.out.println(Arrays.toString(nums));
    }

    private static void fun() {
        System.out.println(x);
    }
}

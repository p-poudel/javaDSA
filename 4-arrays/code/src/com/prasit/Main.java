package com.prasit;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
//        System.out.printf("Hello and welcome!");

        int[] rnos = new int[5];
        int[] rnos2 = {32,54,65,76,81};

        for (int i = 0; i < rnos.length; i++) {
            System.out.println(rnos2[i]+'\n'+rnos[i]);
        }

        for(int num : rnos) {
            System.out.println(num);
        }

        System.out.println(Arrays.toString(rnos2));

//        no of rows is mandatory in 2D array
        int[][] arr = new int[3][];
//        no of columns is not mandatory but it is possible to provide its value
    }
}
package com.prasit;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(5);
        // we need not assign object typer in ArrayList<ObjType> but it is not a good practice
        // ObjType cannot be primitives
        // ArrayList list = new ArrayList(); //is also valid

        list.add(67);
        list.add(345);
        list.add(255);
        list.add(678743);
//        list.add(67);
//        list.add(345);
//        list.add(255);
//        list.add(678743);
//        list.add(67);
//        list.add(345);
//        list.add(255);
//        list.add(678743);
//        list.add(67);
//        list.add(345);
//        list.add(255);
//        list.add(678743);
//        list.add(67);
//        list.add(345);
//        list.add(255);
//        list.add(678743);
//        list.add(67);
//        list.add(345);
//        list.add(255);
//        list.add(678743);

        // it can be printed directly
        System.out.println(list);
        System.out.println(list.contains(67));
        System.out.println(list.contains(108));

        list.set(0,99);
        System.out.println(list);

        list.remove(2);

        for(int i = 0; i < 9;i++){
            list.add(sc.nextInt());
        }
        System.out.println(list);

        // to get an item at particular index
        System.out.println(list.get(5));

        // 2D ArrayList
        ArrayList<ArrayList<Integer>> newList = new ArrayList<>();

    }
}

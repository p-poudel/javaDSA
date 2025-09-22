package com.prasit;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int[] nums = {21,45,1231,23,45,-120,45,43,3,64};
        int target = 45;
        int [][] arr = {
                {23,45,23},
                {2,53,765,3},
                {78,92},
                {0,23,73,99}
        };


        System.out.println(linearSearch(nums,target));

        System.out.println(search("Prasit",'a'));

        System.out.println(linearSearch(nums,target,2,7));

        int[] arraySearch = searchIn2DArray(arr,target);
        System.out.println(Arrays.toString(arraySearch));
    }

    // search in the array: return the index if item found
    // otherwise return -1
    static int linearSearch(int[] arr, int target) {
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] == target) {
                return index;
            }
        }

        return  -1;
    }

    static int search(String str, char target) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                return i;
            }
        }
        return -1;
    }

    static int linearSearch(int[] arr, int target, int start, int end) {
        for (int index = start; index < end; index++) {
            if (arr[index] == target) {
                return index;
            }
        }

        return  -1;
    }

    static int[] searchIn2DArray(int[][] array, int target) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == target) {
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
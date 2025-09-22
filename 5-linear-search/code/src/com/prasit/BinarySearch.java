package com.prasit;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {-12,-4,0,34,45,47,61,74,83,98};
        int[] array2 = {98,83,74,61,47,45,34,0,-4,-12};
        int target = 74;

        System.out.println(binarySearch(array,target));
        System.out.println(binarySearch(array2,target));
    }
    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;

        boolean isAsc = arr[end] > arr[start];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target){
                return mid;
            }
            if (isAsc) {
                if (target < arr[mid]){
                    end = mid-1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]){
                    end = mid-1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}

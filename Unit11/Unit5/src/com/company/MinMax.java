package com.company;

public class MinMax {
    public static int min(int[] arr) {
        int result = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < result) {
                result = arr[i];
            }
        }
        return result;
    }

    public static int max(int[] arr) {
        int result = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] > result) {
                result = arr[i];
            }
        }
        return result;
    }
}

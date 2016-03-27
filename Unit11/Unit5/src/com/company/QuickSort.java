package com.company;

public class QuickSort {
    private static int[] arr;

    public static int[] sort(int[] array) {
        arr = array;
        int start = 0;
        int end = arr.length - 1;
        quickSort(start, end);
        return array;
    }

    private static void quickSort(int left, int right) {
        int i = left;
        int j = right;
        int cur = arr[left];

        while(i <= j) {
            while(compare(arr[i], cur) == -1) {
                i++;
            }

            while(compare(arr[j], cur) == 1) {
                j--;
            }

            if(i <= j) {
                change(arr, i++, j--);
            }
        }
        if(left < j) {
            quickSort(left, j);
        }

        if(i < right) {
            quickSort(i, right);
        }
    }

    private static int compare(int a, int b) {
        int result = 0;
        if(a == b) {
            result = 0;
        } else if(a > b) {
            result = 1;
        } else if(a < b) {
            result = -1;
        }
        return result;
    }

    private static void change(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}

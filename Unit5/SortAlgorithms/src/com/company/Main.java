package com.company;

import com.company.QuickSort;

public class Main {

    public static String arrToString(int[] arr) {
        String str = "[";
        for(int i=0; i < arr.length; i++) {
            str += arr[i];
            if(i < arr.length - 1){
                str += ", ";
            }
        }
        str += "]";
        return str;
    }

    public static void main(String[] args) {
	    int[] intArr = new int[20];

        for(int i=0; i < intArr.length; i++) {
            intArr[i] = (int)Math.round(Math.random()*100);
        }

        System.out.println("Before sorting: " + arrToString(intArr));

        QuickSort.sort(intArr);

        System.out.println("After sorting: " + arrToString(intArr));
    }
}

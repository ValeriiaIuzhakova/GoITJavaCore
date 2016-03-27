package com.company;

import org.junit.Assert;
import org.junit.Test;

public class QuickSortTest {

    boolean isArraySorted(int arr[]) {
        for(int i = 0; i < arr.length - 1; i++) {
            if(arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    @Test
    public void testSort() throws Exception {
        int[] intArr = new int[20];

        for(int i=0; i < intArr.length; i++) {
            intArr[i] = (int)Math.round(Math.random()*100);
        }

        QuickSort quickSort = new QuickSort();

        quickSort.sort(intArr);

        Assert.assertTrue(isArraySorted(intArr));
    }
}
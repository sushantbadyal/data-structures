package com.sushantbadyal;

import java.util.List;
import java.util.ListIterator;

public class Util {
    public static void iterateArrayToConsole(int[] valuesToSort) {
        if (null != valuesToSort) {
         for(int value : valuesToSort){
             System.out.print(" "+value);
         }
        }
    }

    public static void swap(int[] arr, int index1, int index2) {
        if (null != arr) {
            int temp = arr[index1];
            arr[index1] = arr[index2];
            arr[index2] = temp;
        }
    }
}

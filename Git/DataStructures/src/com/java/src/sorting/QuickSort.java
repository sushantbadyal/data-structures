package com.java.src.sorting;

import com.sushantbadyal.Util;

public class QuickSort extends Sorting {
    @Override
    public int[] sort(int[] valuesToSort) {
        if(null != valuesToSort){
            quickSort(valuesToSort, 0, valuesToSort.length-1);
        }
        return valuesToSort;
    }

    private void quickSort(int[] valuesToSort, int start, int end){
        if(null != valuesToSort && start < end) {
            int pivotIndex = doPivotPartition(valuesToSort, start, end);
            quickSort(valuesToSort, start, pivotIndex - 1);
            quickSort(valuesToSort, pivotIndex+1, end);
        }
    }

    private int doPivotPartition(int[] arrForPartition, int start, int end){
        int pivotIndex = start;
        if(null != arrForPartition){
         int pivotValue = arrForPartition[end];
         for(int i=start; i<end; i++){
             if(arrForPartition[i] <= pivotValue) {
                 Util.swap(arrForPartition, pivotIndex, i);
                 pivotIndex++;
             }
         }
         Util.swap(arrForPartition, pivotIndex, end);
        }
        return pivotIndex;
    }

}

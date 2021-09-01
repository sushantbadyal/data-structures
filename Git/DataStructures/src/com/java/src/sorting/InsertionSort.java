package com.java.src.sorting;

public class InsertionSort extends Sorting {
    @Override
    public int[] sort(int[] valuesToSort) {
        if(null != valuesToSort){
            int nEntries =  valuesToSort.length;
            for (int i=1; i< nEntries; i++){
                int valueToCompare = valuesToSort[i];
                int toCompareWithIndex = i-1;
                    while(valueToCompare < valuesToSort[toCompareWithIndex] && toCompareWithIndex >=0){
                      valuesToSort[i] = valuesToSort[toCompareWithIndex];
                      valuesToSort[toCompareWithIndex] = valueToCompare;
                      toCompareWithIndex--;
                    }
            }
        }
        return valuesToSort;
    }
}

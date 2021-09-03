package com.java.src.sorting;

public class InsertionSort extends Sorting {
    @Override
    public int[] sort(int[] valuesToSort) {
        if(null != valuesToSort){
            int nEntries =  valuesToSort.length;
            for (int i=1; i< nEntries; i++){
                int valueToCompare = valuesToSort[i], valueToCompareIndex=i;
                int toCompareWithIndex = i-1;
                    while(toCompareWithIndex >=0 && valueToCompare < valuesToSort[toCompareWithIndex] ){
                      valuesToSort[valueToCompareIndex] = valuesToSort[toCompareWithIndex];
                      valuesToSort[toCompareWithIndex] = valueToCompare;
                      toCompareWithIndex--;
                      valueToCompareIndex--;
                    }
            }
        }
        return valuesToSort;
    }
}

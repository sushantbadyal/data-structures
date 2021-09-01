package com.java.src.sorting;

public class BubbleSort extends Sorting {
    @Override
    public int[] sort(int[] valuesToSort) {
        if (null != valuesToSort) {
            int nEntries = valuesToSort.length;
             int temp;
            for (int i = 0; i < nEntries-1; i++) {
              for(int j = 0; j<(nEntries-(i+1)); j++){
                  if(valuesToSort[j+1]<valuesToSort[j]){
                      temp = valuesToSort[j+1];
                      valuesToSort[j+1]=valuesToSort[j];
                      valuesToSort[j]=temp;
                  }
              }
            }
        }
        return valuesToSort;
    }
}

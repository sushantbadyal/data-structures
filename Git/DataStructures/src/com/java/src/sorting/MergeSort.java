package com.java.src.sorting;

public class MergeSort extends Sorting {
    @Override
    public int[] sort(int[] valuesToSort) {
        if(null != valuesToSort)
          divideAndMergeSort(valuesToSort);
        return valuesToSort;
    }

    private void divideAndMergeSort(int[] valuesToSort){
     if(null != valuesToSort && valuesToSort.length < 2)
         return;
     else {
         int nEntries = valuesToSort.length;
         int midIndex = (int)Math.floor(nEntries/2);
         int[] leftArr = new int[midIndex];
         int[] rightArr = new int[nEntries-midIndex];
         for(int i=0; i<midIndex;i++){
             leftArr[i] = valuesToSort[i];
         }
         for(int i=midIndex; i<nEntries; i++){
             rightArr[i-midIndex] = valuesToSort[i];
         }
         divideAndMergeSort(leftArr);
         divideAndMergeSort(rightArr);
         mergeSort(leftArr, rightArr, valuesToSort);
     }
    }

    private void mergeSort(int[] leftArr, int[] rightArr, int[] valuesToSort){
        if(null != leftArr && null != rightArr && null != valuesToSort){
            int leftArrLength = leftArr.length;
            int rightArrLength = rightArr.length;
            int leftIndex=0,rightIndex=0, valuesToSortIndex=0;
            while(leftIndex < leftArrLength && rightIndex < rightArrLength){
                if (leftArr[leftIndex] <= rightArr[rightIndex]) {
                    valuesToSort[valuesToSortIndex] = leftArr[leftIndex];
                    leftIndex++;
                }
                    else{
                    valuesToSort[valuesToSortIndex] = rightArr[rightIndex];
                    rightIndex++;
                }
                valuesToSortIndex++;
            }
              while(leftIndex < leftArrLength){
                  valuesToSort[valuesToSortIndex] = leftArr[leftIndex];
                  leftIndex++;
                  valuesToSortIndex++;
              }
              while(rightIndex < rightArrLength){
                  valuesToSort[valuesToSortIndex] = rightArr[rightIndex];
                  rightIndex++;
                  valuesToSortIndex++;
              }

        }
    }

}

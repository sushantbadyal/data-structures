package com.sushantbadyal;

import com.java.src.sorting.BubbleSort;
import com.java.src.sorting.InsertionSort;
import com.java.src.sorting.MergeSort;
import com.java.src.sorting.QuickSort;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	   Scanner input = new Scanner(System.in);
         String inputStr = input.nextLine();
        String[] inputArr = inputStr.split(" ");
        int[] valuesToSort = new int[inputArr.length];
        for (int i=0; i<inputArr.length; i++){
            try {
                valuesToSort[i] = Integer.parseInt(inputArr[i]);
            }
            catch (NumberFormatException e){
                System.out.println("Warning: "+e.getMessage());
                //todo: avoid continue for last iteration
                continue;
            }
        }
        System.out.println("Bubble Sort:");
        Util.iterateArrayToConsole(new BubbleSort().sort(valuesToSort.clone()));
        System.out.println("\nInsertion Sort:");
        Util.iterateArrayToConsole(new InsertionSort().sort(valuesToSort.clone()));
        System.out.println("\nMerge Sort:");
        Util.iterateArrayToConsole(new MergeSort().sort(valuesToSort.clone()));
        System.out.println("\nQuick Sort:");
        Util.iterateArrayToConsole(new QuickSort().sort(valuesToSort.clone()));
    }
}

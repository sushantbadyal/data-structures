package com.sushantbadyal;

import com.java.src.sorting.BubbleSort;
import com.java.src.sorting.InsertionSort;

import java.util.ArrayList;
import java.util.List;
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
                System.out.println("ERROR: "+e.getMessage());
                //todo: avoid continue for last iteration
                continue;
            }
        }
        System.out.println("Bubble Sort:");
        Util.iterateArrayToConsole(new BubbleSort().sort(valuesToSort));
        System.out.println("\nInsertion Sort:");
        Util.iterateArrayToConsole(new InsertionSort().sort(valuesToSort));
    }
}

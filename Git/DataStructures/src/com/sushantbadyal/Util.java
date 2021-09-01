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
}

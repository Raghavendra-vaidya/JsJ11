package com.rkv.programs.sep13;

import java.util.Arrays;

public class Arraysep13 {

    public static void printArrayElements(String[] s){
        for (String st:s) {
            System.out.print(st+" ");
        }
        System.out.println("");
    }
    public static void sortStringArray(String[] s){
        System.out.println("Without sorted");
        printArrayElements(s);
        System.out.println("sorted");
        Arrays.sort(s);
        printArrayElements(s);
        System.out.println("sorted case insensitive order");
        Arrays.sort(s,String.CASE_INSENSITIVE_ORDER);
        printArrayElements(s);
    }

    public static void main(String[] args) {
        String[] s = {"Shridevi","Ashwini", "bhargavi","Raghu","amma","aayu"};
        sortStringArray(s);
    }
}

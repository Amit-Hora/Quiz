package com.codefriend.quiz;

import java.util.Scanner;

public class BuublSorting_Bubble_Sort {
    public int i, j, temp = 0, numSwaps = 0, firstElement = 0, lastElement = 0;

    public String[] bubbleSort(String[] list) {
        for (i = 0; i < list.length; i++) {
            for (j = 0; j < list.length - 1; j++) {
                if (j == 0) {
                    firstElement = Integer.parseInt(list[j]);
                }
                if (Integer.parseInt(list[j]) > Integer.parseInt(list[j + 1])) {
                    temp = Integer.parseInt(list[j + 1]);
                    list[j + 1] = list[j];
                    list[j] = "" + temp;
//                    list[j] = String.valueOf(temp) ;
                    numSwaps++;
                }
                lastElement = Integer.parseInt(list[j + 1]);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Integer numOfElement = Integer.parseInt(in.nextLine());
        String nextline = in.nextLine();
        String[] values = nextline.split(" ");


        BuublSorting_Bubble_Sort sbs = new BuublSorting_Bubble_Sort();
        sbs.bubbleSort(values);
//        desire ouput format
        System.out.println("Array is sorted in " + sbs.numSwaps + " swaps.");
        System.out.println("First Element: " + sbs.firstElement);
        System.out.println("Last Element: " + sbs.lastElement);
    }
}
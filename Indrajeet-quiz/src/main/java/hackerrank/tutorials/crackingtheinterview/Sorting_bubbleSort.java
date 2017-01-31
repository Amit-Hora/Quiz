package hackerrank.tutorials.crackingtheinterview;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by IGour on 1/30/2017.
 */
public class Sorting_bubbleSort {
    public int i, j, temp = 0, numSwaps = 0;


    public int[] bubbleSort(int[] list) {

        for (i = 0; i < list.length; i++) {
            for (j = 0; j < list.length - 1; j++) {

                if (list[j] > list[j + 1]) {
                    temp = list[j + 1];
                    list[j + 1] = list[j];
                    list[j] = temp;
                    numSwaps++;
                }

            }
        }
        return list;
    }

    public static void main(String[] args) {
        Sorting_bubbleSort sbs = new Sorting_bubbleSort();
        int[] ip = {5, 10, 1, 3, 2, 7, 9, 6};
        ArrayList<Integer> al = new ArrayList<Integer>();
        System.out.println("Old int array : " + Arrays.toString(ip));

        sbs.bubbleSort(ip);
        // to print array element without iterate
        System.out.println("New int array : " + Arrays.toString(ip));
        System.out.println("Array is sorted in " + numSwaps + " swaps.");
        System.out.println("First Element: firstElement, where  is the first element in the sorted array.");

    }
}
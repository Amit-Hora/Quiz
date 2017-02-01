package hackerrank.tutorials.crackingtheinterview;

import java.util.Scanner;

/**
 * Created by IGour on 1/30/2017.
 * problem url : https://www.hackerrank.com/challenges/ctci-bubble-sort
 */
public class Sorting_bubbleSort_withString {
    public int i, j, temp = 0, numSwaps = 0;
    String firstElement = null, lastElement = null,justkeepval;

    public String[] bubbleSort(String[] list) {
        for (i = 0; i < list.length; i++) {
            for (j = 0; j < list.length - 1; j++) {
                justkeepval=list[j+1];
                if (j == 0) {
                    firstElement = list[j];
                }
                int result = list[j].compareTo(list[j + 1]);

//                if (Integer.parseInt(list[j]) > Integer.parseInt(list[j + 1])) {
                if (result > 0) {
                    temp = Integer.parseInt(list[j + 1]);
                    list[j + 1] = list[j];
//                    list[j] = "" + temp;
                    list[j] = String.valueOf(temp) ;
                    list[j] = Integer.toString(temp) ;
                    numSwaps++;
                }
                lastElement = justkeepval;
            }
        }
        return list;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Integer numOfElement = Integer.parseInt(in.nextLine());
        String nextline = in.nextLine();
        String[] values = nextline.split(",");
//        int[] ip = {5, 10, 1, 3, 2, 7, 9, 6};
//        ArrayList<Integer> al = new ArrayList<Integer>();
//        System.out.println("Old int array : " + Arrays.toString(ip));
//         to print array element without iterate
//        System.out.println("New int array : " + Arrays.toString(ip));

        Sorting_bubbleSort_withString sbs = new Sorting_bubbleSort_withString();
        sbs.bubbleSort(values);
//        desire ouput format
        System.out.println("Array is sorted in " + sbs.numSwaps + " swaps.");
        System.out.println("First Element: " + sbs.firstElement);
        System.out.println("Last Element: " + sbs.lastElement);
    }
}
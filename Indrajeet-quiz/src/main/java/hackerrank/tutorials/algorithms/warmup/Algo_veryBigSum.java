package hackerrank.tutorials.algorithms.warmup;

/**
 * Created by IGour on 1/25/2017.
 */


import java.util.Arrays;
import java.util.Scanner;

public class Algo_veryBigSum {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String n = in.nextLine();

        String arr[] = new String[Integer.parseInt(n)];


        String numLine = in.nextLine();
        System.out.println(numLine.toString());

        arr = numLine.split(" ");
        System.out.println(Arrays.toString(arr));

        int sum = 0;

        for (int arr_i = 0; arr_i < Integer.parseInt(n); arr_i++) {
            //arr[arr_i] = in.nextInt();
            System.out.println(arr[arr_i]);
            sum += Integer.parseInt(arr[arr_i]);
            //sum = Integer.valueOf(new Integer(sum).intValue() + new Integer((arr[arr_i])).intValue());
            System.out.print("sum iterate " + sum);

        }
        System.out.print(sum);
    }
}

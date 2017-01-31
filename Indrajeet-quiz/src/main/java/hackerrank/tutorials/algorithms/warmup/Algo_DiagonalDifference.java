package hackerrank.tutorials.algorithms.warmup;
import java.util.Scanner;

/**
 * Created by IGour on 1/28/2017.
 * problem : https://www.hackerrank.com/challenges/diagonal-difference
 */
public class Algo_DiagonalDifference {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        int sum_first_dia = 0, sum_second_dia = 0;
        int a[][] = new int[n][n];
        for (int a_i = 0; a_i < n; a_i++) {
            for (int a_j = 0; a_j < n; a_j++) {
                a[a_i][a_j] = in.nextInt();
                if (a_i == a_j) {
                    sum_first_dia += a[a_i][a_j];
//                    System.out.println("printing sum_first_dia the each element " + "on " + a_i + a_j + " : " + a[a_i][a_j]);
                }
                if (a_j == n - 1 - a_i) {
                    sum_second_dia += a[a_i][a_j];
//                    System.out.println("printing sum_second_dia the each element " + "on " + a_i + a_j + " : " + a[a_i][a_j]);
                }
            }
        }
//        System.out.println("first diagonal sum : " + sum_first_dia);
//        System.out.println("Second diagonal sum : " + sum_second_dia);
        int diff = sum_second_dia-sum_first_dia;
        if ((diff) > 0 )
            System.out.println(diff);
        else
            System.out.println((diff) * -1);
// print matrix
        for (int a_i = 0; a_i < n; a_i++) {
            for (int a_j = 0; a_j < n; a_j++) {
//                System.out.println("printing the each element " + "on " + a_i + a_j + " : " + a[a_i][a_j]);
            }
        }
    }
}

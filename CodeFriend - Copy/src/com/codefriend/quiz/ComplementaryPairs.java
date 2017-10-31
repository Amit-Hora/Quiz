package com.codefriend.quiz;

import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Logger;

public class ComplementaryPairs {
	private static final transient Logger logger = Logger.getLogger(ComplementaryPairs.class.getName());

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the value for K");
		int k = scanner.nextInt();
		int carray[] = { 2, 4, 8, 7, 1, 8 };

		Arrays.sort(carray);



		for (int i = 0; i < carray.length - 1; i++) {
			int indexsearched = Arrays.binarySearch(carray, i, carray.length, Math.abs(carray[i] - k));
			if (indexsearched > 0) {
				System.out.println(i + "   ,  " + indexsearched);
				/*
				 * while loop can be removed, if we remove the duplicates 
				 * from the array
				 */
				while (indexsearched > 0) {

					indexsearched = Arrays.binarySearch(carray, indexsearched + 1, carray.length,
							Math.abs(carray[i] - k));
					if (indexsearched > 0) {
						System.out.println(i + "   ,  " + indexsearched);
					}
				}
			}
		}

	}

}

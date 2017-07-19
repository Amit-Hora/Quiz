package com.codefriend.quiz;

import java.util.*;

public class MergeSort {
	private int[] array;
	private int[] tmparray;
	private int len;
	static long inverseCount = 0;
	public long[] result;

	public static void main(String[] args) {
		MergeSort qt = new MergeSort();
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		qt.result = new long[testCase];
		for (int k = 0; k < testCase; k++) {
			int size = sc.nextInt();
			// String[] list = sc.nextLine().split(" ");
			int[] numlist = new int[size];
			for (int i = 0; i < size; i++) {
				numlist[i] = sc.nextInt();
			}
			qt.sort(numlist);
			qt.result[k] = inverseCount;
			inverseCount = 0;
		}
		for (long num : qt.result) {
			System.out.println(num);
		}

	}

	public void sort(int[] arr) {
		this.array = arr;
		this.len = arr.length;
		this.tmparray = new int[this.len];
		mergeSort(0, this.len - 1);
		// print();
		// System.out.println(" Count "+inverseCount);
	}

	private void mergeSort(int startIdx, int endIdx) {
		if (startIdx < endIdx) {
			int middle = startIdx + (endIdx - startIdx) / 2;
			mergeSort(startIdx, middle);
			mergeSort(middle + 1, endIdx);
			doMerge(startIdx, middle, endIdx);
		}
	}

	private void doMerge(int startIdx, int middleIdx, int endIdx) {
		int i = startIdx;
		int j = middleIdx + 1;
		int k = startIdx;
		for (int l = startIdx; l <= endIdx; l++) {
			tmparray[l] = array[l];
		}
		while (i <= middleIdx && j <= endIdx) {
			if (tmparray[i] <= tmparray[j]) {
				array[k] = tmparray[i];
				i++;

			} else {

				array[k] = tmparray[j];
				j++;
				inverseCount += middleIdx - i + 1;
			}

			k++;
		}
		while (i <= middleIdx) {
			array[k] = tmparray[i];
			i++;
			k++;
		}
		while (j <= endIdx) {
			array[k] = tmparray[j];
			j++;
			k++;
		}

	}
}

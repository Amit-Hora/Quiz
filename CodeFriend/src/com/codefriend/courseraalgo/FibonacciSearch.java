package com.codefriend.courseraalgo;

public class FibonacciSearch {

	public static void main(String[] args) {
		int arr[] = { 10, 22, 35, 40, 45, 50, 80, 82, 85, 90, 100 };
		int n = arr.length;
		int x = 85;
		System.out.println("Found at index: ," + fibMonaccianSearch(arr, x, n));

	}

	private static int fibMonaccianSearch(int[] arr, int x, int n) {

		int offset = -1;
		int fibM1 = 1;
		int fibM2 = 0;
		int fibM = fibM1 + fibM2;

		while (fibM < x) {

			fibM2 = fibM1;
			fibM1 = fibM;
			fibM = fibM1 + fibM2;

		}

		while (fibM > 1) {

			int i = Math.min(offset + fibM, n - 1);

			if (arr[i] < x) {

				fibM = fibM1;
				fibM1 = fibM2;
				fibM2 = fibM - fibM1;

				offset = i;
			}

			if (arr[i] > x) {

				fibM = fibM2;
				fibM1 = fibM1 - fibM2;
				fibM2 = fibM - fibM1;

			}

			if (arr[i] == x) {
				return i;

			}

		}
		if (fibM == 1 && arr[offset+1] ==x) {
			return offset+1;
		}
		return -1;
	}

}

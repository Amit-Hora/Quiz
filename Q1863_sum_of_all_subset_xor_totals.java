package leetcode.easy;

import java.util.ArrayList;

public class Q1863_sum_of_all_subset_xor_totals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] { 5,1 };
		int[][] subseq = new int[(int) Math.pow(2, arr.length)][arr.length];
		ArrayList<Integer> path = new ArrayList<>();
	       
	      printSubsequences(arr, 0, path);

	}

	public static void printSubsequences(int[] arr, int index, ArrayList<Integer> path) {

		// Print the subsequence when reach
		// the leaf of recursion tree
		if (index == arr.length) {

			// Condition to avoid printing
			// empty subsequence
			if (path.size() > 0)
				System.out.println(path);
		}

		else {

			// Subsequence without including
			// the element at current index
			printSubsequences(arr, index + 1, path);

			path.add(arr[index]);

			// Subsequence including the element
			// at current index
			printSubsequences(arr, index + 1, path);

			// Backtrack to remove the recently
			// inserted element
//			path.remove(path.size() - 1);
		}
		return;
	}

	private static void printArray() {
		// TODO Auto-generated method stub

	}

	public static int subsetXORSum(int[] nums) {
		int output = 0;
		for (int i = 0; i < nums.length; i++) {
			for (int j = i; j < nums.length; j++) {
				int xorsum = 0;
				for (int k = i; k <= j; k++) {
					xorsum = xorsum ^ nums[k];
					System.out.print(nums[k] + " ");
				}
				System.out.println("XOR " + xorsum);
				System.out.println(" ");
				output = output + xorsum;
			}

		}
		System.out.println(output);
		return output;
	}

}

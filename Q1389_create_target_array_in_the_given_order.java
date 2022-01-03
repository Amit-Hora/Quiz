package leetcode.easy;

import java.util.Arrays;

public class Q1389_create_target_array_in_the_given_order {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int[] createTargetArray(int[] nums, int[] index) {
		int n = nums.length;

		int ans[] = new int[n];

		Arrays.fill(ans, -1);

		for (int i = 0; i < n; i++) {
			// int i = 0;
			int num = nums[i];
			int ind = index[i];

			fillarray(ans, ind, num);

		}
		return ans;
	}

	public void fillarray(int[] ans, int i, int n) {
		if (ans[i] == -1) {
			ans[i] = n;
		} else {
			fillarray(ans, i + 1, ans[i]);

			ans[i] = n;
		}
	}

}

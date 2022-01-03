package leetcode.easy;

import java.util.Arrays;

public class Q1913_maximum_product_difference_between_two_pairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        return (nums[nums.length-1]*nums[nums.length-2]) - (nums[0]*nums[1]);
        
    }
}

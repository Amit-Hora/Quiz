package leetcode.easy;

public class Q1920_build_array_from_permutation {
	
	public static void main(String args[]) {
		
	
	}

	public static  int[] buildArray(int[] nums) {
		int[] result=new int[nums.length];
		for(int i=0;i<nums.length;i++) {
			
			result[i] = nums[nums[i]];
		}
		
		return result;

	}

}

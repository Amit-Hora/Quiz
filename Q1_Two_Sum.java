package leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class Q1_Two_Sum {

	public static void main(String args[]) {
		
				
		int[] result = twoSum(new int[] {3,2,4}, 6);
		for(int i : result) {
			System.out.println(i);
		}
		
	}
	
	 public  static int[] twoSum(int[] nums, int target) {
		 
		 Map<Integer,Integer> vtoi = new HashMap<Integer,Integer>();
		 
		 for(int i=0;i<nums.length;i++) {
		 int complement = target - nums[i];
		 
		 if(vtoi.containsKey(complement)) {
			 
			 return new int[] {i,vtoi.get(complement)};
		 }
		 else {
			 vtoi.put(nums[i], i);
		 }
	
		 }
		 
		 return null;
		 
	 }
}

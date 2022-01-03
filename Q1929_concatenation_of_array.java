package leetcode.easy;

public class Q1929_concatenation_of_array {

	public static void main(String args[]) {

	}

	public static  int[] getConcatenation(int[] nums) {
		
		int twice[] = new int[2*nums.length];
		
		for(int i =0 , j=0 ;i < twice.length ;i++) {
			
			if(j >= nums.length) {
				j=0;
			}
			twice[i] = nums[j];
			j++;
		}
		
		return twice;

	}
	
public static  int[] getConcatenation1(int[] nums) {
		
		int twice[] = new int[2*nums.length];
		
		for(int i =0 ;i < nums.length ;i++) {
			
			twice[i] = twice[i+nums.length]=nums[i];
		}
		
		return twice;

	}
}

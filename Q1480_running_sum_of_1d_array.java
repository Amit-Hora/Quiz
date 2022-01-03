package leetcode.easy;

public class Q1480_running_sum_of_1d_array {
	public static void main(String args[]) {

	}

	public int[] runningSum(int[] nums) {

        
        int sum = 0;
        for(int i=0 ;i < nums.length;i++){
            
            sum+=nums[i];
            nums[i] =sum;
        }
        return nums;

	}

}

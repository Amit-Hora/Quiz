package leetcode.easy;

public class Q1470_shuffle_the_array {
	public static void main(String args[]) {

	}

	  public int[] shuffle(int[] nums, int n) {
	
		  int tmp[] = new int[nums.length];
	        for(int i=0,k=0;k<nums.length;i++){
	         tmp[k] = nums[i];
	         tmp[k+1] =nums[i+n];
	         k=k+2;
	        }
	        
	        return tmp;
	        
	    }


}

package leetcode.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q1365_how_many_numbers_are_smaller_than_the_current_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	  public int[] smallerNumbersThanCurrent(int[] nums) {
		  
		  int[] output = new int[nums.length];
	        List<Integer> nums_copy = new ArrayList<Integer>();
	        for ( int i = 0 ; i < nums.length ; i++ )
	        {
	             nums_copy.add(nums[i]);
	        }
	        Collections.sort(nums_copy);
	        //System.out.println(Arrays.toString(nums));
	        //System.out.println(nums_copy);
	        for(int i=0;i<nums.length;i++)
	        {
	            output[i] = nums_copy.indexOf(nums[i]);
	        }    
	        return output;
		  
	  }
	  
	  public int[] smallerNumbersThanCurrent1(int[] nums) {
	        
		  int [] out = new int[nums.length];
		for(int i=0 ;i <nums.length;i++){
            int count =0;
            for( int j =0;j <nums.length;j++){
                
                if(nums[i]>nums[j])
                count++;
            }
            out[i] =count;
        }
	    
            return out;
        
    }
	  
	  

}

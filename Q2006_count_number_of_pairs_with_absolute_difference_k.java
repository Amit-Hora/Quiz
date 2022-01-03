package leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class Q2006_count_number_of_pairs_with_absolute_difference_k {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public int countKDifference(int[] nums, int k) {

         Map<Integer,Integer> map = new HashMap<>();
        for( int val:nums){
            
            map.put(val,map.getOrDefault(val,0)+1);
        }
        int result=0;
        for(int val:nums){
            map.put(val,map.get(val)-1);
            result=result+map.getOrDefault(val+k,0)+map.getOrDefault(val-k,0);
        }
        return result;
	        
	    }

}

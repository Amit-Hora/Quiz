package leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class Q1512_numbe_of_good_pairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int numIdenticalPairs(int[] nums) {
		
		int tmp[] = new int[101];
		int count =0;
		for( int num:nums) {
			
			count+=tmp[num]++;
		}
		return count;
	}

}

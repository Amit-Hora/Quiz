package leetcode.easy;

import java.util.Arrays;

public class Q1874_minimize_product_sum_of_two_arrays {

}
class Solution {
    public int minProductSum(int[] nums1, int[] nums2) {
        
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int minsum=0;
       
        for( int i=0,j=nums1.length-1;i<nums1.length;i++,j--){
            
            minsum+=nums1[i]*nums2[j];
            
        }
         // minsum+=nums1[i]*nums2[j];
        return minsum;
        
    }
}
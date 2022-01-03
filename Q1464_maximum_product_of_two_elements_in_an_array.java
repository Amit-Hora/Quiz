package leetcode.easy;

public class Q1464_maximum_product_of_two_elements_in_an_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(maxProduct(new int[]{3,4,5,2}));
		System.out.println(maxProduct(new int[]{1,5,4,5}));
		System.out.println(maxProduct(new int[]{3,7}));
		System.out.println(maxProduct(new int[]{2,1,4,3,5}));
	}

	public static int maxProduct(int[] nums) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        
        for(int i=0;i<nums.length;i++) {
        	
        	if(max1 < nums[i]) {
        		
        		if(i!=0 && max2<max1) {
        			max2 = max1;
        		}
        		max1 = nums[i];
        	}else if(max2 < nums[i]) {
        		max2 = nums[i];
        		
        	}
        }
     return (max2-1) * (max1-1);   
    }
}

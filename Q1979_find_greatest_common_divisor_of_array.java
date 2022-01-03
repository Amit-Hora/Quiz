package leetcode.easy;

public class Q1979_find_greatest_common_divisor_of_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public int findGCD(int[] nums) {
	        int max = Integer.MIN_VALUE;
	        int min = Integer.MAX_VALUE;
	        for( int ele:nums){
	            if(max < ele){
	                max = ele;
	            }
	            if (min > ele){
	                min = ele;
	            }
	        }
	        
	        int gcd=1;
	        for( int i=1;i<=min;i++){
	            
	            if(min%i==0 && max%i==0){
	                if(gcd<=i) gcd=i;
	            }
	        }
	        return gcd;
	        
	    }
}

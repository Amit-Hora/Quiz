package leetcode.easy;

public class Q1588_sum_of_all_odd_length_subarrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int sumOddLengthSubarrays(int[] arr) {
        
    int times [] = new int[arr.length];
    for( int i=0;i< arr.length;i++){
         int timesappread = ((arr.length-i) * (i+1));
        if (timesappread % 2 != 0)
        times[i] = timesappread/2 +1;
        else
            times[i]=timesappread/2;
    }
      
        int sum=0;
        for(int i=0;i<arr.length;i++){
           
           
            sum+=times[i]*arr[i];
        }
        
    return sum;        
    }

}

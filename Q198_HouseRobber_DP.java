public class Q198_HouseRobber_DP {
    public static void main(String args[]){
        Q198_HouseRobber_DP obj = new Q198_HouseRobber_DP();
        int count = obj.rob(new int[]{2,7,9,3,1});
        System.out.println(count);
    }

    public int rob(int[] nums) {
        if(nums.length ==0) return 0;
        // standard initliaze the dp array with length of nums
        int dp [] = new int[nums.length+1];
        //standar the first element is 0 the second is the first element of nums
        dp[0] = 0;
        dp[1] = nums[0];
        // standard of dp loop through the nums
        for(int i = 1; i< nums.length; i++){

            dp[i+1] = Math.max(dp[i],dp[i-1]+nums[i]);
        }
        // standard return the last element of dp
        return dp[nums.length];
    }
}

import java.util.Arrays;

public class Q1877_MInimize {

    /**
     * Leet code Q link - https://leetcode.com/problems/minimize-maximum-pair-sum-in-array/
     */

    public int minPairSum(int[] nums) {

        int result = 0;
        Arrays.sort(nums);
        for(int i =0 ;i <nums.length/2 ;i++){

            int pairedSum = nums[i] + nums[nums.length -1 -i];
            result = Math.max(result,pairedSum);
        }

        return result;

    }
}

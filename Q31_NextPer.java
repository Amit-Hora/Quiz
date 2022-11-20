public class Q31_NextPer {


    void nextPermutation(int[] nums) {

        int i = nums.length - 2;
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }
        if (i >= 0) // swap numbers
        {
          int j = nums.length-1;
          while(j>=0 && nums[j] <= nums[i]) j--;
          swap(nums,i,j);
        }

        reverse(nums,i+1);

    }

    void swap(int[] nums, int i , int j){
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;

    }

    void reverse(int[]nums,int i){
        int j = nums.length-1;
        while(i<j){
            swap(nums,i,j);
            i++;
            j--;
        }
    }
}

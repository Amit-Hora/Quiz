public class Q1480_Running_Sum_One {

    public static void main(String args[]){
        Q1480_Running_Sum_One obj = new Q1480_Running_Sum_One();

        int[] sum = obj.runningSum(new int[]{1,2,3,4});
        System.out.println(sum);
    }

    public int[] runningSum(int[] nums) {

        int[] runsum = new int[nums.length];
        runsum[0] = nums[0];

        for(int i =1 ;i <nums.length;i++){
            runsum[i]=runsum[i-1]+nums[i];
        }

        return runsum;

    }
}

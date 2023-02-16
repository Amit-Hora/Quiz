public class Q724_Find_Pivot_Index {

    public static void main(String args[]){

        Q724_Find_Pivot_Index  obj = new Q724_Find_Pivot_Index();
        int index = obj.pivotIndex(new int[]{1,7,3,6,5,6});
        System.out.println(index);
    }

    public int pivotIndex(int[] nums) {
        int total_sum =0;
        for(int n:nums){
            total_sum+=n;
        }

        int left_sum =0;
        for(int i=0;i<nums.length;i++){
            if(i!=0) left_sum+=nums[i-1];
            if(total_sum-nums[i]-left_sum==left_sum) return i;
        }
        return -1;
    }


}

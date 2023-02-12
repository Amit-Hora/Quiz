import java.util.HashMap;
import java.util.Map;

public class Q454_4Sum2 {


    public static void main(String args[]){
        Q454_4Sum2 obj = new Q454_4Sum2();
        int[] nums1 = {1,2};
        int[] nums2 = {-2,-1};
        int[] nums3 = {-1,2};
        int[] nums4 = {0,2};

        int count = obj.fourSumCount(nums1,nums2,nums3,nums4);
    }
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {

        Map<Integer,Integer> nums1_nums2 = new HashMap<>();
        int count =0;
        for(int i:nums1){
            for(int j:nums2){
                nums1_nums2.put((i+j),nums1_nums2.getOrDefault((i+j),0)+1);
            }
        }

        for (int i: nums3){
            for(int j: nums4){
                count+=nums1_nums2.getOrDefault(-(i+j),0);
            }
        }

        return  count;
    }
}

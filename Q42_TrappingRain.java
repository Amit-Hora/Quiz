public class Q42_TrappingRain {

    public int trap(int[] height) {

        int length = height.length;
//        int maxLeft = height[0];
        int maxRight = height[length-1];
        int totalWater = 0;
        int[] left = new int[length];
        left[0] = height[0];
        int[] right = new int[length];
        right[length-1] = height[length-1];

        // get max left
        for(int i=1 ;i<length;i++){

            left[i] = Math.max(left[i-1],height[i]);
        }


        // get max right
        for(int i=length-2 ;i>=0;i--){
            right[i] = Math.max(height[i],right[i+1]);
        }

        for(int i = 1;i<length;i++){
            totalWater+=Math.abs(Math.min(left[i],right[i])-height[i]);
        }
        return totalWater;
    }
}

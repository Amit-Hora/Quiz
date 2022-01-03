package leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class Q1213_intersection_of_three_sorted_arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public List<Integer> arraysIntersection(int[] arr1, int[] arr2, int[] arr3) {
        int max = 0;
        if (max < arr1[arr1.length-1]) max = arr1[arr1.length-1];
        if (max < arr2[arr2.length-1]) max = arr2[arr2.length-1];
        if (max < arr3[arr3.length-1]) max = arr3[arr3.length-1];
        int[] intersection = new int[max+1];
        List<Integer> result = new ArrayList<>();
        
        for(int ele:arr1){
            intersection[ele]++;
        }
        for(int ele:arr2){
            intersection[ele]++;
        }
        for(int ele:arr3){
            intersection[ele]++;
            if(intersection[ele]==3)
                result.add(ele);
        }
        return result;
        
    }
}

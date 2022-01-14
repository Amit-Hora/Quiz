package leetcode.easy;

import java.util.Arrays;

public class Q1637_widest_vertical_area_between_two_points_containing_no_points {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	class Solution {
	    public int maxWidthOfVerticalArea(int[][] points) {
	        
	        int[] x = new int[points.length];
	        for(int i=0;i<points.length;i++){
	         x[i]=points[i][0];
	        }
	        Arrays.sort(x);
	        
	        int diff= Integer.MIN_VALUE;
	       for(int i=0;i<x.length-1;i++){
	           
	           int pointsdiff=x[i+1]-x[i];
	           diff=Math.max(diff,pointsdiff);
	           
	       }
	        return diff;
	        
	    }
	}
}

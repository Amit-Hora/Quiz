package leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class Q1762_buildings_with_ocean_view {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	class Solution {
	    public int[] findBuildings(int[] heights) {
	        int tallestBuilding=heights[heights.length-1];
	        List<Integer> res = new ArrayList<Integer>();
	        res.add(heights.length-1);
	        
	        for(int i=heights.length-1;i>=0;i--){
	            if(heights[i]>tallestBuilding){
	                tallestBuilding=heights[i];
	                res.add(0,i);
	             
	            }
	            
	            
	        }
	       int[] resin=new int[res.size()];
	       
	        int j=0;
	        for (int i:res){
	            resin[j]=i;
	            j++;
	        }
	        return resin;
	    }
	}

}

package leetcode.easy;

public class Q807_max_increase_to_keep_city_skyline {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	class Solution {
	    public int maxIncreaseKeepingSkyline(int[][] grid) {
	         int N = grid.length;
	        
	        int[] rowMaxes = new int[N];
	        int[] colMaxes = new int[N];
	        
	         for (int r = 0; r < N; ++r){
	             
	              for (int c = 0; c < N; ++c) {
	               
	                  
	                  rowMaxes[r]=Math.max(rowMaxes[r],grid[r][c]);
	                    colMaxes[c] = Math.max(colMaxes[c], grid[r][c]);
	              }
	             
	         }
	        
	        
	        
	              int ans = 0;
	        for (int r = 0; r < N; ++r)
	            for (int c = 0; c < N; ++c)
	                ans += Math.min(rowMaxes[r], colMaxes[c]) - grid[r][c];

	        return ans;
	            
	            
	        
	        
	    }
	}
	
	
}

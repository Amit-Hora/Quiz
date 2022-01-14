package leetcode.easy;

public class Q654_maximum_binary_tree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	/**
	 * Definition for a binary tree node.
	 * public class TreeNode {
	 *     int val;
	 *     TreeNode left;
	 *     TreeNode right;
	 *     TreeNode() {}
	 *     TreeNode(int val) { this.val = val; }
	 *     TreeNode(int val, TreeNode left, TreeNode right) {
	 *         this.val = val;
	 *         this.left = left;
	 *         this.right = right;
	 *     }
	 * }
	 */
	class Solution {
	    public TreeNode constructMaximumBinaryTree(int[] nums) {
	        
	        return constructTree(nums,0,nums.length-1);
	        
	    }
	    
	    TreeNode constructTree(int[]nums,int start,int end){
	        
	        if(end==start) return new TreeNode(nums[start]);
	        if(start>end) return null;
	        int index = getMaxIndex(nums,start,end);
	  
	        TreeNode root= new TreeNode(nums[index]);
	      
	        root.left=constructTree(nums,start,index-1);
	        root.right=constructTree(nums,index+1,end);
	        return root;
	    }
	    
	    int getMaxIndex(int[] nums,int start,int end){
	        
	        int max=Integer.MIN_VALUE;
	        int maxindex=0;
	        for(int i=start;i<=end;i++){
	            
	            if(max<nums[i]){
	                maxindex=i;
	                max=nums[i];
	            }
	        }
	        return maxindex;
	        
	    }
	}
}

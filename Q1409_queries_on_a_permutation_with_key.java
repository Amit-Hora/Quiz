package leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class Q1409_queries_on_a_permutation_with_key {
	class Solution {
	    public int[] processQueries(int[] queries, int m) {
	        
	        List<Integer> ls = new ArrayList<>();
	        for(int i=1;i<=m;i++){
	            
	            ls.add(i);
	        }
	        int []res = new int[queries.length];
	         
	        for(int i=0;i<queries.length;i++){
	            
	            res[i]=ls.indexOf(queries[i]);
	           // System.out.println(queries[i]+" index is "+res[i]);
	            ls.remove(new Integer(queries[i]));
	           
	            ls.add(0,queries[i]);
	            
	        }

	        return res;
	        
	    }
	}

}

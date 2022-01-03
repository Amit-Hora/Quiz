package leetcode.easy;

public class Q1528_shuffle_string {
	
	
	 public String restoreString(String s, int[] indices) {
	     
		 char[] tmpc = new char[indices.length];
		 int i=0;
		 for(int ind:indices) {
			 tmpc[ind] = s.charAt(i);
			 
			 i++;
		 }
		 
		 return new String(tmpc);
	    }

}

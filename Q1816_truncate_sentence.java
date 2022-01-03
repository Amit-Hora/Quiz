package leetcode.easy;

public class Q1816_truncate_sentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public String truncateSentence(String s, int k) {
		 
		 int nextSpace = 0;
		 while(k>0) {
			 k--;
			 nextSpace = s.indexOf(" ",nextSpace+1);
			 
			 if(nextSpace ==-1) {
				 nextSpace = s.length();
				 break;
			 }
		 }
		 
		 return s.substring(0,nextSpace);
	    }
	 
	 

}

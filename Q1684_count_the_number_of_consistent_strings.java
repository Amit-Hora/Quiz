package leetcode.easy;

public class Q1684_count_the_number_of_consistent_strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	}
	 public int countConsistentStrings(String allowed, String[] words) {
		 
		 int[] ascii = new int[27];
		 for(char c : allowed.toCharArray()) {
			 ascii[(int)c-97] = 1; 
		 }
		 int counter =words.length;
		 
		 for(String w:words) {
			 for(char c:w.toCharArray()) {
				if(ascii[(int) c - 97] !=1) {
					counter--;
					break;
				}
				 
			 }
		 }
		 
		 return counter;
	 }
}

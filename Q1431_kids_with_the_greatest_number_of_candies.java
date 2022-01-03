package leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class Q1431_kids_with_the_greatest_number_of_candies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	 public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
		 
		 int maxCandies =0;
		 for( int candie : candies) {
			 maxCandies = Math.max(maxCandies, candie);
		 }
		 
		 List<Boolean> result = new ArrayList<>();
		 
		 for(int candie:candies) {
			 
			 result.add(candie+extraCandies>=maxCandies);
			 
		 }
	        
		 return result;
	    }
	 
}

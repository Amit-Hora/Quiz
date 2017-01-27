package com.codefriend.quiz;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Codility {

	
	public static void main(String[] args) {
		
		final int[] A = {1,4,7,0,0};
/*		int[] sortedIndices = IntStream.range(0, strArr.length)
		                .boxed().sorted((i, j) -> strArr[i]-strArr[j] )
		                .mapToInt(ele -> ele).toArray();*/
		
		
		List<Integer> sortedlist = Arrays.stream(A).boxed().collect(Collectors.toList());
		 Collections.sort(sortedlist);
		 List<Integer> original = Arrays.stream(A).boxed().collect(Collectors.toList());
		 
		 int max=0;
		 
		 for(int i=0;i<sortedlist.size()-1;i++){
			
			 int a=original.indexOf(sortedlist.get(i));
//			 original.remove(sortedlist.get(i));
			 original.set(original.indexOf(sortedlist.get(i)),null);
			 int b=original.indexOf(sortedlist.get(i+1));
					 
			 int diff=Math.abs(a-b);
			 if(max<diff){
				 max=diff;
			 }
		 }
		 
		 System.out.println(max);

		
		
	}
}

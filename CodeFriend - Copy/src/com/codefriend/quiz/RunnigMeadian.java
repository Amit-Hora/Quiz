package com.codefriend.quiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class RunnigMeadian {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	     int n = sc.nextInt();
	     ArrayList<Integer> sortedN=new ArrayList<>();
	     
	     for(int i=0;i<n;i++){
	    	 sortedN.add(sc.nextInt());
//	    	 Arrays.sort(sortedN);
	    	 Collections.sort(sortedN);
	    	 //even
	    	 int sortednSize=sortedN.size();
	    	 if(sortednSize%2==0){
	    		 int location=sortednSize/2;
	    		 int location1=location+1;
	    		 System.out.println(((double)(sortedN.get(location-1)+sortedN.get(location1-1))/2));
	    	 }
	    	 else if(sortednSize==1){
	    		 System.out.println((double)(sortedN.get(0)));
	    	 }
	    	 else{
	    		 double location=Math.ceil((double)sortednSize/2);
	    		 System.out.println((double)((sortedN.get((int)location-1))));
	    	 }
	    	 
	     }
	}
}

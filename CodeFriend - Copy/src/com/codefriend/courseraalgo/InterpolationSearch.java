package com.codefriend.courseraalgo;

public class InterpolationSearch {

	public static void main(String[] args) {
		
		int arr[]={10,12,13,16,18,19,20,21,22,23,24,33,35,42,47};
		
		int x=19;
		int lo=0,hi=arr.length-1;
		int pos=0;
		boolean found=false;
		while(lo<=hi && x>=arr[lo] && x<=arr[hi]){
			
			 pos=lo+((x-arr[lo])*(hi-lo))/(arr[hi]-arr[lo]);
//			System.out.println(pos);
			 if(arr[pos]==x){
//				 System.out.println(pos);
				 found=true;
				 break;
			 }
			 
			 else if(arr[pos] < x){
				 
				 lo = pos+1;
			 }
			 else{
				 hi = pos-1;
			 }
			 
	}
		
		if(found){
			System.out.println(pos);
		}
		
		
		
	}
}

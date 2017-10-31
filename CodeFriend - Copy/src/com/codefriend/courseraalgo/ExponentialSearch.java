package com.codefriend.courseraalgo;

public class ExponentialSearch {

	public static void main(String[] args) {
		int sortedArray[]={
				0,1,1,2,3,5,8,13,21,34,55,89,144,233,377,610	
			};
			
			int length=sortedArray.length;
			boolean found=false;
			int step=(int) Math.floor(Math.sqrt(length));
			int prev=0;
			int x=55;
			int i=0;
			while(sortedArray[Math.min(step,length)-1]<x){
				
				prev=step;
				step+=(int) Math.floor(Math.sqrt(length));
				// you kept on jumping and now you have come to an end of array or even might be larger than that
				// still all the elements are less , means the element to be searched is not present
				if(prev >= length){
					found=false;
					break;
				}
				
			}
			
			// binary search
			
			int medium=0;
			int index=0,size=0,middle=0,start=prev,end=Math.min(step,length);
			while(start!=end){
				
				middle=(end-start)/2;
				index=middle-1+start;
				
				if(x<sortedArray[index]){
					// upper
					end=index-1;
				}
				else if(x==sortedArray[index]){
					start=index;
					found=true;
					i=index;
					break;
				}
				else
				{
					// lower
					start=index+1;
				
				
			}
			}
			
			
			if(sortedArray[prev] ==x){
				found =true;
				i=prev;
			}
			
			if(found){
				System.out.println(i);
			}
			else{
				System.out.println(-1);
			}	
	}
}

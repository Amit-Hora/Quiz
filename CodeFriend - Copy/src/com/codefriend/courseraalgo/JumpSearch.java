package com.codefriend.courseraalgo;

public class JumpSearch {

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
		
		while(sortedArray[prev]<x){
			
			prev++;
			// if we reached the next block or end of array, the one we found above 
			// means the element is not present
			if(prev==Math.min(step,length)){
				found =false;
				break;
			}
		}
		
		if(sortedArray[prev] ==x){
			found =true;
			i=prev;
		}
		
		if(found){
			System.out.println(prev);
		}
		else{
			System.out.println(-1);
		}
		
		
		
	}
	
}

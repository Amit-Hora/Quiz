package com.codefriend.courseraalgo;

public class BinarySearch {

	public static void main(String args[]){
		int arr[]={2,5,8,12,16,23,38,56,72,91};
		int index=0,size=0,middle=0,start=0,end=0,element=2;
		start=0; // beginning
		end= arr.length; // length, end of array
		
		while(start!=end){
			
			middle=(end-start)/2;
			index=middle-1+start;
			
			if(element<arr[index]){
				// upper
				end=index-1;
			}
			else if(element==arr[index]){
				start=index;
				break;
			}
			else
			{
				// lower
				start=index+1;
			
			
		}
		}
		
		if(element == arr[start]){
			System.out.println(start);
		}else{
			System.out.println(-1);
		}
		
	}
}

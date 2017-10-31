package com.codefriend.quiz;

import java.util.Scanner;

public class ArraysLeftRotation {

	
	 public static int[] arrayLeftRotation(int[] a, int n, int k) {
	 
		 int[] newa=new int[n];
		 
		 for(int i=0;i<a.length;i++){
			 int oldIndex=i;
			 int newIndex=0;
			 if(oldIndex-k<0){
				 newIndex=n-Math.abs(oldIndex-k);
				 
			 }else{
				 newIndex=oldIndex-k;
			 }
			 newa[newIndex]=a[oldIndex];
		 }
		 return newa;
	    }
	 
	 
	
	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int k = in.nextInt();
	        int a[] = new int[n];
	        for(int a_i=0; a_i < n; a_i++){
	            a[a_i] = in.nextInt();
	        }
	      
	        int[] output = new int[n];
	        output = arrayLeftRotation(a, n, k);
	        for(int i = 0; i < n; i++)
	            System.out.print(output[i] + " ");
	      
	        System.out.println();
	      
	    }
}

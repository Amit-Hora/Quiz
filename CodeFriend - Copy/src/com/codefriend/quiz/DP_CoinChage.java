package com.codefriend.quiz;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class DP_CoinChage {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		String[] mnValues=scan.nextLine().split(" ");
		int n=Integer.parseInt(mnValues[0]);
		int m=Integer.parseInt(mnValues[1]);
		
		String distinctValues[]=scan.nextLine().split(" ");
		int[] mValues=new int[m];
		
		for(int i=0;i<m;i++){
			mValues[i]=Integer.parseInt(distinctValues[i]);
		}
		
		
		Arrays.sort(mValues);
		
		int[] sValues=IntStream.range(0,n+1).toArray();
		
		long [][] matrics=new long[m][n+1];
		
		for(int k=0;k<m;k++){
			
			for(int l=0;l<n+1;l++){
				
				if(l==0){
					matrics[k][l]=1;
				}
				else{
					
					if(k==0){
						if(sValues[l]%mValues[k]==0){
							matrics[k][l]=1l;		
						}
						else{
							matrics[k][l]=0l;
						}
					}
					else{
						
						if(mValues[k]>sValues[l]){
							matrics[k][l]=matrics[k-1][l];
						}
						else{
							matrics[k][l]=matrics[k-1][l]+matrics[k][l-mValues[k]];
						}
					}
				}
				
			}
		}
		
		for(int k=0;k<matrics.length;k++){
			for(int l=0;l<matrics[k].length;l++){
				System.out.print(matrics[k][l]+"	");
			}
			System.out.println();
		}
		
		System.out.println(matrics[m-1][n]);
		
		
	}
}

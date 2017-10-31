package com.codefriend.hackerrank.graph;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.*;
public class CoinChange {

   

		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int m = in.nextInt();
	        long[] c = new long[m];
			
			
			long[] mValues=new long[m];
			
		 for(int c_i=0; c_i < m; c_i++){
			 mValues[c_i] = in.nextLong();
	        }
			
			
			Arrays.sort(mValues);
			
			int[] sValues=IntStream.range(0,n+1).toArray();
			
			long [][] matrics=new long[m][n+1];
			
			for(int k=0;k<m;k++){
				
				for(int l=0;l<n+1;l++){
					
					if(l==0){
						matrics[k][l]=0;
					}
					else{
						
						if(k==0){
							if(sValues[l]%mValues[k]==0){
								matrics[k][l]=sValues[l]/mValues[k];		
							}
							else{
								matrics[k][l]=0l;
							}
						}
						else{	
							
							if(mValues[k]>sValues[l]){
								matrics[k][l]=matrics[k-1][l];
							}
							else if(mValues[k]==sValues[l]){
								matrics[k][l]=1;
							}
							else{
								
								if(matrics[k-1][l]==0){
									matrics[k][l]=matrics[k][(int) (l-mValues[k])]+1;
								}else{
									if(matrics[k][(int) (l-mValues[k])]!=0)
									matrics[k][l]=Math.min(matrics[k][(int) (l-mValues[k])]+1, matrics[k-1][l]);
									else
										matrics[k][l]=matrics[k-1][l];
								}
								
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

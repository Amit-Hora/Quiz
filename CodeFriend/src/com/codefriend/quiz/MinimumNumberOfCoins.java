package com.codefriend.quiz;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class MinimumNumberOfCoins {

	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		int change=Integer.parseInt(scan.nextLine());
		int[] b=IntStream.range(0, change+1).toArray();
		
		
		int uniquedenomination=Integer.parseInt(scan.nextLine());
		
		String denominations[]=scan.nextLine().split(" ");
		
		int[] denominationsValue=new int[uniquedenomination];
		
		for(int i=0;i<uniquedenomination;i++){
			denominationsValue[i]=Integer.parseInt(denominations[i]);
		}
		Arrays.sort(denominationsValue);
		
		
		int m=uniquedenomination;	
		int n= change;
		
		int matrics[][]=new int[m][n+1];
		
		for(int k=0;k<m;k++){
			
			for(int l=0;l<n+1;l++){
				
				if(b[l]==0){
					matrics[k][l]=0;
				}
				
				
				else {
					if(k==0){
						if(b[l]% denominationsValue[k]==0){
							
							matrics[k][l]= b[l]/ denominationsValue[k];
						}
						else{
							matrics[k][l]=0;
							
						}	
					}else{
						
						if(l>=denominationsValue[k]){
							matrics[k][l]=Math.min(matrics[k-1][l], 1+matrics[k][l-(denominationsValue[k])]);
						}
						else{
							matrics[k][l]=matrics[k-1][l];
							
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
		
		
		
		int count=0;
		
		for(int k=0;k<m;k++){
			
			if(matrics[k][change]!=0)
				count++;
		}
		System.out.println(count);
		
		
	}
}

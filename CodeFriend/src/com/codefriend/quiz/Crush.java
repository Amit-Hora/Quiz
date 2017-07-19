package com.codefriend.quiz;

import java.util.Scanner;

public class Crush {

	
	public static void main(String[] args) {
	
		long max=0l;
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int m=scan.nextInt();
		long ar[]=new long[n];
	while(m>0){
		
		int a=scan.nextInt();
		int b=scan.nextInt();
		long toAdd=scan.nextLong();
		m--;
		for(int k=a;k<=b;k++){
			ar[k-1]=ar[k-1]+toAdd;
			max=Math.max(max, ar[k-1]);
		}
		
		
	}
	System.out.println(max);
		
		
	}
}

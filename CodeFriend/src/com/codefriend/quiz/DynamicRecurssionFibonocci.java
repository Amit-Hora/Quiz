package com.codefriend.quiz;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DynamicRecurssionFibonocci {

	public static Map<Integer,Integer> mapOffb=new HashMap<>();
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		int n=Integer.parseInt(scan.nextLine());
	
	/*	while(i<n-1){
			
			i++;
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
			
		}*/
//		n=n-1;
		
//		while(n>=1){
		long t1=System.currentTimeMillis();
		System.out.println(getFBSeries(n));
		System.out.println((System.currentTimeMillis()-t1)/1000);
//		n--;
//		}
//		System.out.println(1);
	}
	
	public static int getFBSeries(int n){
		if(n==1){
			return 1;
		}
		if(n==0){
			return 0;
		}
		else{
			int a=0,b=0;
			/*if(DynamicRecurssionFibonocci.mapOffb.containsKey(n-1)){
				a=DynamicRecurssionFibonocci.mapOffb.get(n-1);
			}else{
				a=getFBSeries(n-1);
				DynamicRecurssionFibonocci.mapOffb.put(n-1, a);
			}
			
			if(DynamicRecurssionFibonocci.mapOffb.containsKey(n-2)){
				b=DynamicRecurssionFibonocci.mapOffb.get(n-2);
			}else{
				b=getFBSeries(n-2);
				DynamicRecurssionFibonocci.mapOffb.put(n-2, b);
			}*/
			
			a=getFBSeries(n-1);
			b=getFBSeries(n-2);
		return (a+b);		
	}

	}
}
package com.codefriend.geekforgeeks;

public class LegendresFormula {

	public int fact(int n){
		if(n ==1 ){
			return 1;
		}
		else
			return n * fact(n -1);
		
	}
	
	public int x(int x,int n, int i){
		
		if(n/x <= 0 ){
			return 0;
		}
		return (n/x)+ x((int)Math.pow(x, i),n,++i);
		
	}
	int lp(int n,int p){
		int ans =0;
		while( n > 0){
			n/=p;
			ans+=n;
		}
		return ans;
	}
	public static void main(String[] args) {
		LegendresFormula l = new LegendresFormula();
		int n=7;
		int p = 3;
		
		System.out.println(l.fact(7));
		System.out.println(l.x(3,10,2));
		System.out.println(l.lp(10, 3));
	}
}

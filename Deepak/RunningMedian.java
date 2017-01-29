package com.test.practice;
import java.util.*;
public class RunningMedian {
public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);
	int size = sc.nextInt();
	int[] list = new int[size];
	for(int i=0;i<size;i++)
	{
		list[i]=sc.nextInt();
		Arrays.sort(list,0,i+1);
       if(i==0)
       {
    	   System.out.println((float)list[i]);
       }
       else if((i+1)%2==1)
       {
    	   int midx = (i+1)/2;
    	   System.out.println((float)list[midx]);
       }
       else {
           int idx1= (i+1)/2;
    	   int idx2 = idx1-1;
    	   System.out.println((float)(list[idx1]+list[idx2])/2);
       }
	}
}
}

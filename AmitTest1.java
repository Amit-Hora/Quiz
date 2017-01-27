package com.test.practice;
import java.util.*;
public class AmitTest1 {
public static void main(String[]args) throws Exception 
{
	Scanner sc = new Scanner(System.in);
	int size = sc.nextInt();
	int[] numList = new int[size]; 
	for(int i=0;i<size;i++)
	{
		numList[i]=sc.nextInt();
	}
	Set<Integer> s = new TreeSet<Integer>();
	for(int i=0;i<size;i++)
	{
		int val = (i>numList[i])?i:numList[i];
		s.add(val);
	}
	Iterator itr = s.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
}
}

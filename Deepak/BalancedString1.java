package com.test.practice;
import java.util.*;
public class BalancedString1 {
public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);
	String str = sc.nextLine();
	Stack s = new Stack();
	int cnt=0;
	for(int i=0;i<str.length();i++)
	{
		char ch = str.charAt(i);
		switch(ch)
		{
		case '(' : s.push(ch);
                   break;
		case ')' : s.push(ch);
		           break;
		default : break;          
		}
	}
	while(!s.isEmpty())
	{
		char ch = (char) s.pop();
		if(ch=='(')
		{
			cnt++;
		}
		else
		{
			cnt--;
		}
	}
	if(cnt ==0)
	{
		System.out.println("Balanced");
	}
	else
	{
		System.out.println("Unalanced");
	}
}

}


package com.test.practice;
import java.util.*;
public class BalanceString {
public static void main(String[]args)
{
	Scanner sc = new Scanner(System.in);
	String str = sc.nextLine();
	Stack s = new Stack();
	for(int i=0;i<str.length();i++)
	{
		char ch = str.charAt(i);
		switch(ch)
		{
		case '(' : s.push(ch);
                   break;
		case ')' : s.pop();
		           break;
		default : break;          
		}
	}
	if(s.isEmpty())
	{
		System.out.println("Balanced");
	}
	else
	{
		System.out.println("Unalanced");
	}
}

}

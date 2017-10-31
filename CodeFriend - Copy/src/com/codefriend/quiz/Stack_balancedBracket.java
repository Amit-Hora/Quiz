package com.codefriend.quiz;

import java.util.Scanner;
import java.util.Stack;

public class Stack_balancedBracket {

	public static boolean isBalanced(String expression) {

		Stack<Character> stackOfBrackets = new Stack<>();
		boolean isBalanced=true;
		for (char element : expression.toCharArray()) {
			if(isBalanced){
			switch (element) {
			case '{': {
				stackOfBrackets.push(element);
				break;
			}
			case '(': {
				stackOfBrackets.push(element);
				break;
			}
			case '[': {
				stackOfBrackets.push(element);
				break;
			}

			case '}': {
				if(!stackOfBrackets.isEmpty()){
				char popped=stackOfBrackets.pop();
				if(popped!=/*element*/'{'){
					isBalanced=false;
				}
				}
				else{
					isBalanced=false;
				}
				break;
			}
			case ')': {
				if(!stackOfBrackets.isEmpty()){
				char popped=stackOfBrackets.pop();
				if(popped!=/*element*/'('){
					isBalanced=false;
				}
				
				}else{
					isBalanced=false;
				}
				break;
			}
			case ']': {
				if(!stackOfBrackets.isEmpty()){
				char popped=stackOfBrackets.pop();
				if(popped!=/*element*/'['){
					isBalanced=false;
				}
				}else{
					isBalanced=false;
				}
				break;
			}

			}
		}
		}
		if(isBalanced){
			if(!stackOfBrackets.isEmpty()){
				isBalanced=false;
			}
		}
		return isBalanced;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			String expression = in.next();
			System.out.println((isBalanced(expression)) ? "YES" : "NO");
		}
	}
}




/*YES
YES
NO
NO
NO
NO
YES
YES
YES
NO
YES
YES
YES
YES
NO
NO*/
package com.codefriend.geekforgeeks;

import java.util.Scanner;

public class EuclideanGCD {

	int gcd(int a, int b) {

		if (a == 0)
			return b;
		else
			return gcd(b % a, a);
	}

	int gcdExtended(int a, int b, int x, int y) {

		// Base Case
		if (a == 0) {
			x = 0;
			y = 1;
			return b;
		}

		int x1 = 1, y1 = 1; // To store results of recursive call
		
		int gcdv = gcdExtended(b % a, a, x1, y1);

		// Update x and y using results of recursive
		// call
		x = y1 - (b / a) * x1;
		y = x1;
		if(b%a ==0)
		System.out.println(x + ",," + y+",,"+a);
		return gcdv;
	}

	public static void main(String[] args) {

		EuclideanGCD e = new EuclideanGCD();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first number");
		int a = scanner.nextInt();
		System.out.println("Enter the second number");
		int b = scanner.nextInt();

		int tmp = 0;
		if (a > b) {
			tmp = a;
			a = b;
			b = tmp;
		}

		System.out.println(e.gcd(a, b));
		System.out.println(e.gcdExtended(a, b, 1, 1));

	}

}

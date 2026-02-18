package com.omrbranch.runner;

import java.util.Scanner;

public class Sample {

	private void palindromeNumberCheck() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter the number: ");
		int userInput = sc.nextInt();
		int orginalNum = userInput;
		int reversedNum = 0;

		while (userInput != 0) {
			int digit = userInput % 10;
			reversedNum = reversedNum * 10 + digit;
			userInput = userInput / 10;
		}

		if (orginalNum == reversedNum) {
			System.out.println(orginalNum + " is a palindrome");
		} else {
			System.out.println(orginalNum + " is not a palindrome");
		}

		sc.close();

	}
	
	private void primeCheck() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter the number: ");
		int num = sc.nextInt();
		boolean isPrime = true;

		if (num <= 1) {
			isPrime = false;
		} else {
			for (int i = 2; i < num / 2; i++) {
				if (num % i == 0) {
					isPrime = false;
					break;
				}
			}
		}

		if (isPrime) {
			System.out.println(num + " is prime");
		} else {
			System.out.println(num + " is not prime");
		}
	}
	
	private void fibonacciSeries() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter the number: ");
		int num = sc.nextInt();
		
		int a=0, b=1;
		for(int i=0; i<=num; i++) {
			System.out.println(a+" ");
			
			int c = a+b;
			b=a;
			a=c;
		}
	}

	public static void main(String[] args) {

		Sample s = new Sample();
//		s.palindromeNumberCheck();
//		s.primeCheck();
		s.fibonacciSeries();

	}

}

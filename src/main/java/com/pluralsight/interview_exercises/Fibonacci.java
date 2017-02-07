package com.pluralsight.interview_exercises;

import java.math.BigDecimal;

public class Fibonacci {
	public void print(int n) {
		if (n == 0){
			return;
		}
		if (n == 1){
			System.out.println("1");
			return;
		}
		if (n >= 2){
			System.out.println("1");
			System.out.println("2");
			printFibonacciForN(n);
		}
	}

	private void printFibonacciForN(int n) {
		BigDecimal fPart1 = new BigDecimal("1");
		BigDecimal fPart2 = new BigDecimal("2");
		BigDecimal fibonacci = new BigDecimal("0");
		for (int i=2; i<n; i++){
			fibonacci = fPart1.add(fPart2);
			fPart1 = fPart2;
			fPart2 = fibonacci;
			System.out.println(fibonacci.toString());
		}
	}
}

package com.pluralsight.interview_exercises;

public class PrimeNumberChecker {
	public boolean isPrime(Integer number){
		if (number == null || number == 0){
			return false;
		}
		if (number == 1 || number == 2){
			return true;
		}
		return checkIsPrime(number);
	}

	private boolean checkIsPrime(Integer number) {
		for (int i=2; i<9; i++){
			if (number%i == 0 && i != number){
				return false;
			}
		}
		return true;
	}
}

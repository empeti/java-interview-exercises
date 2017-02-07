package com.pluralsight.interview_exercises;

public class FizzBuzz {
	public void printNumbers(Integer n){
		for (Integer i=1; i<n; i++){
			System.out.println(getNumberString(i));
		}
	}

	private String getNumberString(Integer i) {
		StringBuilder numberString = new StringBuilder("");
		if (i%3 == 0){
			numberString.append("Fizz");
		}
		if (i%5 == 0){
			numberString.append("Buzz");
		}
		if (numberString.length() == 0){
			numberString.append(i.toString());
		}
		return numberString.toString();
	}
}
